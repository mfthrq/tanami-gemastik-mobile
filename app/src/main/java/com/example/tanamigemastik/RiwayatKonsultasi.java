package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class RiwayatKonsultasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_konsultasi);

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


    }
}