package com.generation.jetpackviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    /*
    A partir do momento que definimos o dado como LiveData, estamos indicando
    que ele pode ser observado
     */
    var nome = MutableLiveData<String>()


}