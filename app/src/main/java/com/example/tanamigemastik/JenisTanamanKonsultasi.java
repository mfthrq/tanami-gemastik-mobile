package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class JenisTanamanKonsultasi extends AppCompatActivity {

    private RadioButton radioFase1, radioFase2, radioFase3, radioFase4;
    private int checkedColor = Color.parseColor("#40A858");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_tanaman_konsultasi);

        // Initialize the back button
        ImageView tombolBack = findViewById(R.id.tombol_back);
        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the previous screen
                onBackPressed();
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

        Button btnMulaiKonsultasi = findViewById(R.id.btn_mulai_konsultasi);
        btnMulaiKonsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke JadwalKonsultasi.java
                Intent intent = new Intent(JenisTanamanKonsultasi.this, JadwalKonsultasi.class);
                startActivity(intent);
            }
        });
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