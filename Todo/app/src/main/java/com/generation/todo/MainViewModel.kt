package com.generation.todo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.todo.model.Categoria
import com.generation.todo.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(
    val repository: Repository
) : ViewModel() {

    private val _responseListCategoria =
        MutableLiveData<Response<List<Categoria>>>()

    val reponseListCategoria: LiveData<Response<List<Categoria>>> =
        _responseListCategoria

    init {
        listCategoria()
    }


    fun listCategoria(){
        /*
        Declarar a nossa corrotina (ou seja, a Thread secundária que o
        método vai rodar)

        Como vamos executar a requisição dentro da ViewModel, utilizaremos a nossa
        corrotina no escopo da ViewModel (viewModelScope)
         */

        viewModelScope.launch {
            try {
                val response = repository.listCategoria()
                _responseListCategoria.value = response
            }catch (e: Exception){
                Log.d("ErroRequisicao", e.message.toString())
            }
        }
    }



}