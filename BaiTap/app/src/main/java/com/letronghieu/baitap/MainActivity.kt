package com.letronghieu.baitap

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.letronghieu.baitap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signUp = findViewById<TextView>(R.id.SignUp)
        val logIn = findViewById<TextView>(R.id.LogIn)
        val signUpLayout = findViewById<View>(R.id.signUp_layout)
        val logInLayout = findViewById<View>(R.id.logIn_layout)
        val btn_LognIn = findViewById<Button>(R.id.btn_LogIn)

        signUp.setOnClickListener {
            signUp.background = resources.getDrawable(R.drawable.switch_trcks,null)
            signUp.setTextColor(resources.getColor(R.color.white,null))
            logIn.background = null
            logIn.setTextColor(resources.getColor(R.color.red,null))
            signUpLayout.visibility = View.VISIBLE
            logInLayout.visibility = View.GONE

        }
        logIn.setOnClickListener {
            logIn.background = resources.getDrawable(R.drawable.switch_trcks,null)
            logIn.setTextColor(resources.getColor(R.color.white,null))
            signUp.background = null
            signUp.setTextColor(resources.getColor(R.color.red,null))
            signUpLayout.visibility = View.GONE
            logInLayout.visibility = View.VISIBLE
        }
        btn_LognIn.setOnClickListener {
            startActivity(Intent(this@MainActivity,DemoLogIn::class.java))
        }
    }

}