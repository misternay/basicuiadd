package com.example.zerosx.uiandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)
        btn.setOnClickListener {
            var xxx = Intent(this,Login::class.java)
            startActivity(xxx)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)

        }
    }

}
