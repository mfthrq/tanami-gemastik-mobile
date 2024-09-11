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

public class JadwalKonsultasi extends AppCompatActivity {

    private RadioButton radioFase1, radioFase2, radioFase3, radioFase4;
    private int checkedColor = Color.parseColor("#40A858");
    private AppCompatButton btnDetailKonsultasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_konsultasi);

        // In your current activity (e.g., MainActivity.java)
        ImageView ppKonselor = findViewById(R.id.pp_konselor);

        ppKonselor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to ProfileKonselor activity
                Intent intent = new Intent(JadwalKonsultasi.this, ProfileKonselor.class);
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

        // Inisialisasi tombol
        btnDetailKonsultasi = findViewById(R.id.btn_detail_konsultasi);

        // Set OnClickListener untuk tombol
        btnDetailKonsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuka DetailKonsultasi Activity
                Intent intent = new Intent(JadwalKonsultasi.this, DetailKonsultasi.class);
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