package com.example.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button_skills = findViewById<Button>(R.id.buttonSkills)

        button_skills.setOnClickListener{
            intent = Intent(this , Skills::class.java)
            startActivity(intent)
        }

        val button_education= findViewById<Button>(R.id.buttonEducation)

        button_education.setOnClickListener{
            intent = Intent(this , Skills::class.java)
            startActivity(intent)
        }

    }
}