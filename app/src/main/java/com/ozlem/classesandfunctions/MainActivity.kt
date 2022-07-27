package com.ozlem.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
// MainActivity ve xml dosyasını senkronize etmek için:
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Değişken define(tanımlama) ve initialize(başlatma):
        //var textView : TextView = findViewById(R.id.textViewID)

        var j = 0

        if (j == 0){
            println(firstFunction())
        }else{
            println(secondFunction())
        }

        // substraction fonksiyonu denemesi:
        println(substraction(10 , 20))

        // addition fonksiyonu denemesi:
        println(addition(10,50))

        // setOnClickListener method (onClick metodunun alternatifi):
        buttonID.setOnClickListener(){
            // Buradakiler sadece button tıklandığında olacak:
            val additionResult = addition(78,40)
            textViewID.text = "Result : ${additionResult}"
        }

        // fonksiyon çağırma:
        classWorking()

        // fonksiyon çağırma:
        nullSecurity()


    }

    // Fonksiyonları onCreate metodunun dışında tanımladık:
    fun firstFunction() {
        println("First function executed...")
    }

    fun secondFunction(){
        println("Second function executed...")
    }

    // input almak:
    // "Unit" Kotlin'de boş ya da boşluk anlamına gelir. Fonksiyonun sonunda nesne döndürmeyeceğinin kanıtıdır.
    fun substraction(x : Int , y : Int){
        textViewID.text = "Result : ${x - y}"
    }

    // Çıktı döndürmek:
    // Parantezden sonraki "Int", bir Int sonucu döndüreceğimiz anlamına gelir:
    fun addition(a : Int , b : Int) : Int{
        textViewID.text = "Result : ${a + b}" // emülatör için deneme
        return a + b // logcat için deneme

    }

    /*
    // buton için onClick metodu (id = buttonID):
    // Bir view tarafından çağrılacağını belirtmek için fonksiyonun içine "view" yazıyoruz.
    // view : value , View : Class
    fun onClickChange(view : View){

        val additionResult = addition(20 , 50)
        textViewID.text = "Result : ${additionResult}"
    }
    */

    fun classWorking(){

        // Şimdi "Int Class"tan bir nesne oluşturdum:
        var number = 5

        // constructor'dan önce:
        /*
        // SuperHero Class'ından br obje oluşturduk:
        var superHero = SuperHero()

        // Objelerin özelliklerine değer verdik:
        superHero.name = "Superman"
        superHero.job = "journalist"
        superHero.age = 50

        textViewID.text = "Age: ${superHero.age}"
         */

        // constructor'dan sonra:
        var superHero = SuperHero("Superman" , 50 , "journalist")
        textViewID.text = "Age: ${superHero.age}"
    }

    fun nullSecurity(){
        // null , nullability , null safety
        // null boş anlamına gelir.

        // Defining(tanımlama):
        var myString : String
        // myString şu anda null.
        // Initialization:
        myString = "Ozlem"

        // String nullable : Boş değer alabilen bir String anlamına gelir:
        var myString2 : String?
        // myString2 şuanda "string nullable".

        // Int nullable:
        var myAge : Int? = null
        // myAge şuanda null.
        println(myAge) // output : null

        // Nullable'ların değeri yoksa, buna göre kontroller yapmamız gerekir.

        // null safety metodları:
        // 1:
        if(myAge != null){
            println(myAge * 2)
        }else{
            println("Variable is null. So this result cannot be calculated.")
        }
        // 2:
        // !! -> null olmayacak
        // ?  -> null olabilir

        // Aşağıdaki gibi !! işareti kullanmak bu değer asla null olmayacak kesin eminim demektir.
        // Fakat bunu kullanırken çok dikkatli olmalıyız.
        println(myAge!!.minus(2))

        // 3: elvis operatörü (?)
        // sol taraftaki işlem null geliyorsa ? işaretinde belirttiğimiz sonucu alacak
        // sonuç null gelmiyorsa direkt onu alacak
        val result = myAge?.minus(2) ?:10
        println(result)

        // 4: let
        myAge?.let {
            // Burada it myAge değişkenine referans verir.
            // myAge'in değeri null ise bu blok hiç çalıştırılmıyor.
            // Eğer null değilse myAge değişkeninin değeri it'e yazılıyor.
            println(it * 5)
        }
    }
}

