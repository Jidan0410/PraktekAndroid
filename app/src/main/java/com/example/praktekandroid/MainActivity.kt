package com.example.praktekandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

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
        val jkEditText = findViewById<EditText>(R.id.jkEditText)


        simpanButton.setOnClickListener {
            namaEditText.setText("")
            emailEditText.setText("")
            phoneEditText.setText("")
            tglEditText.setText("")
            jkEditText.setText("")
        }

        batalButton.setOnClickListener {
            finish()
        }
    }
}