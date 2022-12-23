package com.example.kotProject

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View.OnFocusChangeListener
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var editText1: EditText? = null
    var editText2: EditText? = null
    var editText3: EditText? = null
    var editText4: EditText? = null
    var editText5: EditText? = null
    var editText6: EditText? = null
    var nums = intArrayOf(1, 38740, 288000, 474490, 412620, 105040)
    var et1Focus = false
    var et2Focus = false
    var et3Focus = false
    var et4Focus = false
    var et5Focus = false
    var et6Focus = false
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText1 = findViewById(R.id.editText1) as EditText
        editText2 = findViewById(R.id.editText2)as EditText
        editText3 = findViewById(R.id.editText3)as EditText
        editText4 = findViewById(R.id.editText4)as EditText
        editText5 = findViewById(R.id.editText5)as EditText
        editText6 = findViewById(R.id.editText6)as EditText
        editText1!!.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            @SuppressLint("ResourceType")
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (et1Focus == true) {
                    if (s.length != 0) {
                        val x2: Int =nums[0]* nums[1]
                        editText2!!.setText(x2)
                        val x3: Int = nums[0] * nums[2]
                        editText3!!.setText(x3)
                        val x4: Int =nums[0] * nums[3]
                        editText4!!.setText(x4)
                        val x5: Int =nums[0]* nums[4]
                        editText5!!.setText(x5)
                        val x6: Int = nums[0]*nums[5]
                        editText6!!.setText(x6)
                    }
                }
            }
        })


    }
}