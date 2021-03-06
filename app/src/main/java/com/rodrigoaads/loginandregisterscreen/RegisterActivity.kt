package com.rodrigoaads.loginandregisterscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        textHaveAccount.setOnClickListener {
            startLogin()
        }
    }

    fun startLogin(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}