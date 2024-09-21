package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PaketKonsultasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_konsultasi);

        // Initialize the back button
        ImageView tombolBack = findViewById(R.id.tombol_back);
        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the previous screen
                onBackPressed();
            }
        });

        // Inisialisasi ImageView untuk paket konsultasi chat
        ImageView paketKonsultasiChat = findViewById(R.id.paket_konsultasi_chat);

        // Inisialisasi ImageView untuk paket konsultasi live call
        ImageView paketKonsultasiLivecall = findViewById(R.id.paket_konsultasi_livecall);

        // Set OnClickListener untuk paket konsultasi chat
        paketKonsultasiChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke JenisTanamanKonsultasi
                Intent intent = new Intent(PaketKonsultasi.this, JenisTanamanKonsultasiGratis.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener untuk paket konsultasi live call
        paketKonsultasiLivecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke JenisTanamanKonsultasi
                Intent intent = new Intent(PaketKonsultasi.this, JenisTanamanKonsultasi.class);
                startActivity(intent);
            }
        });
    }
}