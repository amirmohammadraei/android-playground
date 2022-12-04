package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun void getFall(View view){
        Random random=new Random();
        int x=random.nextInt(5);
        textView.setText(falls[x]);


    }
    fun void getAbout(View view){

        textView.setText("این برنامه در تاریخ 1401-9-9 نوشته شده و اولین نسخه ان منتشر شده است"+
                "\n" +"برنامه نویس: امیر محمد راعی - 9731083"


        );

    }



}
