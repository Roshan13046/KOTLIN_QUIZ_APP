package com.example.flagsquizapp

object ConstantsSpices {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this spice ?",
            R.drawable.bayleaves,
            "Leaves",
            "Bay Leaves",
            "Asafoetida",
            "Tamarind",
            2
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What is the name of this spice ?",
            R.drawable.asafoetida,
            "Cumin Powder",
            "Asafoetida",
            "Cashewnuts",
            "Ginger",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What is the name of this spice ?",
            R.drawable.amonds,
            "Almonds",
            "Cashewnuts",
            "Peanuts",
            "Tamarind",
            1

        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What is the name of this spice ?",
            R.drawable.betelnut,
            "Cumin Seeds",
            "Almonds",
            "Walnuts",
            "Betelnut",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What is the name of this spice ?",
            R.drawable.blackpepper,
            "Black Pepper",
            "Walnuts",
            "Sesame seeds",
            "Cumin seeds",
            1
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What is the name of this spice ?",
            R.drawable.cardamom,
            "Sesame seeds",
            "Cumin seeds",
            "Cardamom",
            "Bay Leaves",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this spice ?",
            R.drawable.cashewnuts,
            "Walnuts",
            "Betelnuts",
            "Cashewnuts",
            "Nutmeg",
            3
        )
        questionList.add(que7)


        val que8 = Question(
            8,
            "What is the name of this spice ?",
            R.drawable.cinnamon,
            "Cardamom",
            "Cloves",
            "Asafoetida",
            "Cinnamon",
            4
        )
        questionList.add(que8)


        val que9 = Question(
            9,
            "What is the name of this spice ?",
            R.drawable.corianderseeds,
            "Coriander Seeds",
            "Cumin Seeds",
            "Sesame Seeds",
            "Wanuts",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "What is the name of this spice ?",
            R.drawable.coromseeds,
            "Sesame seeds",
            "Coriander seeds",
            "Cumin seeds",
            "Corom seeds",
            4
        )
        questionList.add(que10)

        val que11 = Question(
            11,
            "What is the name of this spice ?",
            R.drawable.cuminseeds,
            "Corom seeds",
            "Sesame seeds",
            "Cumin seeds",
            "Cloves",
            3
        )
        questionList.add(que11)

        val que12 = Question(
            12,
            "What is the name of this spice ?",
            R.drawable.kalonjimangrel,
            "Cloves",
            "Black Pepper",
            "Corom seeds",
            "Kalonji / Mangrel",
            4
        )
        questionList.add(que12)


        val que13 = Question(
            13,
            "What is the name of this spice ?",
            R.drawable.mustardseeds,
            "Black Pepper",
            "Kalonji / Mangrel",
            "Corom seeds",
            "Mustard Seeds",
            4
        )
        questionList.add(que13)

        val que14 = Question(
            14,
            "What is the name of this spice ?",
            R.drawable.nutmeg,
            "Walnuts",
            "Corrom seeds",
            "Cumin seeds",
            "Nutmeg",
            4
        )
        questionList.add(que14)


        val que15 = Question(
            15,
            "What is the name of this spice ?",
            R.drawable.saffron,
            "Betelnut",
            "Walnut",
            "Saffron",
            "Sesame",
            3
        )
        questionList.add(que15)

        val que16 = Question(
            16,
            "What is the name of this spice ?",
            R.drawable.staranise,
            "Staranise",
            "Black Pepper",
            "Bay Leaves",
            "Cloves",
            1
        )
        questionList.add(que16)

        val que17 = Question(
            17,
            "What is the name of this spice ?",
            R.drawable.tamarind,
            "Turmeric",
            "Tamarind",
            "Chilli powder",
            "Mustard",
            2

        )
        questionList.add(que17)

        val que18 = Question(
            18,
            "What is the name of this spice ?",
            R.drawable.turmeric,
            "Tamarind",
            "Turmeric",
            "Cumin Powder",
            "Sesame ",
            2
        )
        questionList.add(que18)

        return questionList
    }
}
