package com.example.quizapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {
    private val progressBar : ProgressBar = findViewById(R.id.progressBar)
    private val tvProgress : TextView = findViewById(R.id.tv_progress)
    private val tvQuestion : TextView = findViewById(R.id.tv_question)
    private val ivImage : ImageView = findViewById(R.id.iv_image)
    private val tvOptionOne : TextView = findViewById(R.id.tv_option_one)
    private val tvOptionTwo : TextView = findViewById(R.id.tv_option_two)
    private val tvOptionThree : TextView = findViewById(R.id.tv_option_three)
    private val tvOptionFour : TextView = findViewById(R.id.tv_option_four)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()
        val currentPosition = 1
        val question: Question = questionsList[currentPosition - 1]//this gets the actual index of the values in the list


        progressBar.progress = currentPosition
        tvProgress.text = "$currentPosition" + "/" +progressBar.max

        tvQuestion.text = question.question
        ivImage.setImageResource(question.image)
        tvOptionOne.text = question.optionOne
        tvOptionTwo.text = question.optionTwo
        tvOptionThree.text = question.optionThree
        tvOptionFour.text = question.optionFour

    }
}