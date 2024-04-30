package com.example.amirbacked

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    lateinit var username: EditText
    lateinit var Email: EditText
    lateinit var Password: EditText
    lateinit var compass: EditText
    lateinit var RegisterBtn: Button
    lateinit var login: TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        username = findViewById(R.id.usernameEt)
        Email = findViewById(R.id.emailEt)
        Password = findViewById(R.id.passEt)
        compass = findViewById(R.id.conpassEt)
        RegisterBtn = findViewById(R.id.RgBtnEt)
        login = findViewById(R.id.textView1)



        val username = username.text.toString()
        val email = Email.text.toString()
        val password = Password.text.toString()
        val confirmpass = compass.text.toString()

        RegisterBtn.setOnClickListener {


            if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmpass.isEmpty()) {
                Toast.makeText(this, "please fill the fiealds", Toast.LENGTH_SHORT).show()
            } else if (password != confirmpass) {
                Toast.makeText(this, "password doesnt match", Toast.LENGTH_SHORT).show()

            } else if (Patterns.EMAIL_ADDRESS.matcher(email).matches() && email
                    .endsWith("@amirmunsi2014@gmail.com")
            ) {
                Toast.makeText(this, "your email is not match please try again ",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                Toast.makeText(this, "Registraition successful", Toast.LENGTH_SHORT).show()
            }
        }
        login.setOnClickListener {
            Toast.makeText(this, "continewing", Toast.LENGTH_SHORT).show()
        }


    }

}