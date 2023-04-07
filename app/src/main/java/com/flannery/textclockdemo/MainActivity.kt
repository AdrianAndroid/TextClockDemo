package com.flannery.textclockdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textClock1 = findViewById<TextClock>(R.id.textClock1)
        val textView1 = findViewById<TextView>(R.id.textview1)
        findViewById<Button>(R.id.btnGet).setOnClickListener {
            textView1.setText("Time: " + textClock1.text)
        }
    }
}