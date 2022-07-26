package com.ozlem.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
// To sync MainActivity and xml files:
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // value define and initialize:
        //var textView : TextView = findViewById(R.id.textViewID)

        var j = 0

        if (j == 0){
            println(firstFunction())
        }else{
            println(secondFunction())
        }

        // fun substraction try:
        println(substraction(10 , 20))

        // fun additon try:
        println(addition(10,50))

        // setOnClickListener method (onClick method alternative):


    }

    // We defined functions outside of onCreate method:
    fun firstFunction() {
        println("First function executed...")
    }

    fun secondFunction(){
        println("Second function executed...")
    }

    // take input:
    // "Unit" means empty or space at Kotlin. It is proof that it will not return any object at the end.
    fun substraction(x : Int , y : Int){
        textViewID.text = "Sonuç : ${x - y}"
    }

    // return output:
    // The "Int" after the parenthesis means we will return an Int result:
    fun addition(a : Int , b : Int) : Int{
        textViewID.text = "Sonuç : ${a + b}" // for emulator
        return a + b // for logcat output

    }

    // onClick method for button (id = buttonID):
    // We write "view" inside the function to indicate that it will be called by a view.
    // view : value , View : Class
    fun onClickChange(view : View){

        val additionResult = addition(20 , 50)
        textViewID.text = "Sonuç : ${additionResult}"


    }


}

