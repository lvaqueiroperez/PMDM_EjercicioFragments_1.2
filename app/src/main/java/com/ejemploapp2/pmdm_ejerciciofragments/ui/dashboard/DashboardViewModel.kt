package com.ejemploapp2.pmdm_ejerciciofragments.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//EN ESTAS CLASES SE CREA LA VARIABLE CON EL TEXTO INFORMATIVO QUE SE MOSTRARÁ EN CADA FRAGMENT
class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text
}