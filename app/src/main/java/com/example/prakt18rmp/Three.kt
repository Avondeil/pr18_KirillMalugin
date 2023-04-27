package com.example.prakt18rmp

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.gson.Gson

class Three : AppCompatActivity() {
    private lateinit var text1: TextView
    private var infoname:String=""
    private var infogenre:String=""
    private var infocountry:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three2)
        text1=findViewById(R.id.textInformation)
        infoname=intent.getStringExtra("val").toString()
        infogenre=intent.getStringExtra("val2").toString()
        infocountry=intent.getStringExtra("val3").toString()
        text1.setText("Название фильма: $infoname\nЖанр фильма: $infogenre\nСтрана: $infocountry")
    }

    fun backtwoactivity(view: View) {
        var four:String="1"
        val intent = Intent(this, TwoActivity::class.java)
        intent.putExtra("valone", infoname)
        intent.putExtra("valtwo", infogenre)
        intent.putExtra("valthree", infocountry)
        intent.putExtra("valfour", four)
        startActivity(intent)
        finish()
    }
}