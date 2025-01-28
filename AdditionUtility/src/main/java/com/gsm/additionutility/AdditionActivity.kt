package com.gsm.additionutility

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AdditionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addition)

        val etNumber1: EditText = findViewById(R.id.etNumber1)
        val etNumber2: EditText = findViewById(R.id.etNumber2)
        val btnAdd: Button = findViewById(R.id.btnAdd)

        btnAdd.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = etNumber2.text.toString().toDoubleOrNull() ?: 0.0
            val result = num1 + num2

            // Pass the result back to the main app
            val data = intent.apply {
                putExtra("addition_result", result)
            }
            setResult(Activity.RESULT_OK, data)
            finish()
        }
    }
}
