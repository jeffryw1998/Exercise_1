package com.example.exercise_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     fun buReset(view:View){
        editTextCarPrice.setText("");
        editTextDownPayment.setText("");
         editTextInterestRate.setText("");
         editTextLoanPeriod.setText("");
    }

    fun buCalculate(view: View){

        val total : Double = editTextCarPrice.text.toString().toDouble() - editTextDownPayment.text.toString().toDouble()

        val textView1 = findViewById<TextView>(R.id.textView1).apply {
            text = total.toString()
        }

        val total2 : Double = total.toString().toDouble() * editTextInterestRate.text.toString().toDouble() * editTextLoanPeriod.text.toString().toDouble()

        val textView2 = findViewById<TextView>(R.id.textView1).apply {
            text = total2.toString()
        }

        val total3 : Double = (total.toString().toDouble() + total2.toString().toDouble() / editTextLoanPeriod.text.toString().toDouble() / 12)

        val textView3 = findViewById<TextView>(R.id.textView1).apply {
            text = total3.toString()
        }


    }


}
