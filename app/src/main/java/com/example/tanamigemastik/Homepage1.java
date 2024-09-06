package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Homepage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage1);

        // Inisialisasi TextView
        TextView tanamiCoinTextView = findViewById(R.id.tanami_coin);

        // Set OnClickListener pada TextView
        tanamiCoinTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman TanamiCoin
                Intent intent = new Intent(Homepage1.this, TanamiCoin.class);
                startActivity(intent);
            }
        });
    }
}