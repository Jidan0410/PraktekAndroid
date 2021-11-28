package com.example.praktekandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val tglEditText = findViewById<EditText>(R.id.tglEditText)
        val jmlhmkEditText = findViewById<EditText>(R.id.jmlhmkEditText)

        simpanButton.setOnClickListener {
            Toast.makeText(this, "Hai",Toast.LENGTH_SHORT).show()

            val nama = namaEditText.text.toString()
            val email = emailEditText.text.toString()
            val nohp = phoneEditText.text.toString()
            val tgllahir = tglEditText.text.toString()
            val jmlhmk = jmlhmkEditText.text.toString().toInt()

            val intent = Intent ( this,HasilActivity::class.java)
            intent.putExtra("Nama", nama)
            intent.putExtra("Email", email)
            intent.putExtra("NoHandphone", nohp)
            intent.putExtra("TanggalLahir", tgllahir)
            intent.putExtra("JumlahMataKuliah", jmlhmk)
            startActivity(intent)
        }

        batalButton.setOnClickListener {
            finish()
        }
    }
}