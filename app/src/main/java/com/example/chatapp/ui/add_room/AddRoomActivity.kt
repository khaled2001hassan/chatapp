package com.example.chatapp.ui.add_room

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.chatapp.R
import com.example.chatapp.base.Base
import com.example.chatapp.databinding.ActivityAddRoomBinding

class AddRoomActivity : Base<AddRoomViewModel, ActivityAddRoomBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_add_room)
        bind=DataBindingUtil.setContentView(this,R.layout.activity_add_room)
        viewModel=ViewModelProvider(this).get(AddRoomViewModel::class.java)
    }
}