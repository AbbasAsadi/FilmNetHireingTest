package ir.filmNet.hiringTest.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import dagger.android.support.DaggerAppCompatActivity
import ir.filmNet.hiringTest.R
import ir.filmNet.hiringTest.ui.main.activity.MainActivity

class SplashActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                startActivity(
                    Intent(
                        this,
                        MainActivity::class.java
                    )
                )
            },
            3500
        )
    }
}