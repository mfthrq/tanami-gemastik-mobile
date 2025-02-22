package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class RiwayatKonsultasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_konsultasi);

        // Initialize the back button
        ImageView tombolBack = findViewById(R.id.tombol_back);
        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the previous screen
                onBackPressed();
            }
        });

        // Find the LinearLayout by its ID
        LinearLayout llSelesai = findViewById(R.id.ll_selesai);

        // Set an OnClickListener for the LinearLayout
        llSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the RiwayatKonsultasiSelesai activity
                Intent intent = new Intent(RiwayatKonsultasi.this, RiwayatKonsultasiSelesai.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        // Temukan Button dari layout
        AppCompatButton mulaiKonsultasiButton = findViewById(R.id.mulai_konsultasi);

        // Set OnClickListener untuk Button
        mulaiKonsultasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke ChatKonsultasi.java saat Button diklik
                Intent intent = new Intent(RiwayatKonsultasi.this, KonsultasiChat.class);
                startActivity(intent);
            }
        });

        AppCompatButton mulaiKonsultasilivecall = findViewById(R.id.mulai_konsultasi_live_call);

        // Set an OnClickListener to navigate to KonsultasiLiveCall
        mulaiKonsultasilivecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RiwayatKonsultasi.this, KonsultasiLiveCall.class);
                startActivity(intent);
            }
        });

    }
}