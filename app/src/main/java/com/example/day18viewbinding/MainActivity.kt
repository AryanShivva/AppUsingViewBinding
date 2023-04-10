package com.example.day18viewbinding

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.day18viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //code for using binding
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button.setOnClickListener {
            if(binding.checkBox.isChecked){
              val openSignInActivity = Intent(this, termsActivity::class.java)
                startActivity(openSignInActivity)
            }else{
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "ACCEPT THE TERMS & CONDITIONS", Toast.LENGTH_SHORT).show()
            }
        }

    }
}