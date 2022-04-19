package com.example.aplikasiresponsi1524

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract

class RecoveryActivity : AppCompatActivity() {

    private lateinit var btnPindah2 = Button
    private lateinit var btnSendEmail = Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recovery_recovery)

        btnPindah2 = findViewById(R.id.btnPindah2)
        btnSendEmail = findViewById(R.id.btnSendEmail)

    }
}