package com.example.architechturecomponents.ViewmodelPackage

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var num=0
    fun addone()
    {
        num++
    }
}