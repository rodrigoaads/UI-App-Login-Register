package com.rodrigoaads.loginandregisterscreen

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textCreateAccount.setOnClickListener {
            startRegister()
        }

    }

    fun startRegister(){
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}