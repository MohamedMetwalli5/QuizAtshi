package com.app.quizatshi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.User_Name)
        val tv_name = findViewById<View>(R.id.tv_name) as TextView
        tv_name.text = username

        val totalQuestions = intent.getIntExtra(Constants.Total_Questions, 0)
        val correctAnswer = intent.getIntExtra(Constants.Correct_Answers, 0)

        val tv_score = findViewById<View>(R.id.tv_score) as TextView
        tv_score.text = "Your Score is $correctAnswer out of $totalQuestions"

        val btn_finish = findViewById<View>(R.id.btn_finish) as Button
        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}