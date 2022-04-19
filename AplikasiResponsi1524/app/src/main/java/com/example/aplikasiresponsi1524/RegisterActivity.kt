package com.example.aplikasiresponsi1524

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RegisterActivity : AppCompatActivity() {

    private lateinit var btnPindah1 = Button
    private lateinit var btnRegisterActivity = Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_main)

        btnPindah1 = findViewById(R.id.btnPindah1)
        btnRegisterActivity = findViewById(R.id.btnRegisteractivity)
        )
    }
}