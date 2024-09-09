package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class RiwayatKonsultasiSelesai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_konsultasi_selesai);

        // Find the LinearLayout by its ID
        LinearLayout llBerlangsung = findViewById(R.id.ll_berlangsung);

        // Set an OnClickListener for the LinearLayout
        llBerlangsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the RiwayatKonsultasiSelesai activity
                Intent intent = new Intent(RiwayatKonsultasiSelesai.this, RiwayatKonsultasi.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

    }
}