package com.app.quizatshi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()

        for (i in questionsList) {
            Log.e("Questions", i.question)
        }

        val currentPosition = 1 // Default and the first question position
        val question: Question? = questionsList[currentPosition - 1]
        val progressBar = findViewById<View>(R.id.progressBar) as ProgressBar
        progressBar.progress = currentPosition

        val tv_progress = findViewById<View>(R.id.tv_progress) as TextView
        tv_progress.text = "$currentPosition" + "/" + progressBar.getMax() // Setting up the progress text

        val tv_question = findViewById<View>(R.id.tv_question) as TextView
        tv_question.text = question!!.question

        val iv_image = findViewById<View>(R.id.iv_image) as ImageView
        iv_image.setImageResource(question.image)

        val tv_option_one = findViewById<View>(R.id.tv_option_one) as TextView
        tv_option_one.text = question.optionOne

        val tv_option_two = findViewById<View>(R.id.tv_option_two) as TextView
        tv_option_two.text = question.optionTwo

        val tv_option_three = findViewById<View>(R.id.tv_option_three) as TextView
        tv_option_three.text = question.optionThree

        val tv_option_four = findViewById<View>(R.id.tv_option_four) as TextView
        tv_option_four.text = question.optionFour
    }
}