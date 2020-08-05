package com.example.flagsquizapp

object ConstantsSymbols {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this Logo ?",
            R.drawable.blockchain,
            "Block Chain",
            "Artificial Intelligence",
            "Machine learning",
            "Bitcoin",
            1

        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What is the name of this Logo ?",
            R.drawable.chrome,
            "Mozilla",
            "Chrome",
            "You tube",
            "Windows",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What is the name of this Logo ?",
            R.drawable.css,
            "HTML",
            "JAVA",
            "CSS",
            "PHP",
            3

        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What is the name of this Logo ?",
            R.drawable.facebook,
            "Facebook",
            "Twitter",
            "Instagram",
            "GOOGLE",
            1
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What is the name of this Logo ?",
            R.drawable.github,
            "Google CLoud",
            "Bitcoin",
            "Git hub",
            "Paytm",
        3
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What is the name of this Logo ?",
            R.drawable.googlecloud,
            "Google pay",
            "Phone Pay",
            "Google Cloud",
            "Zoom",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this Logo ?",
            R.drawable.html,
            "HTML",
            "CSS",
            "java Script",
            "Ruby",
            1
        )
        questionList.add(que7)


        val que8 = Question(
            8,
            "What is the name of this Logo ?",
            R.drawable.instagam,
            "Twitter",
            "Facebook",
            "Git",
            "Instagram",
            4
        )
        questionList.add(que8)


        val que9 = Question(
            9,
            "What is the name of this Logo ?",
            R.drawable.java,
            "JAVA",
            "Java Script",
            "Node.js",
            "Kotlin",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "What is the name of this Logo ?",
            R.drawable.javascript,
            "JAVA",
            "Android",
            "Express",
            "javaScript",
            4

        )
        questionList.add(que10)

        val que11 = Question(
            11,
            "What is the name of this Logo ?",
            R.drawable.linkedin,
            "Linux",
            "Parrot OS",
            "Git",
            "linkedin",
            4
        )
        questionList.add(que11)

        val que12 = Question(
            12,
            "What is the name of this Logo ?",
            R.drawable.linux,
            "Parrot OS",
            "Linux",
            "Windows",
            "Ubunto",
            2

        )
        questionList.add(que12)


        val que13 = Question(
            13,
            "What is the name of this Logo ?",
            R.drawable.mozilla,
            "Google",
            "Mozilla Firfox",
            "Git",
            "Twitter",
            2
        )
        questionList.add(que13)

        val que14 = Question(
            14,
            "What is the name of this Logo ?",
            R.drawable.netflix,
            "Netflix",
            "Face App",
            "Zoom",
            "Git hub",
            1
        )
        questionList.add(que14)


        val que15 = Question(
            15,
            "What is the name of this Logo ?",
            R.drawable.paytm,
            "Phone pay",
            "Google pay",
            "Amazon Pay",
            "paytm",
            4
        )
        questionList.add(que15)

        val que16 = Question(
            16,
            "What is the name of this Logo ?",
            R.drawable.recyclebin,
            "My Computer",
            "Recyclebin",
            "Terminal",
            "Ubunto",
            2
        )
        questionList.add(que16)

        val que17 = Question(
            17,
            "What is the name of this Logo ?",
            R.drawable.ruby,
            "Ruby",
            "Damond",
            "Kotlin",
            "Red Hat",
            1
        )
        questionList.add(que17)

        val que18 = Question(
            18,
            "What is the name of this Logo ?",
            R.drawable.twitter,
            "Facebook",
            "Twitter",
            "What's App",
            "You toube",
            2
        )
        questionList.add(que18)


        val que19 = Question(
            19,
            "What is the name of this Logo ?",
            R.drawable.windows,
            "Parrot OS",
            "Windows",
            "Kali",
            "Ubunto",
            2
        )
        questionList.add(que19)

        val que20 = Question(
            20,
            "What is the name of this Logo ?",
            R.drawable.youtube,
            "Youtube",
            "Google",
            "Red hat",
            "Mozilla",
            1

        )
        questionList.add(que20)

        return questionList
    }
}