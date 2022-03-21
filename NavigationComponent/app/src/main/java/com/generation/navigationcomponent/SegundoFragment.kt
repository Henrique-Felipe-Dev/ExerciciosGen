package com.generation.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SegundoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_segundo, container, false)

        val buttonVoltar = view.findViewById<Button>(R.id.buttonVoltar)

        buttonVoltar.setOnClickListener {
            findNavController().navigate(R.id.action_segundoFragment_to_primeiroFragment)
        }

        return view
    }

}