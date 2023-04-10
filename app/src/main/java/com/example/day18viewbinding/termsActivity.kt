package com.example.day18viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class termsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms)

        supportActionBar?.hide()


    }
}