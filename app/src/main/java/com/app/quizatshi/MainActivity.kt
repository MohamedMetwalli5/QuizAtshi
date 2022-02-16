package com.app.quizatshi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import java.util.logging.Level

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_dark_mode = findViewById<View>(R.id.btn_dark_mode)
        val btn_start = findViewById<View>(R.id.btn_start)
        val et_name = findViewById<View>(R.id.et_name) as EditText

        var dark_mode_on = 0

        btn_dark_mode.setOnClickListener{
            dark_mode_on++;
        }

        btn_start.setOnClickListener{
            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this, "Please, Enter your name", Toast.LENGTH_SHORT).show()
            }else{
                var Level = ChechLevel()
                if(Level.length > 0){
                    val intent = Intent(this, QuizQuestionsActivity::class.java)
                    intent.putExtra(Constants.User_Name, et_name.text.toString())
                    intent.putExtra(Constants.Level, Level)
                    if(dark_mode_on%2 == 0){
                        intent.putExtra(Constants.dark_mode, "0")
                    }else{
                        intent.putExtra(Constants.dark_mode, "1")
                    }
                    startActivity(intent)
                    finish()
                }
            }
        }


    }

    fun ChechLevel(): String{
        // The Levels Radio Buttons
        val NoviceRadioButton = findViewById<View>(R.id.NoviceRadioButton) as RadioButton
        val ProficientRadioButton = findViewById<View>(R.id.ProficientRadioButton) as RadioButton
        val ExpertRadioButton = findViewById<View>(R.id.ExpertRadioButton) as RadioButton

        if(NoviceRadioButton.isChecked()){
            return "Novice"
        }else if(ProficientRadioButton.isChecked()){
            return "Proficient"
        }else if(ExpertRadioButton.isChecked()){
            return "Expert"
        }else{
            Toast.makeText(this, "Please, Choose the level", Toast.LENGTH_SHORT).show()
            return ""
        }
    }
}