package com.example.pollsrus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class login : AppCompatActivity() {
    lateinit var edt_email2:EditText
    lateinit var edt_pass2:EditText
    lateinit var login:Button
    lateinit var edt_tv2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edt_email2=findViewById(R.id.email2)
        edt_pass2=findViewById(R.id.pass2)
        login=findViewById(R.id.login)
        edt_tv2=findViewById(R.id.tv2)

        edt_tv2.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}