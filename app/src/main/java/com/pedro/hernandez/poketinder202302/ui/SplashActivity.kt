package com.pedro.hernandez.poketinder202302.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.pedro.hernandez.poketinder202302.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 3000)
    }
}