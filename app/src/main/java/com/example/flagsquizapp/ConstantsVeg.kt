package com.example.flagsquizapp

object ConstantsVeg {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this vegetable ?",
            R.drawable.beans,
            "Ladyfinger",
            "Beans",
            "Sweet Potato",
            "Tomato",
            2
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What is the name of this vegetable ?",
            R.drawable.beetroot,
            "Beetroot",
            "Sweet Poptato",
            "Tomato",
            "Radish",
            1
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What is the name of this vegetable ?",
            R.drawable.ladyfinger,
            "Sweet Potato",
            "Tomato",
            "Ladyfinger",
            "Beans",
        3

        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What is the name of this vegetable ?",
            R.drawable.bittergourd,
            "Bottle gourd",
        "Bitter gourd",
            "Neck gourd",
            "Corner gourd",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What is the name of this vegetable ?",
            R.drawable.bottlegourd,
            "Bottle gourd",
            "Bitter gourd",
            "Neck gourd",
            "Corner gourd",
            1
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What is the name of this vegetable ?",
            R.drawable.brinjal,
            "Brinjal",
            "Potato",
            "Radish",
            "Broccoli",
            1
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this vegetable ?",
            R.drawable.broccoli,
            "Cabbage",
            "Cauliflower",
            "Broccoli",
            "Brinjal",
            3
        )
        questionList.add(que7)


        val que8 = Question(
            8,
            "What is the name of this vegetable ?",
            R.drawable.cabbage,
            "Cabbage",
            "Cauliflower",
            "Carrot",
            "Bittergourd",
            1
        )
        questionList.add(que8)


        val que9 = Question(
            9,
            "What is the name of this vegetable ?",
            R.drawable.capcicum,
            "Carrot",
            "Cucumber",
            "Capcicum",
            "Chilli",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "What is the name of this vegetable ?",
            R.drawable.carrot,
            "Chilli",
            "Carrot",
            "Cabbage",
            "Cauliflower",
            2
        )
        questionList.add(que10)

        val que11 = Question(
            11,
            "What is the name of this vegetable ?",
            R.drawable.cauliflower,
            "Carrot",
            "Coriander",
            "Cauliflower",
            "Cabbage",
            3
        )
        questionList.add(que11)

        val que12 = Question(
            12,
            "What is the name of this vegetable ?",
            R.drawable.coriander,
            "Fenugeek",
            "Spinach",
            "Curry Leaves",
            "Coriander",
            4
        )
        questionList.add(que12)


        val que13 = Question(
            13,
            "What is the name of this vegetable ?",
            R.drawable.cucumber,
            "Carrots",
            "Radish",
            "Cucumber",
            "Cauliflower",
            3
        )
        questionList.add(que13)

        val que14 = Question(
            14,
            "What is the name of this vegetable ?",
            R.drawable.curryleaf,
            "CurryLeaf",
            "Onion",
            "Fenugeek",
            "Spinach",
            1
        )
        questionList.add(que14)


        val que15 = Question(
            15,
            "What is the name of this vegetable ?",
            R.drawable.dillleaves,
            "Methi",
            "Dilleaves",
            "Spinach",
            "Radish",
            2
        )
        questionList.add(que15)

        val que16 = Question(
            16,
            "What is the name of this vegetable ?",
            R.drawable.elephantears,
            "Elephantyam",
            "Elephant Tears",
            "Potato",
            "Ginger",
            2

        )
        questionList.add(que16)

        val que17 = Question(
            17,
            "What is the name of this vegetable ?",
            R.drawable.elephantyam,
            "Elephantyam",
            "Ginger",
            "Elephant Tears",
            "Potato",
            1

        )
        questionList.add(que17)

        val que18 = Question(
            18,
            "What is the name of this vegetable ?",
            R.drawable.fenugreek,
            "Spinach",
            "Fenugreek",
            "Curry Leaves",
            "Dilleaves",
            2
        )
        questionList.add(que18)


        val que19 = Question(
            19,
            "What is the name of this vegetable ?",
            R.drawable.gardenradish,
            "Radish",
            "Pumpkin",
            "Garden Radish",
            "Beet Root",
            3
        )
        questionList.add(que19)

        val que20 = Question(
            20,
            "What is the name of this vegetable ?",
            R.drawable.garlic,
            "Ginger",
            "Garlic",
            "Garden Radish",
            "Coriander",
            2

        )
        questionList.add(que20)


        val que21 = Question(
            21,
            "What is the name of this vegetable ?",
            R.drawable.kale,
            "Kale",
            "Spinach",
            "Curry Leaves",
            "Carrot",
            1
        )
        questionList.add(que21)

        val que22 = Question(
            22,
            "What is the name of this vegetable ?",
            R.drawable.onion,
            "Garlic",
            "Tomato",
            "Onion",
            "Elephantyam",
            3
        )
        questionList.add(que22)

        val que23 = Question(
            23,
            "What is the name of this vegetable ?",
            R.drawable.peas,
            "Bittergourd",
            "Peanuts",
            "Peas",
            "Pumpkin",
            3
        )
        questionList.add(que23)

        val que24 = Question(
            24,
            "What is the name of this vegetable ?",
            R.drawable.pointedgourd,
            "Neckgourd",
            "Pointedgourd",
            "Bittergourd",
            "Bottlegourd",
            2
        )
        questionList.add(que24)

        val que25 = Question(
            25,
            "What is the name of this vegetable ?",
            R.drawable.potatoes,
            "Pumpkin",
            "Sweet Potato",
            "Potato",
            "Ginger",
            3
        )
        questionList.add(que25)

        val que26 = Question(
            26,
            "What is the name of this vegetable ?",
            R.drawable.pumpkin,
            "Pumpkin",
            "Potato",
            "Beetroot",
            "Radish",
            1
        )
        questionList.add(que26)

        val que27 = Question(
            27,
            "What is the name of this vegetable ?",
            R.drawable.radish,
            "Carrot",
            "Radish",
            "Sweet Potato",
            "Cucumber",
            2
        )
        questionList.add(que27)

        val que28 = Question(
            28,
            "What is the name of this vegetable ?",
            R.drawable.redspinach,
            "Spinach",
            "Dilleaves",
            "Red Spinach",
            "Red Coriander",
            3
        )
        questionList.add(que28)

        val que29 = Question(
            29,
            "What is the name of this vegetable ?",
            R.drawable.spinach,
            "Red Spinach",
            "Spinach",
            "Feugreek",
            "Sweet Corn",
            2
        )
        questionList.add(que29)

        val que30 = Question(
            30,
            "What is the name of this vegetable ?",
            R.drawable.sweetpotato,
            "Sweet Potato",
            "Potato",
            "Ginger",
            "Peanuts",
            1
        )
        questionList.add(que30)

        val que31 = Question(
            31,
            "What is the name of this vegetable ?",
            R.drawable.tomato,
            "Beet Root",
            "Tomato",
            "Carrot",
            "Radish",
            2
        )
        questionList.add(que31)

        val que32 = Question(
            32,
            "What is the name of this vegetable ?",
            R.drawable.turnip,
            "Turnip",
            "Radish",
            "Onion",
            "Beet Root",
            1
        )
        questionList.add(que32)

        return questionList
    }
}