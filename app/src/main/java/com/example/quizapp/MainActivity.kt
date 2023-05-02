package com.example.quizapp

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        //remove the status bar the long way
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.window.setFlags(
//            WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN
//        );
//
//        supportActionBar?.hide();
        setContentView(R.layout.activity_main);
        //short way to hide the status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()

        button = findViewById(R.id.btn_Start)
        var field : EditText = findViewById(R.id.et_name)

        //target the inside of the text field using it's id
        button.setOnClickListener{
            if(field.text.toString().isEmpty()){
                Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}