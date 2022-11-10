package com.example.shualeduriregistracia0

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val ab=findViewById<EditText>(R.id.AB)
    val num=findViewById<EditText>(R.id.ooi)
    val cd=findViewById<EditText>(R.id.CD)
    val teq=findViewById<EditText>(R.id.Tnum)
    val btn=findViewById<Button>(R.id.button2)

    btn.setOnClickListener{
        val rab=ab.text.toString()
        val rnum=num.text.toString()
        val rcd=cd.text.toString()
        val rteq=teq.text.toString()

        if(rab==""||rnum==""||rcd==""||rteq==""){
            Toast.makeText(applicationContext,"შეავსეთ გრაფები",Toast.LENGTH_LONG).show()
        }else if(rab.length!=2||rcd.length!=2||rnum.length!=3){
            Toast.makeText(applicationContext,"ნომერი არსწორია",Toast.LENGTH_LONG).show()
        }else if(rteq.length!=9){
            Toast.makeText(applicationContext,"ტექ-პასპორტის ნომერი არსწორია",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(applicationContext,"თქვენ გავლილი გაქვთ ტექ-დათვალიერება",Toast.LENGTH_LONG).show()
        }
    }
    }
}
