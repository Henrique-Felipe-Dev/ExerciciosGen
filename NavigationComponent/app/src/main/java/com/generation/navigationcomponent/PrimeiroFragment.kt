package com.generation.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class PrimeiroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_primeiro, container, false)

        val buttonSegundo = view.findViewById<Button>(R.id.buttonSegundo)
        val buttonTerceiro = view.findViewById<Button>(R.id.buttonTerceiro)

        buttonSegundo.setOnClickListener {
            //NavController
            findNavController().navigate(R.id.action_primeiroFragment_to_segundoFragment)
        }

        buttonTerceiro.setOnClickListener {
            //NavController
            findNavController().navigate(R.id.action_primeiroFragment_to_terceiroFragment)
        }

        return view
    }

}