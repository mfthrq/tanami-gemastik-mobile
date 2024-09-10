package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailTodo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_todo);

        // Find ImageView by ID
        ImageView cekTanamanRealTime = findViewById(R.id.cek_tanaman_real_time);

        // Set an OnClickListener for the ImageView
        cekTanamanRealTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to CekHasilTanaman activity
                Intent intent = new Intent(DetailTodo.this, CekHasilTanaman.class);
                startActivity(intent);
            }
        });
    }
}