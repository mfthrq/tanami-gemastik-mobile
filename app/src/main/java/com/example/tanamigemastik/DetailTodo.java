package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailTodo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_todo);

        // In your current activity (e.g., MainActivity.java)
        ImageView konsultasiChat = findViewById(R.id.konsultasi_chat);
        ImageView konsultasiLiveCall = findViewById(R.id.konsultasi_live_call);

// Set click listener for konsultasi_chat
        konsultasiChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to JadwalKonsultasi activity
                Intent intent = new Intent(DetailTodo.this, JadwalKonsultasi.class);
                startActivity(intent);
            }
        });

// Set click listener for konsultasi_live_call
        konsultasiLiveCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to JadwalKonsultasi activity
                Intent intent = new Intent(DetailTodo.this, JadwalKonsultasi.class);
                startActivity(intent);
            }
        });


        TextView lihatDetailAlamiKesulitan = findViewById(R.id.lihat_detail_alami_kesulitan);

        lihatDetailAlamiKesulitan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to Konsultasi activity
                Intent intent = new Intent(DetailTodo.this, Konsultasi.class);
                startActivity(intent);
            }
        });


        // Find ImageView by ID
        ImageView cekTanamanRealTime = findViewById(R.id.cek_tanaman_real_time);

        // Set an OnClickListener for the ImageView
        cekTanamanRealTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to CekHasilTanaman activity
                Intent intent = new Intent(DetailTodo.this, CekHasilTanaman.class);
                startActivity(intent);
            }
        });
    }
}