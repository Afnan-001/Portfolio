package com.example.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class startscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_startscreen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val sub_btn = findViewById<Button>(R.id.submit_btn)

        sub_btn.setOnClickListener{
            Submit(sub_btn)

        }





    }

    fun Submit(view: View) {
        val name = findViewById<TextInputEditText>(R.id.name_input)
        val get_name = name.text.toString()

        Toast.makeText(this, "Welcome $get_name", Toast.LENGTH_LONG).show()

        intent = Intent(this , MainActivity::class.java)
        startActivity(intent)
    }





}