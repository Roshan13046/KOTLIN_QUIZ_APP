package com.example.flagsquizapp

object ConstantsCapitals {


    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the Capital of this State ?",
            R.drawable.andrapradesh,
            "Hyderabad",
            "Chennai",
            "Tiruvanatapuram",
            "Panji",
            1

        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What is the Capital of this State ?",
            R.drawable.arunachalpradesh,
            "Tatanagar",
            "Itanagar",
            "Deomali",
            "Khonsa",
            2

        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What is the Capital of this State ?",
            R.drawable.assam,
            "Dispur",
            "Guwahati",
            "Silchar",
            "Jorhat",
            1

        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What is the Capital of this State ?",
            R.drawable.bihar,
            "Gaya",
            "Muzaffarpur",
            "Patna",
            "Zhansi",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What is the Capital of this State ?",
            R.drawable.chhatisgarh,
            "Raipur",
            "Bilaspur",
            "Korba",
            "Ambikpur",
            1
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What is the Capital of this State ?",
            R.drawable.goa,
            "Vaso da Gama",
            "Margao",
            "Mapusa",
            "Panaji",
            4
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What is the Capital of this State ?",
            R.drawable.gujarat,
            "Surat",
            "Ahmedabad",
            "Rajkot",
            "Gandhinagar",
            4

        )
        questionList.add(que7)


        val que8 = Question(
            8,
            "What is the Capital of this State ?",
            R.drawable.harayana,
            "Ludhiana",
            "Patiala",
            "Chandigarh",
            "Udaipur",
            3
        )
        questionList.add(que8)


        val que9 = Question(
            9,
            "What is the Capital of this State ?",
            R.drawable.himachalpradesh,
            "Mandi",
            "Dharamshala",
            "Shimla",
            "Chamba",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "What is the Capital of this State ?",
            R.drawable.jandk,
            "Baramulla",
            "Udhampur",
            "Gulmarg",
            "Srinagar/Jammu",
            4
        )
        questionList.add(que10)

        val que11 = Question(
            11,
            "What is the Capital of this State ?",
            R.drawable.jharkhand,
            "Ranchi",
            "Bokaro steel city",
            "Dhanbaad",
            "Giridh",
            1
        )
        questionList.add(que11)

        val que12 = Question(
            12,
            "What is the Capital of this State ?",
            R.drawable.karnataka,
            "Belgaum",
            "Hyderabad",
            "Bengaluru",
            "Mangalore",
            3

        )
        questionList.add(que12)


        val que13 = Question(
            13,
            "What is the Capital of this State ?",
            R.drawable.kerala,
            "Thrissur",
            "Chennai",
            "Thrivananthapuram",
            "Kochi",
            3

        )
        questionList.add(que13)

        val que14 = Question(
            14,
            "What is the Capital of this State ?",
            R.drawable.mp,
            "Bhopal",
            "Jabalpur",
            "Indore",
            "Gwalior",
            1
        )
        questionList.add(que14)


        val que15 = Question(
            15,
            "What is the Capital of this State ?",
            R.drawable.maharashtra,
            "Malegaon",
            "Makmalabaad",
            "Navi Mumbai",
            "Mumbai",
            4
        )
        questionList.add(que15)

        val que16 = Question(
            16,
            "What is the Capital of this State ?",
            R.drawable.manipur,
            "Jiribam",
            "Kakching",
            "Imphal",
            "Bishnupur",
            3

        )
        questionList.add(que16)

        val que17 = Question(
            17,
            "What is the Capital of this State ?",
            R.drawable.meghalaya,
            "Shillong",
            "Guwahati",
            "Tura",
            "Cherrapunji",
            1
        )
        questionList.add(que17)

        val que18 = Question(
            18,
            "What is the Capital of this State ?",
            R.drawable.mizoram,
            "Kolasb",
            "Nagpur",
            "Aizawl",
            "Champhai",
            3
        )
        questionList.add(que18)


        val que19 = Question(
            19,
            "What is the Capital of this State ?",
            R.drawable.nagaland,
            "Dimapur",
            "Wokha",
            "Kohima",
            "Zunheboto",
            3

        )
        questionList.add(que19)

        val que20 = Question(
            20,
            "What is the Capital of this State ?",
            R.drawable.odisha,
            "Bhubaneshwar",
            "Cuttak",
            "Puri",
            "Rourkela",
            1

        )
        questionList.add(que20)


        val que21 = Question(
            21,
            "What is the Capital of this State ?",
            R.drawable.punjab,
            "Amritsar",
            "Chandigarh",
            "Ludhiana",
            "Patiala",
            2
        )
        questionList.add(que21)

        val que22 = Question(
            22,
            "What is the Capital of this State ?",
            R.drawable.rajasthan,
            "Jaipur",
            "Jodhpur",
            "Udaipur",
            "Bikaner",
            1
        )
        questionList.add(que22)

        val que23 = Question(
            23,
            "What is the Capital of this State ?",
            R.drawable.tamilnadu,
            "Coimbatore",
            "Salem",
            "Madurai",
            "Chennai",
            4
        )
        questionList.add(que23)

        val que24 = Question(
            24,
            "What is the Capital of this State ?",
            R.drawable.telangana,
            "Warangal",
            "Hyderabad",
            "Nizamabad",
            "Auranagbad",
            2
        )
        questionList.add(que24)

        val que25 = Question(
            25,
            "What is the Capital of this State ?",
            R.drawable.tripura,
            "Agartala",
            "Udaipur",
            "Dhamanagar",
            "Mumbai",
            1

        )
        questionList.add(que25)

        val que26 = Question(
            26,
            "What is the Capital of this State ?",
            R.drawable.up,
            "Merrut",
            "Aligarh",
            "Noida",
            "Lucknow",
            4
        )
        questionList.add(que26)

        val que27 = Question(
            27,
            "What is the Capital of this State ?",
            R.drawable.uttarakhand,
            "Haridwar",
            "Nainital",
            "Dehradun",
            "Rishikesh",
            3
        )
        questionList.add(que27)

        val que28 = Question(
            28,
            "What is the Capital of this State ?",
            R.drawable.westbengal,
            "Durgapur",
            "Howrah",
            "Parganas",
            "Kolkata",
            4
        )
        questionList.add(que28)

        val que29 = Question(
            29,
            "What is the Capital of this State ?",
            R.drawable.sikkim,
            "Gangtok",
            "Namchi",
            "Pelling",
            "Lachung",
            1
        )
        questionList.add(que29)

        return questionList
    }
}