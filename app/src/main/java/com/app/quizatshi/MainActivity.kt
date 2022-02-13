package com.app.quizatshi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

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
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.User_Name, et_name.text.toString())
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