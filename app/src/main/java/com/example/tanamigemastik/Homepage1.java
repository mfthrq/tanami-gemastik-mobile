package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Homepage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage1);

        TextView tanamiCoinTextView = findViewById(R.id.tanami_coin);
        tanamiCoinTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman TanamiCoin
                Intent intent = new Intent(Homepage1.this, TanamiCoin.class);
                startActivity(intent);
            }
        });

        // ==== NAVBAR ====
        LinearLayout homeLayout = findViewById(R.id.home);
        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Homepage1.this, Homepage1.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout todoLayout = findViewById(R.id.todo);
        todoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Homepage1.this, Todo.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout konsulLayout = findViewById(R.id.konsultasi);
        konsulLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Homepage1.this, Konsultasi.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout produkLayout = findViewById(R.id.produk);
        produkLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Homepage1.this, Produk.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
    }
}