package com.gsm.samplesdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.gsm.additionutility.AdditionUtility

class MainActivity : AppCompatActivity() {

    private lateinit var tvAdditionResult: TextView

    // Activity Result Launcher
//    private val additionResultLauncher =
//        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
//            if (result.resultCode == RESULT_OK) {
//                val additionResult = result.data?.getDoubleExtra("addition_result", 0.0) ?: 0.0
//                tvAdditionResult.text = "Addition Result: $additionResult"
//            }
//        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        tvAdditionResult = findViewById(R.id.tvResult)
//        val btnOpenAddition: Button = findViewById(R.id.btnAddModule)
//
//        btnOpenAddition.setOnClickListener {
//            // Launch the addition activity
//            val intent = AdditionUtility.getAdditionIntent(this)
//            additionResultLauncher.launch(intent)
//        }
    }
}