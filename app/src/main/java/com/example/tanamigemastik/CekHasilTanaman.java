package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class CekHasilTanaman extends AppCompatActivity {
    private RelativeLayout overlayLayout;
    private ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_hasil_tanaman);
        // Initialize the back button
        ImageView tombolBack = findViewById(R.id.tombol_back);
        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the previous screen
                onBackPressed();
            }
        });

        // Inisialisasi TextView
        TextView tvBatalkan = findViewById(R.id.tv_batalkan);

        // Set OnClickListener untuk TextView
        tvBatalkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke DetailTodo.java
                Intent intent = new Intent(CekHasilTanaman.this, DetailTodo.class);
                startActivity(intent);
            }
        });

        // Initialize the overlay layout and scroll view
        overlayLayout = findViewById(R.id.overlay_layout);
        scrollView = findViewById(R.id.scroll_view);
        LinearLayout closeButton = findViewById(R.id.button_tukar_3_coin);

        // Show the overlay with animation when the activity is opened
        showOverlayAnimation();

        // Show the overlay with animation when the activity is opened
        overlayLayout.post(new Runnable() {
            @Override
            public void run() {
                showOverlayAnimation();
            }
        });

        // Set up the close button to hide the overlay with animation
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideOverlayAnimation();
            }
        });

    }


    // Method to show the overlay with animation
    private void showOverlayAnimation() {
        overlayLayout.setVisibility(View.VISIBLE); // Make sure it's visible

        // Disable scroll while overlay is visible
        scrollView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        ObjectAnimator slideAnimator = ObjectAnimator.ofFloat(overlayLayout, "translationY", overlayLayout.getHeight(), 0f);
        slideAnimator.setDuration(500); // Duration 0.5 seconds
        slideAnimator.setInterpolator(new DecelerateInterpolator());
        slideAnimator.start();
    }

    // Method to hide the overlay with animation
    private void hideOverlayAnimation() {
        ObjectAnimator slideAnimator = ObjectAnimator.ofFloat(overlayLayout, "translationY", 0f, overlayLayout.getHeight());
        slideAnimator.setDuration(500); // Duration 0.5 seconds
        slideAnimator.setInterpolator(new DecelerateInterpolator());
        slideAnimator.start();

        slideAnimator.addListener(new android.animation.Animator.AnimatorListener() {
            @Override
            public void onAnimationEnd(android.animation.Animator animation) {
                overlayLayout.setVisibility(View.GONE);

                // Enable scroll after overlay is hidden
                scrollView.setOnTouchListener(null); // Remove the touch listener to re-enable scrolling
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