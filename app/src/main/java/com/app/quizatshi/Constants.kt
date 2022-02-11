package com.app.quizatshi

object Constants {

    const val User_Name: String = "user_name"
    const val Total_Questions: String = "total_questions"
    const val Correct_Answers: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que10)

        val que11 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_albania,
            "Algeria", "Albania",
            "Andorra", "Armenia", 2
        )
        questionsList.add(que11)

        val que12 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_azerbaijan,
            "Benin", "Bolivia",
            "Belarus", "Azerbaijan", 4
        )
        questionsList.add(que12)

        val que13 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_bangladesh,
            "Côte d'Ivoire", "Cameroon",
            "Bangladesh", "Burundi", 3
        )
        questionsList.add(que13)

        val que14 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_chile,
            "Chile", "Comoros",
            "Cuba", "Palestine", 1
        )
        questionsList.add(que14)

        val que15 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_cyprus,
            "Sudan", "Costa Rica",
            "Cyprus", "Denmark", 3
        )
        questionsList.add(que15)

        val que16 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_croatia,
            "Russia", "Croatia",
            "Costa Rica", "Estonia", 2
        )
        questionsList.add(que16)

        val que17 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_the_gambia,
            "Ghana", "Gambia",
            "Equatorial Guinea", "Eritrea", 2
        )
        questionsList.add(que17)

        val que18 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_greece,
            "Greece", "Georgia",
            "Estonia", "Finland", 1
        )
        questionsList.add(que18)

        val que19 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_france,
            "Russia", "Netherland",
            "Ireland", "France", 4
        )
        questionsList.add(que19)

        val que20 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_ireland,
            "Ireland", "Jordan",
            "Kiribati", "India", 1
        )
        questionsList.add(que20)

        val que21 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_jamaica,
            "Kenya", "Latvia",
            "Jamaica", "Lesotho", 3
        )
        questionsList.add(que21)

///////////////////////////////////////////////////////////////////////////////////////////////////////

        val que22 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_japan,
            "South Korea", "Japan",
            "Italy", "Liberia", 2
        )
        questionsList.add(que22)

        val que23 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_nepal,
            "Saint Lucia", "North Macedonia",
            "Nepal", "Palestine", 3
        )
        questionsList.add(que23)

        val que24 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_tuvalu,
            "Turkmenistan", "Tanzania",
            "United Kingdom", "Tuvalu", 4
        )
        questionsList.add(que24)

        val que25 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_thailand,
            "Thailand", "Costa Rica",
            "Philippines", "San Marino", 1
        )
        questionsList.add(que25)

        val que26 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_qatar,
            "Kuwait", "Qatar",
            "Switzerland", "Tuvalu", 2
        )
        questionsList.add(que26)

        val que27 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_poland,
            "Poland", "Indonesia",
            "Peru", "Romania", 1
        )
        questionsList.add(que27)

        val que28 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_portugal,
            "Nauru", "Samoa",
            "Oman", "Portugal", 4
        )
        questionsList.add(que28)

        val que29 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_egypt,
            "Yemen", "Egypt",
            "Jordan", "Netherlands", 2
        )
        questionsList.add(que29)

        val que30 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_mauritania,
            "Mauritania", "Namibia",
            "Mali", "Madagascar", 1
        )
        questionsList.add(que30)

        val que31 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_mexico,
            "Hungary", "Italy",
            "Sudan", "Mexico", 4
        )
        questionsList.add(que31)

        val que32 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_iceland,
            "United Kingdom", "Finland",
            "Iceland", "Sweden", 3
        )
        questionsList.add(que32)

        val que33 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_syria,
            "Syria", "Palestine",
            "Egypt", "Iraq", 1
        )
        questionsList.add(que33)

        val que34 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_palestine,
            "Palestine", "Iraq",
            "Jordan", "Sudan", 1
        )
        questionsList.add(que34)

        val que35 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_singapore,
            "Chile", "Indonesia",
            "Poland", "Singapore", 4
        )
        questionsList.add(que35)

        val que36 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_china,
            "South Korea", "China",
            "Chad", "Vietnam", 2
        )
        questionsList.add(que36)

        val que37 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_vietnam,
            "Vietnam", "Russia",
            "Comoros", "China", 1
        )
        questionsList.add(que37)

        val que38 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_philippines,
            "Argentina", "Uruguay",
            "Philippines", "Honduras", 3
        )
        questionsList.add(que38)

        val que39 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_uruguay,
            "Uruguay", "Argentina",
            "Honduras", "Philippines", 1
        )
        questionsList.add(que39)

        val que40 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_haiti,
            "Gabon", "Belize",
            "Guinea-Bissau", "Haiti", 4
        )
        questionsList.add(que40)

        val que41 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_ecuador,
            "Ecuador", "Colombia",
            "Czechia", "Bolivia", 1
        )
        questionsList.add(que41)

        val que42 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_austria,
            "Armenia", "Denmark",
            "Austria", "Andorra", 3
        )
        questionsList.add(que42)

        val que43 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_laos,
            "South Korea", "Sri Lanka",
            "Thailand", "Laos", 4
        )
        questionsList.add(que43)

        val que44 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_tanzania,
            "Togo", "Tanzania",
            "Uganda", "Rwanda", 2
        )
        questionsList.add(que44)

        val que45 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_senegal,
            "Mali", "Kenya",
            "senegal", "Zimbabwe", 3
        )
        questionsList.add(que45)

        val que46 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_zimbabwe,
            "Zimbabwe", "Uganda",
            "Sudan", "Mali", 1
        )
        questionsList.add(que46)

        val que47 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_uganda,
            "Uganda", "Zimbabwe",
            "Rwanda", "Togo", 1
        )
        questionsList.add(que47)

        val que48 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_rwanda,
            "Kazakhstan", "Rwanda",
            "Venezuela", "Serbia", 2
        )
        questionsList.add(que48)

        val que49 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_benin,
            "Zambia", "Trinidad and Tobago",
            "Sudan", "Benin", 4
        )
        questionsList.add(que49)

        val que50 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_turkey,
            "Tunisia", "Turkey",
            "Morocco", "Libya", 2
        )
        questionsList.add(que50)

        val que51 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_libya,
            "Libya", "Kenya",
            "Guinea", "Guyana", 1
        )
        questionsList.add(que51)

        val que52 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_guatemala,
            "Greece", "Guatemala",
            "Greece", "El Salvador", 2
        )
        questionsList.add(que52)

        val que53 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_dominican,
            "Egypt", "Dominican",
            "France", "Greece", 2
        )
        questionsList.add(que53)

        val que54 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_spain,
            "Belgium", "Germany",
            "Spain", "Monaco", 3
        )
        questionsList.add(que54)

        val que55 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kosovo,
            "Cyprus", "Kosovo",
            "Ecuador", "Estonia", 2
        )
        questionsList.add(que55)

        val que56 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_guyana,
            "Guyana", "Djibouti",
            "Eritrea", "Guinea-Bissau", 1
        )
        questionsList.add(que56)

        val que57 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_burundi,
            "Kiribati", "Indonesia",
            "Algeria", "Burundi", 4
        )
        questionsList.add(que57)

        val que58 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_algeria,
            "Algeria", "Jordan",
            "Algeria", "Bhutan", 3
        )
        questionsList.add(que58)

        val que59 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_morocco,
            "Guatemala", "Egypt",
            "Morocco", "Algeria", 3
        )
        questionsList.add(que59)

        val que60 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belarus,
            "Burundi", "Belarus",
            "Armenia", "Palestine", 2
        )
        questionsList.add(que60)

        val que61 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_bosnia_and_herzegovina,
            "Somalia", "Sweden",
            "Azerbaijan", "Bosnia and Herzegovina", 4
        )
        questionsList.add(que61)

        val que62 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_south_africa,
            "South Africa", "Sierra Leone",
            "Turkmenistan", "Nigeria", 1
        )
        questionsList.add(que62)

        val que63 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_nicaragua,
            "Turkmenistan", "Nicaragua",
            "Panama", "Paraguay", 2
        )
        questionsList.add(que63)

        val que64 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_paraguay,
            "Netherlands", "France",
            "Paraguay", "Georgia", 3
        )
        questionsList.add(que64)

        val que65 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_georgia,
            "Greece", "Albania",
            "Georgia", "Germany", 3
        )
        questionsList.add(que65)
///
        val que66 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que66)

        val que67 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que67)

        val que68 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que68)

        val que69 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que69)

        val que70 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que70)

        val que71 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que71)

        val que72 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que72)

        val que73 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que73)

        val que74 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que74)

        val que75 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que75)

        val que76 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que76)

        val que77 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que77)

        val que78 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que78)

        val que79 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que79)

        val que80 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que80)

        val que81 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que81)

        val que82 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que82)

        val que83 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que83)

        val que84 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que84)

        val que85 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que85)

        val que86 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que86)

        val que87 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que87)

        val que88 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que88)

        val que89 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que89)

        val que90 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que90)

        val que91 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que91)

        val que92 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que92)

        val que93 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que93)

        val que94 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que94)

        val que95 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que95)

        val que96 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que96)

        val que97 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que97)

        val que98 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que98)

        val que99 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que99)

        val que100 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que100)


        val returnedQuestionsList = ArrayList<Question>()
        var h = HashSet<Int>()

        returnedQuestionsList.add(questionsList[14])

        while(returnedQuestionsList.size < 10){
            val index = (0..99).random()
            if(!h.contains(index)){
                h.add(index)
                returnedQuestionsList.add(questionsList[index])
            }
        }

        return returnedQuestionsList
    }
}