package com.example.logonrm.room

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData

class NotaViewModel(application: Application): AndroidViewModel(application){

    val notaRepository = NotaRepository(application)
    val notas : LiveData<List<Nota>>?

    init {
        notas = notaRepository.notas
    }

    fun criar(nota: Nota){
        notaRepository.criar(nota)
    }
}