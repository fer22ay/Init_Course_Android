package com.fernando.curso

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById<TextView>(R.id.txt_output)
        val button = findViewById<Button>(R.id.btn_accion)

        button.setOnClickListener {
            navigationSecondActivity()
        }

    }

    private fun navigationSecondActivity() {
        val intent = Intent(this, SegundaActivity::class.java)
        intent.putExtra("name", "Kotlin is beautiful!")
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                val name = data?.getStringExtra("name2")
                text.text = name
            }
        }
    }

}