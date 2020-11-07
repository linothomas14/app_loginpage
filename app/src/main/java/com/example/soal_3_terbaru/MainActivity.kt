package com.example.soal_3_terbaru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //inisialiasi komponen
        var username = findViewById<EditText>(R.id.etUsername)
        var password = findViewById<EditText>(R.id.etPassword)
        var btnLogin = findViewById<Button>(R.id.btnLogin)
        var tvInfo = findViewById<TextView>(R.id.tvInfo)
        var counter:Int = 5

        btnLogin.setOnClickListener {
            if ((username.text.toString().equals("admin123")) && (password.text.toString().equals("12345678"))) {
                val intent = Intent(this, login_sukses::class.java)
                startActivity(intent)
            } else {
                counter--
                tvInfo.setText("Tersisa $counter percobaan lagi")

                if(counter == 0) btnLogin.isEnabled = false
            }

        }
    }
}

