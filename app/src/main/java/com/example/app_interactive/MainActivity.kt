package com.example.app_interactive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    lateinit var  (used when you want to pre assign variables)
    lateinit var txtCount: TextView
//    txtCount = variable name
    lateinit var btnToast: Button
    lateinit var btnCount: Button
    lateinit var btnRandom : Button
//    .xml is for layout and frontend, backend is for java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var txtCount: TextView = findViewById(R.id.txt.count) without lateinit
//        var txtCount = findViewById<TextView>(R.id.txt.count) without lateinit
//        change TextView button ImageView
        txtCount = findViewById(R.id.btn_0)
        btnCount = findViewById(R.id.btn_COUNTDOWN)
        btnRandom = findViewById(R.id.btn_RANDOM)
        btnToast = findViewById(R.id.btn_TOAST)

//        var textCount: String = txtCount.text
//        textview is always char type, not String .toString()
        btnToast.setOnClickListener {
//            when you click btnToast
            Toast.makeText(this, "Click Toast Button",Toast.LENGTH_LONG).show()
//            this can refer to the title activity
        }
//        if you use from textview,they only accept string only and need to change string after that change to int
        btnCount.setOnClickListener {
            var count: Int = txtCount.text.toString().toInt()
//            text is coz of android text.from String to Int
            count++
            txtCount.text = count.toString()
//            can have both get and set text,need to change int coz of get set
//            R.(dot) is always integer
        }
        btnRandom.setOnClickListener {
            val random = (0 until 100).shuffled().last()
            txtCount.text = random.toString()
//            shuffled and last is new keyword
        }
    }
}
