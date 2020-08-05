package com.example.flagsquizapp

object ConstantsSports {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this sport ?",
            R.drawable.archery,
            "Archery",
            "Football",
            "Volleyball",
            "Baseball",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What is the name of this sport ?",
            R.drawable.badminton,
            "Badminton Tennis",
            "Badminton",
            "Table Tennis",
            "Billiyard",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What is the name of this sport ?",
            R.drawable.basmintontennis,

            "Badminton",
            "Table Tennis",
            "Lawn Tennis",
            "Badminton Tennis",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What is the name of this sport ?",
            R.drawable.biathlon,
            "Skating",
            "Skying",
            "Sliding",
            "Biathlon",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What is the name of this sport ?",
            R.drawable.billyard,
            "Hockey",
            "Billyard",
            "Polo",
            "Biathlon",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What is the name of this sport ?",
            R.drawable.bowling,
            "Bowling",
            "Ball Throw",
            "Archery",
            "Swimming",
            1
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this sport ?",
            R.drawable.chess,
            "Carrom",
            "Diving",
            "Chess",
            "Kho-Kho",
            3
        )
        questionList.add(que7)


        val que8 = Question(
            8,
            "What is the name of this sport ?",
            R.drawable.diving,
            "Swimming",
            "Diving",
            "Dosball",
            "American football",
            2
        )
        questionList.add(que8)


        val que9 = Question(
            9,
            "What is the name of this sport ?",
            R.drawable.dosball,
            "Baseball",
            "Volleyball",
            "American football",
            "Basketball",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "What is the name of this sport ?",
            R.drawable.golf,
            "Golf",
            "Polo",
            "Hockey",
            "Ice Hockey",
            1
        )
        questionList.add(que10)

        val que11 = Question(
            11,
            "What is the name of this sport ?",
            R.drawable.gymnastic,
            "Atheletics",
            "Swimming",
            "Gymnastic",
            "Diving",
            3
        )
        questionList.add(que11)

        val que12 = Question(
            12,
            "What is the name of this sport ?",
            R.drawable.judokarate,
            "Judo/Karate",
            "Tikondo",
            "Kick Boxing",
            "Boxing",
            1

        )
        questionList.add(que12)


        val que13 = Question(
            13,
            "What is the name of this sport ?",
            R.drawable.powerlifting,
            "PowerLifting",
            "Wrestling",
            "Tikondo",
            "Kick  Boxing",
            1
        )
        questionList.add(que13)

        val que14 = Question(
            14,
            "What is the name of this sport ?",
            R.drawable.skatiing,
            "Skying",
            "Diving",
            "Skating",
            "Ice Hockey",
            3
        )
        questionList.add(que14)


        val que15 = Question(
            15,
            "What is the name of this sport ?",
            R.drawable.squash,
            "Badminton",
            "Badminton Tennis",
            "Squash",
            "Skatting",
            3
        )
        questionList.add(que15)

        val que16 = Question(
            16,
            "What is the name of this sport ?",
            R.drawable.swim,
            "Diving",
            "Swimming",
            "TableTennis",
            "Ice Hockey",
            2

        )
        questionList.add(que16)

        val que17 = Question(
            17,
            "What is the name of this sport ?",
            R.drawable.tabletennis,
            "Badminton Tennis",
            "Squash",
            "Bowling",
            "Table Tennis",
            4
        )
        questionList.add(que17)

        val que18 = Question(
            18,
            "What is the name of this sport ?",
            R.drawable.wrestling,
            "Kabaddi",
            "Squash",
            "Power Lifting",
            "Wrestling",
            4
        )
        questionList.add(que18)
        return questionList
    }
}