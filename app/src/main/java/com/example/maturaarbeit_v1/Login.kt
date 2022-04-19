package com.example.maturaarbeit_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {

    private lateinit var editEmail: EditText;
    private lateinit var editPassword: EditText;
    private lateinit var btnLogin: Button;
    private lateinit var btnSignUp: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editEmail = findViewById(R.id.Email)
        editPassword = findViewById(R.id.Password)
        btnLogin = findViewById(R.id.Login)
        btnSignUp = findViewById(R.id.Signup)

        btnSignUp.setOnClickListener{
            val intent = Intent (this, SignUp::class.java)
            startActivity(intent)
        }
    }
}