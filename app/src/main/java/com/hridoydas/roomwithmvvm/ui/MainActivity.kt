package com.hridoydas.roomwithmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.hridoydas.roomwithmvvm.R
import com.hridoydas.roomwithmvvm.arch.ToBuyViewModel
import com.hridoydas.roomwithmvvm.database.AppDatabase


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel :ToBuyViewModel by viewModels()
        viewModel.init(AppDatabase.getDatabase(this))



    }
}