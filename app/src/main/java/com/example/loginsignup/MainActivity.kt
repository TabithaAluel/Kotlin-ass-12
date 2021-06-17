package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etemail:EditText
    lateinit var etpassword: EditText
    lateinit var btnlogin:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()



    }
    fun castView(){
        etemail=findViewById(R.id.etemail)
        etpassword=findViewById(R.id.etpassword)
        btnlogin=findViewById(R.id.btnlogin)

    }
    fun onClick(){
        btnlogin.setOnClickListener {
            var intent=Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}