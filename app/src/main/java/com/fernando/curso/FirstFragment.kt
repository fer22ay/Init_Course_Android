package com.fernando.curso

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.btn_action)

        val resultado = view.findViewById<TextView>(R.id.txt_output)

        setFragmentResultListener("requestKey") { key, bundle ->
            val result = bundle.getString("bundleKey")
            resultado.text = result
        }

        button.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("Fernando", 27)
            findNavController().navigate(action)
        }

    }

}