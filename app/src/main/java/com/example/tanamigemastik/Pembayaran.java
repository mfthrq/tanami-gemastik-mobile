package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pembayaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        AppCompatButton btnPerbarui = findViewById(R.id.btn_perbarui);
        btnPerbarui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka PembayaranBerhasil activity
                    Intent intent = new Intent(Pembayaran.this, PembayaranBerhasil.class);
                startActivity(intent);
            }
        });
    }
}