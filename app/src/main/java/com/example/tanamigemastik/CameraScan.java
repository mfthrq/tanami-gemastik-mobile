package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

public class CameraScan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_scan);

        // Delay 1 detik sebelum redirect ke CekHasilTanaman
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Buat intent untuk berpindah ke CekHasilTanaman
                Intent intent = new Intent(CameraScan.this, CekHasilTanaman.class);
                startActivity(intent);
                // Selesaikan activity saat ini agar tidak kembali ke halaman ini
                finish();
            }
        }, 2000); // 1000 ms = 1 detik
    }
}
