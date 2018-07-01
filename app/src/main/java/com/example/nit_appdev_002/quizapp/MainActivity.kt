package com.example.nit_appdev_002.quizapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        startActivity(Intent(this, WelcomeActivity::class.java))
        finish()
    }
}
