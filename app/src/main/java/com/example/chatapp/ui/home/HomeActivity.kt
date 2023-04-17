package com.example.chatapp.ui.home

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.chatapp.R
import com.example.chatapp.base.Base
import com.example.chatapp.databinding.ActivityHomeBinding

class HomeActivity : Base<HomeViewModel,ActivityHomeBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
        bind=DataBindingUtil.setContentView(this,R.layout.activity_home)
        viewModel=ViewModelProvider(this).get(HomeViewModel::class.java)
    }
}