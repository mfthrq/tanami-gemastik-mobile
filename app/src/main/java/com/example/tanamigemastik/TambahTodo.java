package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TambahTodo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_todo);

        // Set OnClickListener pada tombol buat todo
        AppCompatButton btnBuatTodo = findViewById(R.id.btn_buat_todo);
        btnBuatTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman DetailTodo
                Intent intent = new Intent(TambahTodo.this, DetailTodo.class);
                startActivity(intent);
            }
        });
    }
}