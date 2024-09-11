package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Konsultasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsultasi);
        // Initialize the back button
        ImageView tombolBack = findViewById(R.id.tombol_back);
        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the previous screen
                onBackPressed();
            }
        });

        // In your current activity (e.g., MainActivity.java)
        TextView lihatSemuaKonsultasi = findViewById(R.id.lihat_semua_konsultasi);

        lihatSemuaKonsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to RiwayatKonsultasi activity
                Intent intent = new Intent(Konsultasi.this, RiwayatKonsultasi.class);
                startActivity(intent);
            }
        });


        // ==== NAVBAR ====
        LinearLayout homeLayout = findViewById(R.id.home);
        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Konsultasi.this, Homepage1.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout todoLayout = findViewById(R.id.todo);
        todoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Konsultasi.this, Todo.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout konsulLayout = findViewById(R.id.konsultasi);
        konsulLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Konsultasi.this, Konsultasi.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout produkLayout = findViewById(R.id.produk);
        produkLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Konsultasi.this, Produk.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        // Inisialisasi ImageView
        ImageView sliderKonsultasi1 = findViewById(R.id.slider_konsultasi_1);

        // Set OnClickListener
        sliderKonsultasi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke OnboardingKonsultasi
                Intent intent = new Intent(Konsultasi.this, OnboardingKonsultasi.class);
                startActivity(intent);
            }
        });
    }
}