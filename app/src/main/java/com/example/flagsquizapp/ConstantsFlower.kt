package com.example.flagsquizapp

object ConstantsFlower {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this flower ?",
            R.drawable.rose,
            "Mogra",
            "Rafflesia",
            "Rose",
            "Sunflower",
            3
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What is the name of this flower ?",
            R.drawable.mogra,
            "White Sunflower",
            "Mogra",
            "Rafflesia",
            "Butterflypea",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What is the name of this flower ?",
            R.drawable.brahmakamal,
            "Brahmakamal",
            "Butterflypea",
            "Raflesia",
            "Rose",
            1
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What is the name of this flower ?",
            R.drawable.butterflypea,
            "Butterflypea",
            "Brahmakamal",
            "Indian Ghost",
            "Daffodils",
            1
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What is the name of this flower ?",
            R.drawable.daffodil,
            "Brahmakamal",
            "Indian Ghost",
            "Daffodils",
            "Dahlia",
            3

        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What is the name of this flower ?",
            R.drawable.dahlia,
            "Brahmakamal",
            "Indian Ghost",
            "Daffodils",
            "Dahlia",
            4
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this flower ?",
            R.drawable.daisy,
            "Daisy",
            "Indian Ghost",
            "Daffodils",
            "Dahalia",
            1
        )
        questionList.add(que7)


        val que8 = Question(
            8,
            "What is the name of this flower ?",
            R.drawable.ghostplant,
            "Ghost Plant",
            "Indian Ghost",
            "Daffodils",
            "Dahalia",
            1
        )
        questionList.add(que8)


        val que9 = Question(
            9,
            "What is the name of this flower ?",
            R.drawable.hibiscus,
            "Hibiscus",
            "Indian Ghost",
            "Daffodils",
            "Daisy",
            1

        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "What is the name of this flower ?",
            R.drawable.jasmine,
            "Mogra",
            "Rose",
            "Lily",
            "Jasmine",
            4

        )
        questionList.add(que10)

        val que11 = Question(
            11,
            "What is the name of this flower ?",
            R.drawable.lavender,
            "Lavender",
            "Rose",
            "Lily",
            "Jasmine",
            1
        )
        questionList.add(que11)

        val que12 = Question(
            12,
            "What is the name of this flower ?",
            R.drawable.lily,
            "Lavender",
            "Rose",
            "Lily",
            "Jasmine",
            3

        )
        questionList.add(que12)


        val que13 = Question(
            13,
            "What is the name of this flower ?",
            R.drawable.lobelia,
            "Lavender",
            "Lily",
            "Lobelia",
            "Dahalia",
            3
        )
        questionList.add(que13)

        val que14 = Question(
            14,
            "What is the name of this flower ?",
            R.drawable.lotus,
            "Lotus",
            "Lily",
            "Rafflesia",
            "Cactus",
            1

        )
        questionList.add(que14)


        val que15 = Question(
            15,
            "What is the name of this flower ?",
            R.drawable.magnolia,
            "Mognolia",
            "Lily",
            "Rafflesia",
            "Cactus",
            1


        )
        questionList.add(que15)

        val que16 = Question(
            16,
            "What is the name of this flower ?",
            R.drawable.marigold,
            "Mognolia",
            "Marigold",
            "Lily",
            "Rafflesia",
            2
        )
        questionList.add(que16)

        val que17 = Question(
            17,
            "What is the name of this flower ?",
            R.drawable.mogra,
            "Mognolia",
            "Marigold",
            "Mogra",
            "Daisy",
            3
        )
        questionList.add(que17)

        val que18 = Question(
            18,
            "What is the name of this flower ?",
            R.drawable.nightbloomingcereus,
            "Mognolia",
            "Marigold",
            "Nightbloomingcereus",
            "Mogra",
            3
        )
        questionList.add(que18)


        val que19 = Question(
            19,
            "What is the name of this flower ?",
            R.drawable.orchids,
            "Orchids",
            "Sunflower",
            "Daisy",
            "Daffodils",
            1

        )
        questionList.add(que19)

        val que20 = Question(
            20,
            "What is the name of this flower ?",
            R.drawable.parijat,
            "Parijat",
            "Daffodils",
            "Mogra",
            "Rose",
            1
        )
        questionList.add(que20)


        val que21 = Question(
            21,
            "What is the name of this flower ?",
            R.drawable.plumeria,
            "Plumeria",
            "Parijat",
            "Daffodils",
            "Mogra",
            1
        )
        questionList.add(que21)

        val que22 = Question(
            22,
            "What is the name of this flower ?",
            R.drawable.rafflesia,
            "Plumeria",
            "Rafflesia",
            "Parijat",
            "Daffodils",
            2
        )
        questionList.add(que22)

        val que23 = Question(
            23,
            "What is the name of this flower ?",
            R.drawable.rajnigandha,
            "Rafflesia",
            "Rose",
            "Rajnigandha",
            "Daisy",
            3
        )
        questionList.add(que23)

        val que24 = Question(
            24,
            "What is the name of this flower ?",
            R.drawable.zinnia,
            "Zinnia",
            "Jasmine",
            "Lily",
            "Rose",
            1
        )
        questionList.add(que24)

        val que25 = Question(
            25,
            "What is the name of this flower ?",
            R.drawable.rafflesia,
            "Rafflesia",
            "Rose",
            "Laevendor",
            "Lily",
            1
        )
        questionList.add(que25)

        val que26 = Question(
            26,
            "What is the name of this flower ?",
            R.drawable.sunflower,
            "Sunflower",
            "Marigold",
            "Daisy",
            "Rafflesia",
            1
        )
        questionList.add(que26)

        val que27 = Question(
            27,
            "What is the name of this flower ?",
            R.drawable.tulip,
            "Daisy",
            "Lily",
            "Tulip",
            "Sunflower",
            3
        )
        questionList.add(que27)

        val que28 = Question(
            28,
            "What is the name of this flower ?",
            R.drawable.rose,
            "Rafflesia",
            "Rajingandha",
            "Daffodil",
            "Rose",
            4
        )
        questionList.add(que28)

        return questionList
    }
}

/*


    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this Flower ?",
            R.drawable.

        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What is the name of this flower ?",
            R.drawable.

        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que7)


        val que8 = Question(
            8,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que8)


        val que9 = Question(
            9,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que10)

        val que11 = Question(
            11,
            "What is the name of this flower ?",
            R.drawable
        )
        questionList.add(que11)

        val que12 = Question(
            12,
            "What is the name of this flower ?",
            R.drawable.

        )
        questionList.add(que12)


        val que13 = Question(
            13,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que13)

        val que14 = Question(
            14,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que14)


        val que15 = Question(
            15,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que15)

        val que16 = Question(
            16,
            "What is the name of this flower ?",
            R.drawable.

        )
        questionList.add(que16)

        val que17 = Question(
            17,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que17)

        val que18 = Question(
            18,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que18)


        val que19 = Question(
            19,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que19)

        val que20 = Question(
            20,
            "What is the name of this flower ?",
            R.drawable.

        )
        questionList.add(que20)


        val que21 = Question(
            21,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que21)

        val que22 = Question(
            22,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que22)

        val que23 = Question(
            23,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que23)

        val que24 = Question(
            24,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que24)

        val que25 = Question(
            25,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que25)

        val que26 = Question(
            26,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que26)

        val que27 = Question(
            27,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que27)

        val que28 = Question(
            28,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que28)

        val que29 = Question(
            29,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que29)

        val que30 = Question(
            30,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que30)

        val que31 = Question(
            31,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que31)

        val que32 = Question(
            32,
            "What is the name of this flower ?",
            R.drawable.
        )
        questionList.add(que32)

        return questionList
    }
 */