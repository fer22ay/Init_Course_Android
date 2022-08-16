package com.fernando.curso

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment(R.layout.fragment_second) {

    private var name: String? = ""
    private var age: Int? = 0
    private val args: SecondFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            name = args.name
            age = args.age
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = view.findViewById<TextView>(R.id.txt_second_fragment)
        val button = view.findViewById<Button>(R.id.btn_second_fragment)

        button.setOnClickListener {
            val result = "Result success!"
            setFragmentResult("requestKey", bundleOf("bundleKey" to result))
        }

        text.text = "$name $age"
    }
}