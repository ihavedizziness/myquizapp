package kz.ihavedizziness.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1)
        questionsList.add(question1)

        val question2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "New Zealand",
            "Austria",
            "United Kingdom",
            "Australia",
            4)
        questionsList.add(question2)

        val question3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany",
            "Belgium",
            "Ireland",
            "Romania",
            2)
        questionsList.add(question3)

        val question4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Chile",
            "Brunei",
            "Brazil",
            "Portugal",
            3)
        questionsList.add(question4)

        val question5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Iceland",
            "Norway",
            "Denmark",
            "Finland",
            3)
        questionsList.add(question5)

        val question6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "Tuvalu",
            "Seychelles",
            "Marshall Islands",
            1)
        questionsList.add(question6)

        val question7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Belgium",
            "Germany",
            "Italy",
            "Lithuania",
            2)
        questionsList.add(question7)

        val question8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland",
            "Indonesia",
            "Niger",
            "India",
            4)
        questionsList.add(question8)

        val question9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Jordan",
            "UAE",
            "Palestine",
            "Kuwait",
            4)
        questionsList.add(question9)

        val question10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Nauru",
            "Palau",
            "New Zealand",
            "Tasmania",
            3)
        questionsList.add(question10)

        return questionsList
    }

}