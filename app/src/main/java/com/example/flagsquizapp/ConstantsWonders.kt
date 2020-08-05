package com.example.flagsquizapp

object ConstantsWonders {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this wonder ?",
            R.drawable.tajmahal,
            "Taj Mahal,Agra,India",
            "Taj Mahal,Agartala ,India",
            "Kutubminar,Hyderabad,India",
            "BibiKamakhbara , UP,India",
            1

        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What is the name of this wonder ?",
            R.drawable.christthereddemer,
            "Christ The Redeemer,Washington,USA",
            "Statue of liberty,Rio de Janerio,Brazil",
            "Christ The Redeemer,London,Brazil",
            "Statue of liberty,Rio de Janerio,Brazil",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What is the name of this wonder ?",
            R.drawable.machupichu,
            "Machu Picchu,Cuzco Region,Peru",
            "Lining Tower ,Cuzco Region,Pakistan",
            "Machu Picchu,Cuzco Region,Jordan",
            "Machu Picchu,Cuzco Region,Srilanka",
            1

        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What is the name of this wonder ?",
            R.drawable.chichenitza,
            "Chichen Itza,Yucatan,Zimbabwe",
            "Chichen Itza,Yucatan,Malaysia",
            "Chichen Itza,Yucatan,Mongolia",
            "Chichen Itza,Yucatan,Mexico",
            4

        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What is the name of this wonder ?",
            R.drawable.colessum,
            "Lining Tower,Pisa,Jordan",
            "Colosseum,Rome,Italy",
            "DisneyLand,Pinuu,Russia",
            "Petra,Maan,Jordan",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What is the name of this wonder ?",
            R.drawable.wallofchina,
            "Great Wall,Japan",
            "Great Wall,Nepal",
            "Great Wall,Pakistan",
            "Great Wall,China",
            4
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this wonder ?",
            R.drawable.pyramidofgiza,
            "Pyramid of Gaza,Sudan",
            "Pyramid of Godra,Egypt",
            "Pyramid of Giza,Egypt",
            "Pyramid of Gadii,South Africa",
            3
        )
        questionList.add(que7)

        return questionList
    }
}