package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Daftar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        TextView masukDisiniTextView = findViewById(R.id.masuk_disini);
        masukDisiniTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke Login activity
                Intent intent = new Intent(Daftar.this, Login.class);
                startActivity(intent);
            }
        });
    }
}