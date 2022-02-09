package com.app.quizatshi

object Constants {

    fun getQuestions() :ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What is the country this flag belongs to?",
             R.drawable.ic_pg,
            "A",
            "B",
            "C",
            "D",
            1
        )
        questionsList.add(que1)
        return  questionsList
    }
}