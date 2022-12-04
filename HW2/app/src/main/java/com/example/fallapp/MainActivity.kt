package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fallapp.R
import java.util.*

class MainActivity : AppCompatActivity() {


    val falls = arrayOf("")
    val textView = findViewById<TextView>(R.id.textView)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        falls[0] = "اَلا یا اَیُّهَا السّاقی اَدِرْ کَأسَاً و ناوِلْها\n" +
                "\n" +
                "که عشق آسان نمود اوّل ولی افتاد مشکل\u200Cها"

        falls[1] = "شبِ تاریک و بیمِ موج و گردابی چنین هایل\n" +
                "\n" +
                "کجا دانند حالِ ما سبکبارانِ ساحل\u200Cها"

        falls[2] = "مرا در منزلِ جانان چه امنِ عیش چون هر دَم\n" +
                "\n" +
                "جَرَس فریاد می\u200Cدارد که بَربندید مَحمِل\u200Cها"
        falls[3] = "به بویِ نافه\u200Cای کآخر صبا زان طُرّه بگشاید\n" +
                "\n" +
                "ز تابِ جَعدِ مشکینش چه خون افتاد در دل\u200Cها"
        falls[4] = "حضوری گر همی\u200Cخواهی از او غایب مشو حافظ\n" +
                "\n" +
                "مَتٰی ما تَلْقَ مَنْ تَهْویٰ دَعِ الدُّنْیا و اَهْمِلْها"
    }



    fun  getFall(){
        val random = Random()
        val x = random.nextInt(5)
        textView.text = falls[x]

    }
    fun  getAbout(){

        textView.text = "این برنامه در تاریخ 1401-9-9 نوشته شده و اولین نسخه ان منتشر شده است" +
                "\n" + "برنامه نویس: امیر محمد راعی - 9731083"

    }



}
