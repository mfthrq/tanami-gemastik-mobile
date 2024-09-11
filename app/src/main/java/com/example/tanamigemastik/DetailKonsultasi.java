package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class DetailKonsultasi extends AppCompatActivity {
    private RadioButton radioFase1, radioFase2, radioFase3, radioFase4;
    private AppCompatButton btnLanjutkan;
    private int checkedColor = Color.parseColor("#40A858");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_konsultasi);

        // Initialize the back button
        ImageView tombolBack = findViewById(R.id.tombol_back);
        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the previous screen
                onBackPressed();
            }
        });

        // In your current activity (e.g., MainActivity.java)
        ImageView ppKonselor = findViewById(R.id.pp_konselor_detail);
        ppKonselor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to ProfileKonselor activity
                Intent intent = new Intent(DetailKonsultasi.this, ProfileKonselor.class);
                startActivity(intent);
            }
        });

        // Inisialisasi tombol
        btnLanjutkan = findViewById(R.id.btn_lanjutkan);

        // Set OnClickListener untuk tombol
        btnLanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuka Pembayaran Activity
                Intent intent = new Intent(DetailKonsultasi.this, Pembayaran.class);
                startActivity(intent);
            }
        });

        // Inisialisasi RadioButton
        radioFase1 = findViewById(R.id.radio_fase1);
        radioFase2 = findViewById(R.id.radio_fase2);
        radioFase3 = findViewById(R.id.radio_fase3);
        radioFase4 = findViewById(R.id.radio_fase4);

        // Set warna untuk RadioButton
        setRadioButtonColor(radioFase1);
        setRadioButtonColor(radioFase2);
        setRadioButtonColor(radioFase3);
        setRadioButtonColor(radioFase4);

        // Set OnClickListener untuk setiap RadioButton
        View.OnClickListener radioClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Uncheck semua RadioButton
                uncheckAllRadioButtons();

                // Check RadioButton yang diklik
                ((RadioButton) v).setChecked(true);
            }
        };

        radioFase1.setOnClickListener(radioClickListener);
        radioFase2.setOnClickListener(radioClickListener);
        radioFase3.setOnClickListener(radioClickListener);
        radioFase4.setOnClickListener(radioClickListener);
    }

    private void setRadioButtonColor(RadioButton radioButton) {
        ColorStateList colorStateList = ColorStateList.valueOf(checkedColor);
        radioButton.setButtonTintList(colorStateList);
    }

    private void uncheckAllRadioButtons() {
        radioFase1.setChecked(false);
        radioFase2.setChecked(false);
        radioFase3.setChecked(false);
        radioFase4.setChecked(false);
    }
}