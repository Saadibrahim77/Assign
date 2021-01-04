package com.example.architechturecomponents

import LiveDataViewModel.LDVM
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.architechturecomponents.ViewmodelPackage.viewmodel


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }

    fun btn_viewmodel(view: View) {
        startActivity(Intent(this,viewmodel::class.java))
    }
    fun btn_livedataandviewmodel(view: View) {
        startActivity(Intent(this,LDVM::class.java))
    }


}