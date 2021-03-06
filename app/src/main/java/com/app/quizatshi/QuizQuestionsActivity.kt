package com.app.quizatshi

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0

    private var mUserName: String? = null
    private var mDarkMode: String? = null
    private var mLevel: String? = null
    private var mNumberOfQuestions: String? = null

    /*
    private var TotalTime: Long = 10000
    val Timer = object : CountDownTimer(TotalTime, 1000) {
        override fun onTick(millisUntilFinished: Long) {
//            println(Integer.parseInt(intent.getStringExtra(Constants.Level)).toLong())
            if(millisUntilFinished/1000 == 0.toLong()){
                val intent = Intent(applicationContext, ResultActivity::class.java)
                intent.putExtra(Constants.User_Name, mUserName)
                intent.putExtra(Constants.Correct_Answers, mCorrectAnswers)
                intent.putExtra(Constants.Total_Questions, mQuestionsList!!.size)
                startActivity(intent)
                finish()
            }
        }

        override fun onFinish() {
            Toast.makeText(applicationContext, "Done!", Toast.LENGTH_SHORT).show()
        }
    }
    */

    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mUserName = intent.getStringExtra(Constants.User_Name)
        mDarkMode = intent.getStringExtra(Constants.dark_mode)
//        mLevel = intent.getStringExtra(Constants.Level)
        mNumberOfQuestions = intent.getStringExtra(Constants.NumberOfQuestions)

        val linear_layout = findViewById<View>(R.id.linear_layout) as LinearLayout
        val question_text = findViewById<View>(R.id.tv_question) as TextView
        val tv_progress = findViewById<View>(R.id.tv_progress) as TextView

        if(mDarkMode == "1"){
            linear_layout.setBackgroundColor(ContextCompat.getColor(this, R.color.dark_mode))
            question_text.setTextColor(Color.parseColor("#FFFFFF"))
            tv_progress.setTextColor(Color.parseColor("#FFFFFF"))
        }

        mQuestionsList = Constants.getQuestions(mLevel, mNumberOfQuestions)

        setQuestion()
/*
        if(mLevel.equals("120000")){
            this.TotalTime = 120000
            println("TotalTime = 120s")
        }else if(mLevel.equals("80000")){
            this.TotalTime = 80000
            println("TotalTime = 80s")
        }else{
            this.TotalTime = 30000
            println("---------->> " + mLevel)
        }

        Timer.start() // Starting the Counting down
*/
        val tv_option_one = findViewById<View>(R.id.tv_option_one) as TextView
        tv_option_one.setOnClickListener(this)

        val tv_option_two = findViewById<View>(R.id.tv_option_two) as TextView
        tv_option_two.setOnClickListener(this)

        val tv_option_three = findViewById<View>(R.id.tv_option_three) as TextView
        tv_option_three.setOnClickListener(this)

        val tv_option_four = findViewById<View>(R.id.tv_option_four) as TextView
        tv_option_four.setOnClickListener(this)

        val btn_submit = findViewById<View>(R.id.btn_submit) as Button
        btn_submit.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.tv_option_one -> {
                val tv_option_one = findViewById<View>(R.id.tv_option_one) as TextView
                selectedOptionView(tv_option_one, 1)
            }
            R.id.tv_option_two -> {
                val tv_option_two = findViewById<View>(R.id.tv_option_two) as TextView
                selectedOptionView(tv_option_two, 2)
            }
            R.id.tv_option_three -> {
                val tv_option_three = findViewById<View>(R.id.tv_option_three) as TextView
                selectedOptionView(tv_option_three, 3)
            }
            R.id.tv_option_four -> {
                val tv_option_four = findViewById<View>(R.id.tv_option_four) as TextView
                selectedOptionView(tv_option_four, 4)
            }
            R.id.btn_submit -> {
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++
                    when{
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }else ->{
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.User_Name, mUserName)
//                            intent.putExtra(Constants.Level, mLevel)///////
                            intent.putExtra(Constants.Correct_Answers, mCorrectAnswers)
                            intent.putExtra(Constants.Total_Questions, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }else{
                    val question = mQuestionsList?.get(mCurrentPosition-1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    val btn_submit = findViewById<View>(R.id.btn_submit) as Button
                    if(mCurrentPosition == mQuestionsList!!.size){
                        btn_submit.text = "FINISH"
                    }else{
                        btn_submit.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                    // Timer.cancel()
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 -> {
                val tv_option_one = findViewById<View>(R.id.tv_option_one) as TextView
                tv_option_one.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                val tv_option_two = findViewById<View>(R.id.tv_option_two) as TextView
                tv_option_two.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                val tv_option_three = findViewById<View>(R.id.tv_option_three) as TextView
                tv_option_three.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                val tv_option_four = findViewById<View>(R.id.tv_option_four) as TextView
                tv_option_four.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun setQuestion() {

        val question = mQuestionsList!!.get(mCurrentPosition - 1)

        defaultOptionsView()

        val btn_submit = findViewById<View>(R.id.btn_submit) as Button
        if(mCurrentPosition == mQuestionsList!!.size){
            btn_submit.text = "FINISH"
        }else{
            btn_submit.text = "SUBMIT"
        }

        val progressBar = findViewById<View>(R.id.progressBar) as ProgressBar
        progressBar.progress = mCurrentPosition

        val tv_progress = findViewById<View>(R.id.tv_progress) as TextView
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.getMax()

        val tv_question = findViewById<View>(R.id.tv_question) as TextView
        tv_question.text = question.question

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

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this@QuizQuestionsActivity,
            R.drawable.selected_option_border_bg
        )
    }

    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()

        val tv_option_one = findViewById<View>(R.id.tv_option_one) as TextView
        val tv_option_two = findViewById<View>(R.id.tv_option_two) as TextView
        val tv_option_three = findViewById<View>(R.id.tv_option_three) as TextView
        val tv_option_four = findViewById<View>(R.id.tv_option_four) as TextView
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this@QuizQuestionsActivity,
                R.drawable.default_option_border_bg
            )
        }
    }
}