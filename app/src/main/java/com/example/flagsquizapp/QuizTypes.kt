package com.example.flagsquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_types.*

class QuizTypes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_types)


        tv_type_flowers.setOnClickListener {
            val intent = Intent(this, Flowers::class.java)
            startActivity(intent)
            finish()
        }

        tv_type_fruits.setOnClickListener {
            val intent = Intent(this, QuizQuestionAcivity::class.java)
            startActivity(intent)
            finish()
        }


        tv_type_vegetables.setOnClickListener {
            val intent = Intent(this, Vegetables::class.java)
            startActivity(intent)
            finish()
        }

        tv_type_spices.setOnClickListener {
            val intent = Intent(this, Spices::class.java)
            startActivity(intent)
            finish()
        }

        tv_type_sports.setOnClickListener {
            val intent = Intent(this, Sports::class.java)
            startActivity(intent)
            finish()
        }

        tv_type_capitals.setOnClickListener {
            val intent = Intent(this, Capitals::class.java)
            startActivity(intent)
            finish()
        }

        tv_type_wonders.setOnClickListener {
            val intent = Intent(this, Wonders::class.java)
            startActivity(intent)
            finish()
        }

        tv_type_symbols.setOnClickListener {
            val intent = Intent(this, Symbols::class.java)
            startActivity(intent)
            finish()
        }
    }
}