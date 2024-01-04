package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.res.AssetManager

import java.io.File


class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var aManager : AssetManager

    lateinit var btnadd : Button
    lateinit var btnsub : Button
    lateinit var btnmul : Button
    lateinit var btndiv : Button
    lateinit var edita : EditText
    lateinit var editb : EditText
    lateinit var result : TextView
    lateinit var test : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aManager = assets
        btnadd = findViewById(R.id.btn_add)
        btnsub = findViewById(R.id.btn_sub)
        btnmul = findViewById(R.id.btn_mul)
        btndiv = findViewById(R.id.btn_div)
        test = findViewById(R.id.test)


        edita = findViewById(R.id.et_a)
        editb = findViewById(R.id.et_b)
        result = findViewById(R.id.result)

        btnadd.setOnClickListener(this)
        btnsub.setOnClickListener(this)
        btnmul.setOnClickListener(this)
        btndiv.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = edita.text.toString().toDouble()
        var b = editb.text.toString().toDouble()
        var res = 0.0
        when (v?.id){
            R.id.btn_add->{
                res = a + b
                readfile("test.txt")
            }
            R.id.btn_sub->{
                res = a - b
            }
            R.id.btn_mul->{
                res = a * b
            }
            R.id.btn_div->{
                res = a / b
            }
        }
        result.text = "Result is $res"
    }

    fun readfile(fname : String){
        //aManager.open(fname)
        val lines: List<String> = File(fname).readLines()

        lines.forEach{ line -> println(line)}
    }
}