package com.example.kotProject

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View.OnFocusChangeListener
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



//rates from exchangereates.org.uk
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
                        val x2: Int =nums[0]*42423
                        editText2!!.setText(x2)
                        val x3: Int = nums[0] *13434
                        editText3!!.setText(x3)
                        val x4: Int =nums[0] * 9499
                        editText4!!.setText(x4)
                        val x5: Int =nums[0]* 8157
                        editText5!!.setText(x5)
                        val x6: Int = nums[0]*36701
                        editText6!!.setText(x6)
                    }
                }
            }
        })
        editText3!!.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            @SuppressLint("ResourceType")
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (et1Focus == true) {
                    if (s.length != 0) {
                        val x2: Int =nums[0]*31578
                        editText2!!.setText(x2)
                        val x3: Int = nums[0] *7444
                        editText3!!.setText(x3)
                        val x4: Int =nums[0] * 7071
                        editText4!!.setText(x4)
                        val x5: Int =nums[0]* 6072
                        editText5!!.setText(x5)
                        val x6: Int = nums[0]*27319
                        editText6!!.setText(x6)
                    }
                }
            }
        })
        editText4!!.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            @SuppressLint("ResourceType")
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (et1Focus == true) {
                    if (s.length != 0) {
                        val x2: Int =nums[0]*44660072
                        editText2!!.setText(x2)
                        val x3: Int = nums[0] *10527
                        editText3!!.setText(x3)
                        val x4: Int =nums[0] *8587
                        editText4!!.setText(x4)
                        val x5: Int =nums[0]* 14143
                        editText5!!.setText(x5)
                        val x6: Int = nums[0]*38636
                        editText6!!.setText(x6)
                    }
                }
            }
        })
        editText5!!.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            @SuppressLint("ResourceType")
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (et5Focus == true) {
                    if (s.length != 0) {
                        val x2: Int =(nums[0]*52006)
                        editText2!!.setText(x2)
                        val x3: Int = nums[0] *12259
                        editText3!!.setText(x3)
                        val x4: Int =nums[0] * 11645
                        editText4!!.setText(x4)
                        val x5: Int =nums[0]* 16469
                        editText5!!.setText(x5)
                        val x6: Int = nums[0]*44992
                        editText6!!.setText(x6)
                    }
                }
            }
        })
        editText6!!.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            @SuppressLint("ResourceType")
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (et6Focus == true) {
                    if (s.length != 0) {
                        val x2: Int =nums[0]*11559
                        editText2!!.setText(x2)
                        val x3: Int = nums[0] *2725
                        editText3!!.setText(x3)
                        val x4: Int =nums[0] * 366
                        editText4!!.setText(x4)
                        val x5: Int =nums[0]* 2588
                        editText5!!.setText(x5)
                        val x6: Int = nums[0]*2223
                        editText6!!.setText(x6)
                    }
                }
            }
        })


    }
}