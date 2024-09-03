package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;

public class OnboardingLoginSignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_login_signup);

        // Menginisialisasi tombol
        AppCompatButton btnDaftar = findViewById(R.id.btn_daftar);
        AppCompatButton btnLogin = findViewById(R.id.btn_login);

        // Menambahkan listener klik pada tombol
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuka aktivitas Daftar
                Intent intent = new Intent(OnboardingLoginSignup.this, Daftar.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuka aktivitas Daftar
                Intent intent = new Intent(OnboardingLoginSignup.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
