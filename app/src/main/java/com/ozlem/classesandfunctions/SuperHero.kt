package com.ozlem.classesandfunctions

// primary constructor:
class SuperHero{

    // properties:
    var name = ""
    var age = 0
    var job = ""
    var hairColor = ""

    // "Constructor" is a function called when we create an object from a class.
    constructor(nameInput : String , ageInput : Int , jobInput : String){
        this.name = nameInput
        this.age = ageInput
        this.job = jobInput
    }

    fun testFunciton(){
        println("test")
    }


}

