package com.Fika.crud_berita

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailBerita : AppCompatActivity() {
    private lateinit var imgBerita: ImageView
    private lateinit var txtJudulBerita: TextView
    private lateinit var txtIsiBerita: TextView
    private lateinit var txtTanggalBerita: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_berita)

        // Hubungkan dengan View
        imgBerita = findViewById(R.id.imgBerita)
        txtJudulBerita = findViewById(R.id.judulBerita)
        txtIsiBerita = findViewById(R.id.isiBerita)
        txtTanggalBerita = findViewById(R.id.tanggalBerita)

        val gambar = intent.getStringExtra("gambar")
        Glide.with(this).load("http://192.168.10.1/beritaDb/gambar_berita/"
                + gambar).centerCrop()
            .into(imgBerita)
        txtJudulBerita.text = intent.getStringExtra("judul")
        txtIsiBerita.text = intent.getStringExtra("isi")
        txtTanggalBerita.text = intent.getStringExtra("tanggal")

    }
}