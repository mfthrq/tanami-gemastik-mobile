package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Memulai activity Onboarding
        Intent intent = new Intent(MainActivity.this, Onboarding.class);
        startActivity(intent);
        finish(); // Menutup MainActivity setelah pindah ke Onboarding
    }
}
