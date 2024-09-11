package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Todo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        // Initialize the back button
        ImageView tombolBack = findViewById(R.id.tombol_back);
        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the previous screen
                onBackPressed();
            }
        });

        // Set OnClickListener pada tombol
        AppCompatButton btnTambahTodo = findViewById(R.id.btn_tambah_todo);
        btnTambahTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman TambahTodo
                Intent intent = new Intent(Todo.this, TambahTodo.class);
                startActivity(intent);
            }
        });

        ImageView progressTodo1 = findViewById(R.id.progress_todo_1);
        progressTodo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to DetailTodo activity
                Intent intent = new Intent(Todo.this, DetailTodo.class);
                startActivity(intent);
            }
        });


        // ==== NAVBAR ====
        LinearLayout homeLayout = findViewById(R.id.home);
        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Todo.this, Homepage1.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout todoLayout = findViewById(R.id.todo);
        todoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Todo.this, Todo.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout konsulLayout = findViewById(R.id.konsultasi);
        konsulLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Todo.this, Konsultasi.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout produkLayout = findViewById(R.id.produk);
        produkLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Todo.this, Produk.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
    }
}