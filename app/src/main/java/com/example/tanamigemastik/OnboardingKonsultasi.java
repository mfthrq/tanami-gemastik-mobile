package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OnboardingKonsultasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_konsultasi);

        // Initialize the back button
        ImageView tombolBack = findViewById(R.id.tombol_back);
        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the previous screen
                onBackPressed();
            }
        });

        // Inisialisasi AppCompatButton
        AppCompatButton btnMulaiKonsultasi = findViewById(R.id.btn_mulai_konsultasi);

        // Set OnClickListener
        btnMulaiKonsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke PaketKonsultasi
                Intent intent = new Intent(OnboardingKonsultasi.this, PaketKonsultasi.class);
                startActivity(intent);
            }
        });
    }
}