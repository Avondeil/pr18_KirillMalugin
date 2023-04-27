package com.example.prakt18rmp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import com.google.gson.Gson


class TwoActivity : AppCompatActivity() {
    lateinit var namefilm: EditText
    lateinit var genrefilm: EditText
    lateinit var countryfilm: EditText
    private var infoname:String=""
    private var infogenre:String=""
    private var infocountry:String=""
    private var three:String="Нет повтора"
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        namefilm = findViewById(R.id.editone)
        genrefilm = findViewById(R.id.editthree)
        countryfilm = findViewById(R.id.edittwo)
        three=intent.getStringExtra("valfour").toString()
            if (three=="1")
        {
             infoname = intent.getStringExtra("valone").toString()
            infogenre = intent.getStringExtra("valtwo").toString()
            infocountry = intent.getStringExtra("valthree").toString()
            namefilm.setText(infoname)
            genrefilm.setText(infogenre)
            countryfilm.setText(infocountry)
        }

    }

    fun threeactivity(view: View) {
        val name = namefilm.text.toString()
        val genre = genrefilm.text.toString()
        val country = countryfilm.text.toString()
        val intent = Intent(this,Three::class.java)
        val js:String= Gson().toJson(name)
        val js2:String= Gson().toJson(genre)
        val js3:String= Gson().toJson(country)
            intent.putExtra("val", js)
        intent.putExtra("val2", js2)
        intent.putExtra("val3", js3)
            startActivity(intent)
            finish()
    }

}