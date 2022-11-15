package com.example.frame14

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment: Fragment = IntroFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, fragment)
            .addToBackStack(null).commit()


        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val passengerFragment: Fragment = PassengerFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, passengerFragment)
                .addToBackStack(null).commit()
        }, 3000)


    }
}