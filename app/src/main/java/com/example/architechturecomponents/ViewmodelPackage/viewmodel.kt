package com.example.architechturecomponents.ViewmodelPackage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.architechturecomponents.R
import kotlinx.android.synthetic.main.activity_viewmodel.*

class viewmodel : AppCompatActivity() {
    var number = 0
    lateinit var VM : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)

        VM = ViewModelProvider(this).get(MainViewModel::class.java)
        textview.text=VM.num.toString()
    }


    fun btn_Add(view: View) {
        VM.addone()
        textview.text=VM.num.toString()
    }

    /*override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        var num = savedInstanceState.get("num")
        textview.text=num.toString()
        number = num as Int
        super.onRestoreInstanceState(savedInstanceState)
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("num",number)
        super.onSaveInstanceState(outState)
    }*/
}