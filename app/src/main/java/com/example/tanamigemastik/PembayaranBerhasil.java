package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PembayaranBerhasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran_berhasil);

        AppCompatButton btnLihatJadwal = findViewById(R.id.btn_lihat_jadwal);
        btnLihatJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the RiwayatKonsultasi activity
                Intent intent = new Intent(PembayaranBerhasil.this, RiwayatKonsultasi.class);
                startActivity(intent);
            }
        });
    }
}