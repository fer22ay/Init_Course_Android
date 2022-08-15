package com.fernando.curso

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {

    private var name: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val button = findViewById<Button>(R.id.btn_back)
        val text = findViewById<TextView>(R.id.txt_output)

        intent.extras?.let { bundle ->
            name = bundle.getString("name")
        }

        text.text = name

        button.setOnClickListener {
            val intent = Intent()
            intent.putExtra("name2", "Hello from second activity")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}