package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class Ulasan extends AppCompatActivity {
    private RelativeLayout overlayLayout;
    private ScrollView scrollView;
    private View backgroundOverlay; // Add this line
    private RadioButton radioFase1, radioFase2, radioFase3, radioFase4;
    private int checkedColor = Color.parseColor("#40A858");
    private Button selectedButton = null;
    private Button selectedTimeButton;
    private Button selectedDayButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulasan);

        // Initialize the back button
        ImageView tombolBack = findViewById(R.id.tombol_back);
        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the previous screen
                onBackPressed();
            }
        });

        // Initialize the overlay layout and scroll view
        backgroundOverlay = findViewById(R.id.background_overlay);
        overlayLayout = findViewById(R.id.overlay_layout);

        AppCompatButton btntulisreview = findViewById(R.id.btn_tulis_review);
        AppCompatButton btnkirimreview = findViewById(R.id.btn_kirim_review);
        // Set up the click listener for the background overlay to hide the overlay
        backgroundOverlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideOverlayAnimation();
            }
        });

        // Set up the button to show the overlay when clicked
        btntulisreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOverlayAnimation();
                backgroundOverlay.setVisibility(View.VISIBLE); // Make sure the background overlay is visible
            }
        });

        btnkirimreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideOverlayAnimation();
            }
        });
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