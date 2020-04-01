package com.das.material_topbar_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {

    lateinit var mToolbar: Toolbar;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_profile)



    }


}
