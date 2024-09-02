package com.example.tanamigemastik;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class Onboarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        // Menunda selama 1 detik sebelum mengarahkan ke halaman OnboardingLoginSignup
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Mengarahkan ke halaman OnboardingLoginSignup
                Intent intent = new Intent(Onboarding.this, OnboardingLoginSignup.class);
                startActivity(intent);
                // Menutup activity saat ini
                finish();
            }
        }, 1000); // 1000 milidetik = 1 detik
    }
}
