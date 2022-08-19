package com.aman.ayurvedatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.view.isVisible
import com.aman.ayurvedatest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var model: Model

    private var score = 0
    private var isSelected = false
    private  var ans = ""
    private var count = 0;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = ActivityMainBinding.inflate(layoutInflater)
        binding = view
        setContentView(view.root)

        binding.score.text = score.toString()



        //getting the data
        model = Model()
        model.getImages()
        model.getQuestions()
        model.getOptions()
        model.getAnswer()


        //loading  questions
       getQuestion()



        //event listener to buttons
        binding.c1.setOnClickListener {
            binding.c1.setBackgroundResource(R.drawable.quote_gradient1)
            binding.t1.setTextColor(resources.getColor(R.color.white))
            ans = binding.t1.text.toString()
            isSelected = true


            binding.c2.setBackgroundResource(R.drawable.round)
            binding.t2.setTextColor(resources.getColor(R.color.blue))

            binding.c3.setBackgroundResource(R.drawable.round)
            binding.t3.setTextColor(resources.getColor(R.color.blue))

            binding.c4.setBackgroundResource(R.drawable.round)
            binding.t4.setTextColor(resources.getColor(R.color.blue))

        }
        binding.c2.setOnClickListener {
            binding.c2.setBackgroundResource(R.drawable.quote_gradient1)
            binding.t2.setTextColor(resources.getColor(R.color.white))
            ans = binding.t2.text.toString()
            isSelected = true



            binding.c1.setBackgroundResource(R.drawable.round)
            binding.t1.setTextColor(resources.getColor(R.color.blue))

            binding.c3.setBackgroundResource(R.drawable.round)
            binding.t3.setTextColor(resources.getColor(R.color.blue))

            binding.c4.setBackgroundResource(R.drawable.round)
            binding.t4.setTextColor(resources.getColor(R.color.blue))

        }
        binding.c3.setOnClickListener {
            binding.c3.setBackgroundResource(R.drawable.quote_gradient1)
            binding.t3.setTextColor(resources.getColor(R.color.white))
            ans = binding.t3.text.toString()
            isSelected = true



            binding.c2.setBackgroundResource(R.drawable.round)
            binding.t2.setTextColor(resources.getColor(R.color.blue))

            binding.c1.setBackgroundResource(R.drawable.round)
            binding.t1.setTextColor(resources.getColor(R.color.blue))

            binding.c4.setBackgroundResource(R.drawable.round)
            binding.t4.setTextColor(resources.getColor(R.color.blue))

        }
        binding.c4.setOnClickListener {
            binding.c4.setBackgroundResource(R.drawable.quote_gradient1)
            binding.t4.setTextColor(resources.getColor(R.color.white))
            ans = binding.t4.text.toString()
            isSelected = true



            binding.c2.setBackgroundResource(R.drawable.round)
            binding.t2.setTextColor(resources.getColor(R.color.blue))

            binding.c3.setBackgroundResource(R.drawable.round)
            binding.t3.setTextColor(resources.getColor(R.color.blue))

            binding.c1.setBackgroundResource(R.drawable.round)
            binding.t1.setTextColor(resources.getColor(R.color.blue))

        }


        //when next button is clicked
        binding.nextBtn.setOnClickListener {
            if(binding.nextBtn.text.toString().lowercase() == "restart"){
                restart()
            }else{
                nextClick()

            }
        }

    }

    private fun getQuestion() {
        binding.qCount.text = (count+1).toString()+" of 6"
        binding.score.text = score.toString()
        when(count){
            0 ->{
                binding.image.setImageResource(model.images.get(0))
                binding.question.text = model.question.get(0);
                binding.t1.text = model.options.get(0).get(0)
                binding.t2.text = model.options.get(0).get(1)
                binding.t3.text = model.options.get(0).get(2)
                binding.t4.text = model.options.get(0).get(3)
            }
            1 -> {
                binding.image.setImageResource(model.images.get(1))
                binding.question.text = model.question.get(1);
                binding.t1.text = model.options.get(1).get(0)
                binding.t2.text = model.options.get(1).get(1)
                binding.t3.text = model.options.get(1).get(2)
                binding.t4.text = model.options.get(1).get(3)

            }
            2 -> {
                binding.image.setImageResource(model.images.get(2))
                binding.question.text = model.question.get(2);
                binding.t1.text = model.options.get(2).get(0)
                binding.t2.text = model.options.get(2).get(1)
                binding.t3.text = model.options.get(2).get(2)
                binding.t4.text = model.options.get(2).get(3)
            }
            3 -> {
                binding.image.setImageResource(model.images.get(3))
                binding.question.text = model.question.get(3);
                binding.t1.text = model.options.get(3).get(0)
                binding.t2.text = model.options.get(3).get(1)
                binding.t3.text = model.options.get(3).get(2)
                binding.t4.text = model.options.get(3).get(3)
            }
            4 -> {
                binding.image.setImageResource(model.images.get(4))
                binding.question.text = model.question.get(4);
                binding.t1.text = model.options.get(4).get(0)
                binding.t2.text = model.options.get(4).get(1)
                binding.t3.text = model.options.get(4).get(2)
                binding.t4.text = model.options.get(4).get(3)

            }
            else -> {
                binding.image.setImageResource(model.images.get(5))
                binding.question.text = model.question.get(5);
                binding.t1.text = model.options.get(5).get(0)
                binding.t2.text = model.options.get(5).get(1)
                binding.t3.text = model.options.get(5).get(2)
                binding.t4.text = model.options.get(5).get(3)

            }
        }
    }

    private fun nextClick() {

        if(!isSelected){
            Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show()
            return
        }else{
            isSelected = false
        }


        when(count){
            0->{
                if (ans == model.answers[0]){
                    score+=10
                }
            }
            1 -> {
                if (ans == model.answers[1]){
                    score+=10
                }
            }
            2 -> {

                if (ans == model.answers[2]){
                    score+=10
                }
            }
            3 -> {
                if (ans == model.answers[3]){
                    score+=10
                }
            }
            4 -> {
                if (ans == model.answers[4]){
                    score+=10
                }
            }
            else -> {
                if (ans == model.answers[5]){
                    score+=10
                }
            }
        }

        count += 1
        if(count==6){
            hideViews()
            return
        }
        getQuestion()

        clearbtn()
    }

    private fun clearbtn() {
        binding.c1.setBackgroundResource(R.drawable.round)
        binding.t1.setTextColor(resources.getColor(R.color.blue))

        binding.c2.setBackgroundResource(R.drawable.round)
        binding.t2.setTextColor(resources.getColor(R.color.blue))

        binding.c3.setBackgroundResource(R.drawable.round)
        binding.t3.setTextColor(resources.getColor(R.color.blue))

        binding.c4.setBackgroundResource(R.drawable.round)
        binding.t4.setTextColor(resources.getColor(R.color.blue))

    }



    fun hideViews(){
        binding.image.isVisible = false
        binding.scoreConst.isVisible = false
        binding.qConst.isVisible = false
        binding.question.isVisible = false
        binding.l1.isVisible = false
        binding.l2.isVisible = false

        binding.nextBtn.text = "Restart"
        binding.finalScore.isVisible = true
        binding.finalScore.text = "Score : "+score.toString()+"/"+"60"

    }


    fun restart(){
        binding.finalScore.isVisible = false


        binding.image.isVisible = true
        binding.scoreConst.isVisible = true
        binding.qConst.isVisible = true
        binding.question.isVisible = true
        binding.l1.isVisible = true
        binding.l2.isVisible = true
        binding.nextBtn.text = "Next"

        score = 0
        ans = ""
        isSelected = false
        count = 0
        getQuestion()
        clearbtn()
    }

}