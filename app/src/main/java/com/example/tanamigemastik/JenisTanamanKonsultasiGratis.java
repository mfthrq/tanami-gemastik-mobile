package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class JenisTanamanKonsultasiGratis extends AppCompatActivity {
    private RelativeLayout overlayLayout;
    private ScrollView scrollView;
    private View backgroundOverlay; // Add this line
    private RadioButton radioFase1, radioFase2, radioFase3, radioFase4;
    private int checkedColor = Color.parseColor("#40A858");
    private Button selectedButton = null;
    private Button selectedTimeButton;
    private Button selectedDayButton;

    private void setUpButton(final Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reset previously selected time button
                if (selectedTimeButton != null) {
                    selectedTimeButton.setBackgroundResource(R.drawable.background_transparent_round); // Default background
                    ((AppCompatButton) selectedTimeButton).setTextColor(getResources().getColor(R.color.green)); // Default text color
                }

                // Set the clicked time button as selected
                button.setBackgroundResource(R.drawable.background_green_round); // Background when pressed
                ((AppCompatButton) button).setTextColor(getResources().getColor(R.color.white)); // Text color when pressed

                // Update the selected time button reference
                selectedTimeButton = button;
            }
        });
    }
    private void setUpButtonHari(final Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reset previously selected day button
                if (selectedDayButton != null) {
                    selectedDayButton.setBackgroundResource(R.drawable.background_transparent_round); // Default background
                    ((AppCompatButton) selectedDayButton).setTextColor(getResources().getColor(R.color.green)); // Default text color
                }

                // Set the clicked day button as selected
                button.setBackgroundResource(R.drawable.background_green_round); // Background when pressed
                ((AppCompatButton) button).setTextColor(getResources().getColor(R.color.white)); // Text color when pressed

                // Update the selected day button reference
                selectedDayButton = button;
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_tanaman_konsultasi_gratis);

        // Inisialisasi RadioButton
        radioFase1 = findViewById(R.id.radio_fase1);
        radioFase2 = findViewById(R.id.radio_fase2);
        radioFase3 = findViewById(R.id.radio_fase3);
        radioFase4 = findViewById(R.id.radio_fase4);

        // Set warna untuk RadioButton
        setRadioButtonColor(radioFase1);
        setRadioButtonColor(radioFase2);
        setRadioButtonColor(radioFase3);
        setRadioButtonColor(radioFase4);

        // Set OnClickListener untuk setiap RadioButton
        View.OnClickListener radioClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Uncheck semua RadioButton
                uncheckAllRadioButtons();

                // Check RadioButton yang diklik
                ((RadioButton) v).setChecked(true);
            }
        };

        radioFase1.setOnClickListener(radioClickListener);
        radioFase2.setOnClickListener(radioClickListener);
        radioFase3.setOnClickListener(radioClickListener);
        radioFase4.setOnClickListener(radioClickListener);

        // Initialize the overlay layout and scroll view
        backgroundOverlay = findViewById(R.id.background_overlay);
        overlayLayout = findViewById(R.id.overlay_layout);
        AppCompatButton scheduleButton = findViewById(R.id.btn_atur_jadwal);

        // Set up the click listener for the background overlay to hide the overlay
        backgroundOverlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideOverlayAnimation();
            }
        });

        // Set up the button to show the overlay when clicked
        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOverlayAnimation();
                backgroundOverlay.setVisibility(View.VISIBLE); // Make sure the background overlay is visible
            }
        });

        // Initialize time buttons
        Button btn10_00_10_35 = findViewById(R.id.btn_10_00_10_35);
        Button btn11_00_11_35 = findViewById(R.id.btn_11_00_11_35);
        Button btn12_00_12_35 = findViewById(R.id.btn_12_00_12_35);
        Button btn13_00_13_35 = findViewById(R.id.btn_13_00_13_35);
        Button btn14_00_14_35 = findViewById(R.id.btn_14_00_14_35);
        Button btn15_00_15_35 = findViewById(R.id.btn_15_00_15_35);
        Button btn16_00_16_35 = findViewById(R.id.btn_16_00_16_35);
        Button btn17_00_17_35 = findViewById(R.id.btn_17_00_17_35);
        Button btn18_00_18_35 = findViewById(R.id.btn_18_00_18_35);

        // Initialize day buttons
        Button hari1 = findViewById(R.id.hari1);
        Button hari2 = findViewById(R.id.hari2);
        Button hari3 = findViewById(R.id.hari3);
        Button hari4 = findViewById(R.id.hari4);
        Button hari5 = findViewById(R.id.hari5);
        Button hari6 = findViewById(R.id.hari6);
        Button hari7 = findViewById(R.id.hari7);

        // Set up click listeners for time buttons
        setUpButton(btn10_00_10_35);
        setUpButton(btn11_00_11_35);
        setUpButton(btn12_00_12_35);
        setUpButton(btn13_00_13_35);
        setUpButton(btn14_00_14_35);
        setUpButton(btn15_00_15_35);
        setUpButton(btn16_00_16_35);
        setUpButton(btn17_00_17_35);
        setUpButton(btn18_00_18_35);

        // Set up click listeners for day buttons
        setUpButtonHari(hari1);
        setUpButtonHari(hari2);
        setUpButtonHari(hari3);
        setUpButtonHari(hari4);
        setUpButtonHari(hari5);
        setUpButtonHari(hari6);
        setUpButtonHari(hari7);

        // Inside onCreate method
        AppCompatButton buatjadwal = findViewById(R.id.btn_buat_jadwal);

        // Set up the button to navigate to RiwayatKonsultasi when clicked
        buatjadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JenisTanamanKonsultasiGratis.this, RiwayatKonsultasi.class);
                startActivity(intent);
            }
        });
    }

    private void setRadioButtonColor(RadioButton radioButton) {
        ColorStateList colorStateList = ColorStateList.valueOf(checkedColor);
        radioButton.setButtonTintList(colorStateList);
    }

    private void uncheckAllRadioButtons() {
        radioFase1.setChecked(false);
        radioFase2.setChecked(false);
        radioFase3.setChecked(false);
        radioFase4.setChecked(false);
    }

    // Method to show the overlay with animation
    private void showOverlayAnimation() {
        backgroundOverlay.setVisibility(View.VISIBLE); // Show the background overlay
        overlayLayout.setVisibility(View.VISIBLE); // Show the main overlay

        // Post the animation to ensure it's executed after the layout is drawn
        overlayLayout.post(new Runnable() {
            @Override
            public void run() {
                ObjectAnimator slideAnimator = ObjectAnimator.ofFloat(overlayLayout, "translationY", overlayLayout.getHeight(), 0f);
                slideAnimator.setDuration(500); // Duration 0.5 seconds
                slideAnimator.setInterpolator(new DecelerateInterpolator());
                slideAnimator.start();
            }
        });
    }

    // Method to hide the overlay with animation
    private void hideOverlayAnimation() {
        ObjectAnimator slideAnimator = ObjectAnimator.ofFloat(overlayLayout, "translationY", 0f, overlayLayout.getHeight());
        slideAnimator.setDuration(500);
        slideAnimator.setInterpolator(new DecelerateInterpolator());
        slideAnimator.start();

        slideAnimator.addListener(new android.animation.Animator.AnimatorListener() {
            @Override
            public void onAnimationEnd(android.animation.Animator animation) {
                overlayLayout.setVisibility(View.GONE);
                findViewById(R.id.background_overlay).setVisibility(View.GONE); // Hide the background overlay as well
            }

            @Override
            public void onAnimationStart(android.animation.Animator animation) {}
            @Override
            public void onAnimationCancel(android.animation.Animator animation) {}
            @Override
            public void onAnimationRepeat(android.animation.Animator animation) {}
        });
    }
}