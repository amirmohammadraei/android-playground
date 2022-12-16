package com.example.kotProject

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OkPage : AppCompatActivity() {
    var textView: TextView? = null
    var imageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ok_page)
        textView = findViewById(R.id.textView)
        imageView = findViewById(R.id.imageView)
    }
}