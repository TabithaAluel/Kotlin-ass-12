package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.*

class MainActivity2 : AppCompatActivity() {

    lateinit var etname:EditText
    lateinit var etemail:EditText
    lateinit var etphone:EditText
    lateinit var etpassword:EditText
    lateinit var spGender: Spinner
    lateinit var btnsignup:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
    fun castView(){
        etname=findViewById(R.id.etname)
        etemail=findViewById(R.id.etemail)
        etphone=findViewById(R.id.etphone)
        etpassword=findViewById(R.id.etpassword)
        spGender=findViewById(R.id.SPGender)
        btnsignup=findViewById(R.id.btnsignup)
        var gender=arrayOf("FEMALE","MALE")
        var genderAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,gender)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=genderAdapter


    }
    fun onClick(){
        btnsignup.setOnClickListener {
            var name=etname.text.toString()
            var email=etemail.text.toString()
            var phone=etphone.text.toString()
            var password=etpassword.text.toString()
            var gender=spGender.selectedItem.toString()
            var User=User(name,email,phone,password,gender)

            Toast.makeText(baseContext,User.toString(),Toast.LENGTH_LONG).show()
            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)

        }

    }
    data class User(var name:String,var email:String,var phone:String,var password:String,var gender:String)
}
