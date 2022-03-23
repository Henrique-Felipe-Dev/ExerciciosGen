package com.generation.jetpackviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.generation.jetpackviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Vamos gerar a variável que guardará a instância do viewBinding
    private lateinit var binding: ActivityMainBinding

    //Vamos gerar a variável que armazenará a instância da viewModel
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Vamos configurar o binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        //Configurar o binding para cuidar da raiz da nossa tela
        setContentView(binding.root)

        /*
        viewBinding - Guarda a referência de todos os objetos dentro de apenas uma variável
         */

        //Vamos criar de fato a instância da viewModel
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        /*
        //Recuperando os dados do nome da ViewModel manualmente
        binding.textNome.text = mainViewModel.nome
         */

        //Manter os dados da viewModel (nesse caso, o atributo nome), sendo observado
        mainViewModel.nome.observe(this){
            binding.textNome.text = it
        }

        binding.buttonGerar.setOnClickListener {

            mainViewModel.nome.value = binding.editNome.text.toString()

            /*
            //Recuperando os dados do nome da ViewModel manualmente
            binding.textNome.text = mainViewModel.nome
             */
        }
    }
}