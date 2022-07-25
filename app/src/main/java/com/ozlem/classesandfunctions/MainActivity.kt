package com.ozlem.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

// onClick method doesn't working at the moment!!!

class MainActivity : AppCompatActivity() {

    // value definition:


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // value initialize:
        var textView : TextView = findViewById(R.id.textViewID)

        var j = 0

        if (j == 0){
            println(firstFunction())
        }else{
            println(secondFunction())
        }

        // take input:
        // "Unit" means empty or space at Kotlin. It is proof that it will not return any object at the end.
        fun substraction(x : Int , y : Int){
            textView.text = "Sonuç : ${x - y}"
        }

        // fun substraction try:
        println(substraction(10 , 20))

        // return output:
        // The "Int" after the parenthesis means we will return an Int result:
        fun addition(a : Int , b : Int) : Int{
            textView.text = "Sonuç : ${a + b}" // for emulator
            return a + b // for logcat output

        }

        // fun additon try:
        println(addition(10,50))


    }

    // We defined functions outside of onCreate method:
    fun firstFunction() {
        println("First function executed...")
    }

    fun secondFunction(){
        println("Second function executed...")
    }

    // onClick method for button (id = buttonID):
    // We write "view" inside the function to indicate that it will be called by a view.
    // view : value , View : Class
    fun onClickChange(view : View){

        //val additionResult = addition(10 , 50)
       // textView.text = "Sonuç : ${additionResult}"


    }


}

