package com.sendo.covid_tracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_see_all?.setOnClickListener {
            val intent = Intent(this, ProvinceActivity::class.java)
            startActivity(intent)
        }
    }
}