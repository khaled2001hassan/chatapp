package com.example.chatapp.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.chatapp.R
import com.example.chatapp.base.AdapterRoomRecycleView
import com.example.chatapp.base.Base
import com.example.chatapp.base.Rooms
import com.example.chatapp.databinding.ActivityHomeBinding
import com.example.chatapp.ui.add_room.AddRoomActivity

class HomeActivity : Base<HomeViewModel,ActivityHomeBinding>() {
    lateinit var adapter :AdapterRoomRecycleView
    val rooms = listOf(Rooms(roomName = "khaled", roomCategory = "music"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
        bind=DataBindingUtil.setContentView(this,R.layout.activity_home)
        viewModel=ViewModelProvider(this).get(HomeViewModel::class.java)
        bind.FabAddRoom.setOnClickListener {
            val intent = Intent(this,AddRoomActivity::class.java)
            startActivity(intent)
        }
        adapter =AdapterRoomRecycleView(rooms)
        bind.RoomsRecycleView.adapter=adapter
    }
}