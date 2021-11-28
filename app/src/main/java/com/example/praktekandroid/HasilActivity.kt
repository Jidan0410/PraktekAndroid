package com.example.praktekandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_activty)

        val nama = intent.getStringExtra("Nama")
        val email = intent.getStringExtra("Email")
        val nohp = intent.getStringExtra("NoHandphone")
        val tgllahir = intent.getStringExtra("TanggalLahir")
        val jmlhmk = intent.getIntExtra("JumlahMataKuliah", 0)

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val nohpTextView = findViewById<TextView>(R.id.nohpTextView)
        val tgllahirTextView = findViewById<TextView>(R.id.tgllahirTextView)
        val jmlhmkTextView = findViewById<TextView>(R.id.jmlhmkTextView)

        namaTextView.setText(nama)
        emailTextView.setText(email)
        nohpTextView.setText(nohp)
        tgllahirTextView.setText(tgllahir)
        jmlhmkTextView.setText(jmlhmk.toString())
    }
}