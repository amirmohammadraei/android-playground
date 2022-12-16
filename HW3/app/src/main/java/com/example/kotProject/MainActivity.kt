package com.example.kotProject
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun book1(view: View?) {
        val database = Database()
        val book = database.getBook(0)
        val goActivity = Intent()
        startActivity(goActivity)
    }


    fun book2(view: View?) {
        val database = Database()
        val book = database.getBook(2)
        val goActivity = Intent()
        startActivity(goActivity)
    }


    fun book3(view: View?) {
        val database = Database()
        val book = database.getBook(1)
        val goActivity = Intent()
        startActivity(goActivity)
    }

    fun book4(view: View?) {
        val database = Database()
        val book = database.getBook(3)
        val goActivity = Intent()
        startActivity(goActivity)
    }

    fun book5(view: View?) {
        val database = Database()
        val book = database.getBook(4)
        val goActivity = Intent()
        startActivity(goActivity)
    }
}


