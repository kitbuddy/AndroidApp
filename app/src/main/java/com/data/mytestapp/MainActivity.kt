package com.data.mytestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton = findViewById<Button>(R.id.rollButton);
        val textBoxId = findViewById<TextView>(R.id.myTextView);
        val seekBarId = findViewById<SeekBar>(R.id.mySeekBar);

        rollbutton.setOnClickListener {
            val rando = Random().nextInt(seekBarId.progress )
            textBoxId.text = rando.toString();
        }
    }
}