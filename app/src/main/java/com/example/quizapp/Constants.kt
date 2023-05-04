package com.example.quizapp

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What Country does this flag belong to?",
            R.drawable.ic_uganda_flag,
            "United Kingdom",
            "Uganda",
            "Ukraine",
            "Uzbekistan",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What Country does this flag belong to?",
            R.drawable.ic_australia_flag,
            "Angola",
            "Argentina",
            "Armenia",
            "Australia",
            4
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What Country does this flag belong to?",
            R.drawable.ic_belgium_flag,
            "Brazil",
            "Burkina Faso",
            "Belgium",
            "Benin",
            3
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What Country does this flag belong to?",
            R.drawable.ic_denmark_flag,
            "Denmark",
            "Djibouti",
            "Dominican Republic",
            "Dominica",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What Country does this flag belong to?",
            R.drawable.ic_fiji_flag,
            "Finland",
            "France",
            "Fiji",
            "Russia",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What Country does this flag belong to?",
            R.drawable.ic_german_flag,
            "Ghana",
            "Greece",
            "Georgia",
            "German",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What Country does this flag belong to?",
            R.drawable.ic_india_flag,
            "India",
            "Iceland",
            "Israel",
            "Ireland",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What Country does this flag belong to?",
            R.drawable.ic_kuwait_flag,
            "Kenya",
            "Kiribati",
            "Kuwait",
            "kazakhstan",
            3
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What Country does this flag belong to?",
            R.drawable.ic_newzealand_flag,
            "North Korea",
            "Nepal",
            "Niger",
            "New Zealand",
            4
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What Country does this flag belong to?",
            R.drawable.ic_america_flag,
            "United Kingdom",
            "United States America",
            "Ukraine",
            "Uzbekistan",
            2
        )
        questionsList.add(que10)

        val que11 = Question(
            11,
            "What Country does this flag belong to?",
            R.drawable.ic_argentina_flag,
            "Andorra",
            "Antigua and Barbuda",
            "Argentina",
            "Albania",
            3
        )
        questionsList.add(que11)


        return questionsList
    }
}