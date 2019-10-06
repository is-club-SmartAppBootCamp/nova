package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity as AppCompatActivity1

class DisplayMessageActivity : AppCompatActivity1() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        //
        val intent: Intent = getIntent()
        val message: String = intent.getStringExtra(MainActivity().EXTRA_MESSAGE)
        val textView: TextView = findViewById(R.id.textView)
        textView.setText(message)
    }
}
