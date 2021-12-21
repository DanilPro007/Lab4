package com.example.laba4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun my_click(v: View) {

        val b: Button = findViewById(R.id.inspect)

        b.setOnClickListener {

            var t: TextView = findViewById(R.id.rezult)
            var img: ImageView = findViewById(R.id.answer)
            val kil: TextView = findViewById(R.id.km)
            val km = kil.getText().toString().toDouble()
            val metr: TextView = findViewById(R.id.m)
            val m = metr.getText().toString().toDouble()
            val detc: TextView = findViewById(R.id.dm)
            val dm = detc.getText().toString().toDouble()
            val cant: TextView = findViewById(R.id.cm)
            val cm = cant.getText().toString().toDouble()
            val mil: TextView = findViewById(R.id.mm)
            val mm = mil.getText().toString().toDouble()

            if ((km * 1000 == m) and (dm / 10 == m) and (cm / 100 == m) and (mm / 1000 == m)) {
                t.text = "Отлично!"
                img.setImageResource(R.drawable.good)
                t.setTextColor(Color.parseColor("#0000FF"));
            } else {
                t.text = "Повторите материал, ответ неверный!"
                img.setImageResource(R.drawable.bad)
                t.setTextColor(Color.parseColor("#FF0000"));
            }


        }

    }

}