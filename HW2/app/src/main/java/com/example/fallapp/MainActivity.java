package com.example.fallapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView2);
        falls[0]="اَلا یا اَیُّهَا السّاقی اَدِرْ کَأسَاً و ناوِلْها\n" +
                "\n" +
                "که عشق آسان نمود اوّل ولی افتاد مشکل\u200Cها";

        falls[1]="شبِ تاریک و بیمِ موج و گردابی چنین هایل\n" +
                "\n" +
                "کجا دانند حالِ ما سبکبارانِ ساحل\u200Cها";

        falls[2]="مرا در منزلِ جانان چه امنِ عیش چون هر دَم\n" +
                "\n" +
                "جَرَس فریاد می\u200Cدارد که بَربندید مَحمِل\u200Cها";
        falls[3]="به بویِ نافه\u200Cای کآخر صبا زان طُرّه بگشاید\n" +
                "\n" +
                "ز تابِ جَعدِ مشکینش چه خون افتاد در دل\u200Cها";
        falls[4]="حضوری گر همی\u200Cخواهی از او غایب مشو حافظ\n" +
                "\n" +
                "مَتٰی ما تَلْقَ مَنْ تَهْویٰ دَعِ الدُّنْیا و اَهْمِلْها";
    }

    String[] falls=new String[5];


    public void getFall(View view){
        Random random=new Random();
        int x=random.nextInt(5);
        textView.setText(falls[x]);


    }
    public void getAbout(View view){

        textView.setText("این برنامه در تاریخ 1401-9-9 نوشته شده و اولین نسخه ان منتشر شده است"+
                "\n" +"برنامه نویس: امیر محمد راعی - 9731083"


        );

    }


}
