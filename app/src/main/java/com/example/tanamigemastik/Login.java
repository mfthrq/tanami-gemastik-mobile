package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView masukDisiniTextView = findViewById(R.id.daftar_disini);
        masukDisiniTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke Login activity
                Intent intent = new Intent(Login.this, Daftar.class);
                startActivity(intent);
            }
        });

        // Inisialisasi AppCompatButton untuk login
        AppCompatButton btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke Homepage1 activity
                Intent intent = new Intent(Login.this, Homepage1.class);
                startActivity(intent);
            }
        });
    }
}