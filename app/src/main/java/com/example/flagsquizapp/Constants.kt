package com.example.flagsquizapp

object Constants{

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this fruit ?",
            R.drawable.pomegranate,

            "Banana",
            "Chickoo",
            "Pomegranate",
            "Berry",
            3
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What is the name of this fruit ?",
            R.drawable.black_grapes,
            "Berry",
            "Mango",
            "Cherry",
            "Black Grapes",
            4
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What is the name of this fruit ?",
            R.drawable.tomato,
            "Tomato",
            "Berry",
            "Mango",
            "Chickoo",
            1
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What is the name of this fruit ?",
            R.drawable.mango,
            "Orange",
            "Mango",
            "Banana",
            "Pomegranate",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What is the name of this fruit ?",
            R.drawable.orange,
            "Berry",
            "Mango",
            "Banana",
            "Orange",
            4
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What is the name of this fruit ?",
            R.drawable.papaya,
            "Berry",
            "Papaya",
            "Mango",
            "Pine Apple",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this fruit ?",
            R.drawable.passion,
            "Mango",
            "Passion",
            "Banana",
            "Chickoo",
            2

        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "What is the name of this fruit ?",
            R.drawable.kkiwi,
            "Orange",
            "Papaya",
            "Kiwi",
            "Pomegranate",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "What is the name of this fruit ?",
            R.drawable.pomegranate,
            "StrawBerry",
            "Pomegranate",
            "Banana",
            "Berry",
            2
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "What is the name of this fruit ?",
            R.drawable.green_apple,

            "Orange",
            "Green Apple",
            "Cherry",
            "Berry",
            2
        )
        questionList.add(que10)

        val que11 = Question(
            11,
            "What is the name of this fruit ?",
            R.drawable.green_grapes,

            "Banana",
            "Chickoo",
            "Grapes",
            "Berry",
            3
        )
        questionList.add(que11)

        val que12 = Question(
            12,
            "What is the name of this fruit ?",
            R.drawable.cherry,
            "Berry",
            "Mango",
            "Cherry",
            "Kiwi",
            3
        )
        questionList.add(que12)

        val que13 = Question(
            13,
            "What is the name of this fruit ?",
            R.drawable.banana,
            "Banana",
            "Berry",
            "Mango",
            "Chickoo",
            1
        )
        questionList.add(que13)

        val que14 = Question(
            14,
            "What is the name of this fruit ?",
            R.drawable.green_grapes,
            "Orange",
            "Green Grapes",
            "Banana",
            "Pomegranate",
            2
        )
        questionList.add(que14)

        val que15 = Question(
            15,
            "What is the name of this fruit ?",
            R.drawable.orange,
            "Berry",
            "Mango",
            "Banana",
            "Orange",
            4
        )
        questionList.add(que15)

        val que16 = Question(
            16,
            "What is the name of this fruit ?",
            R.drawable.papaya,
            "Berry",
            "Papaya",
            "Mango",
            "Pine Apple",
            2
        )
        questionList.add(que16)

        val que17 = Question(
            17,
            "What is the name of this fruit ?",
            R.drawable.green_apple,
            "Mango",
            "Apple",
            "Banana",
            "Chickoo",
            2

        )
        questionList.add(que17)

        val que18 = Question(
            18,
            "What is the name of this fruit ?",
            R.drawable.kkiwi,
            "Orange",
            "Papaya",
            "Kiwi",
            "Pomegranate",
            3
        )
        questionList.add(que18)

        val que19 = Question(
            19,
            "What is the name of this fruit ?",
            R.drawable.pomegranate,
            "StrawBerry",
            "Pomegranate",
            "Banana",
            "Berry",
            2
        )
        questionList.add(que19)

        val que20 = Question(
            20,
            "What is the name of this fruit ?",
            R.drawable.strawberry,

            "Orange",
            "Strawberry",
            "Cherry",
            "Berry",
            2
        )
        questionList.add(que20)



        return questionList
    }
}