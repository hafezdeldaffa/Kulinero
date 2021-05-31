package com.dicoding.kulinero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.lang.Exception

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val timer = object : Thread(){
            override fun run() {
                try {
                    Thread.sleep(3000)
                    val move = Intent(baseContext, MainActivity::class.java)
                    startActivity(move)
                    finish()
                }catch (err: Exception){
                    err.printStackTrace()
                }
            }
        }
        timer.start()
    }
}