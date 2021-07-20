package com.fry.dortislem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numOne : Double? = null
    var numTwo : Double? = null
    var sonuc : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(view:View){

        numberInput()
        //numOne = firstNumber.text.toString().toDoubleOrNull()
        //numTwo = secondNumber.text.toString().toDoubleOrNull()

        if(numOne == null || numTwo == null){
            result.text = " Lutfen Sayi Giriniz !!! "
        }else{
            sonuc = numOne!! + numTwo!!
            result.text = "Result:  ${sonuc}"
        }

    }
    fun sub(view:View){

        numberInput()
        //numOne = firstNumber.text.toString().toDoubleOrNull()
        //numTwo = secondNumber.text.toString().toDoubleOrNull()

        if(numOne == null || numTwo == null){
            result.text = " Lutfen Sayi Giriniz !!! "
        }else{
            sonuc = numOne!! - numTwo!!
            result.text = "Result:  ${sonuc}"
        }
    }
    fun div(view:View){

        numberInput()
        //numOne = firstNumber.text.toString().toDoubleOrNull()
        //numTwo = secondNumber.text.toString().toDoubleOrNull()

        if(numOne == null || numTwo == null){
            result.text = " Lutfen Sayi Giriniz !!! "
        }else{
            sonuc = numOne!! / numTwo!!
            result.text = "Result:  ${sonuc}"
        }
    }
    fun mul(view:View){

        numberInput()
        //numOne = firstNumber.text.toString().toDoubleOrNull()
        //numTwo = secondNumber.text.toString().toDoubleOrNull()

        if(numOne == null || numTwo == null){
            result.text = " Lutfen Sayi Giriniz !!! "
        }else{
            sonuc = numOne!! * numTwo!!
            result.text = "Result:  ${sonuc}"
        }
    }


    fun numberInput(){
        numOne = firstNumber.text.toString().toDoubleOrNull()
        numTwo = secondNumber.text.toString().toDoubleOrNull()

    }


}