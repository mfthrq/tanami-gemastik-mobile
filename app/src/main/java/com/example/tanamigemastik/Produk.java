package com.example.tanamigemastik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Produk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);

        // Initialize the back button
        ImageView tombolBack = findViewById(R.id.tombol_back);
        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the previous screen
                onBackPressed();
            }
        });

        TextView lihatDetailKategori = findViewById(R.id.lihat_detail_kategori);

        lihatDetailKategori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to KategoriProduk activity
                Intent intent = new Intent(Produk.this, KategoriProduk.class);
                startActivity(intent);
            }
        });

        ImageView kategoriTanaman = findViewById(R.id.kategori_tanaman);

        kategoriTanaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to KategoriProduk activity
                Intent intent = new Intent(Produk.this, KategoriProduk.class);
                startActivity(intent);
            }
        });

        // Referensi ke ImageView
        ImageView imageView = findViewById(R.id.produk_benih_tomat);

        // Set OnClickListener untuk ImageView
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk pindah ke DetailProduk
                Intent intent = new Intent(Produk.this, DetailProduk.class);
                startActivity(intent);
            }
        });

        // ==== NAVBAR ====
        LinearLayout homeLayout = findViewById(R.id.home);
        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Produk.this, Homepage1.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout todoLayout = findViewById(R.id.todo);
        todoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Produk.this, Todo.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout konsulLayout = findViewById(R.id.konsultasi);
        konsulLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Produk.this, Konsultasi.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        LinearLayout produkLayout = findViewById(R.id.produk);
        produkLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka halaman Todo
                Intent intent = new Intent(Produk.this, Produk.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
    }
}