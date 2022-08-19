package com.aman.ayurvedatest

class Model {

    val images = mutableListOf<Int>()
    val question = mutableListOf<String>()
    var options = mutableListOf<MutableList<String>>()


    val answers = mutableListOf<String>()

    fun getImages(){
        images.add(R.drawable.apple)
        images.add(R.drawable.pyhton)
        images.add(R.drawable.turm)
        images.add(R.drawable.pitt)
        images.add(R.drawable.sweden)
        images.add(R.drawable.elon)
    }


    fun getQuestions(){
        question.add("Name the company to cross 3 trillion stock market value ?") // apple
        question.add("Identify the logo of this trending programming language ?") // py
        question.add("This herb improves heart health and  used in ayurveda ?") // turmeric
        question.add("Name the actor who filed divorce with Angelina Jolie ?") //brad pitt
        question.add("Name this country by it's national flag ?") //sweden
        question.add("Identify  the CEO of Tesla and world's richest man ?") //elon musk
    }


    fun getOptions(){

            val temp1 = mutableListOf<String>()
            temp1.add("Microsoft")
            temp1.add("Apple")
            temp1.add("Google")
            temp1.add("Facebook")


        val temp2 = mutableListOf<String>()
        temp2.add("Kotlin")
        temp2.add("java Script")
        temp2.add("Ruby")
        temp2.add("Python")

        val temp3 = mutableListOf<String>()
        temp3.add("Brahmi")
        temp3.add("Turmeric")
        temp3.add("Cumin")
        temp3.add("Triphala")

        val temp4 = mutableListOf<String>()
        temp4.add("Tom Cruise")
        temp4.add("Jhonny Depp")
        temp4.add("Brad Pitt")
        temp4.add("Luke")

        val temp5 = mutableListOf<String>()
        temp5.add("India")
        temp5.add("China")
        temp5.add("Pakistan")
        temp5.add("Sweden")

        val temp6 = mutableListOf<String>()
        temp6.add("Bill Gates ")
        temp6.add("Elon Musk")
        temp6.add("Jeff Bezos")
        temp6.add("Gautam Adani")


        options.add(temp1)
        options.add(temp2)
        options.add(temp3)
        options.add(temp4)
        options.add(temp5)
        options.add(temp6)
    }



    fun getAnswer(){
        answers.add("Apple")
        answers.add("Python")
        answers.add("Turmeric")
        answers.add("Brad Pitt")
        answers.add("Sweden")
        answers.add("Elon Musk")
    }




}