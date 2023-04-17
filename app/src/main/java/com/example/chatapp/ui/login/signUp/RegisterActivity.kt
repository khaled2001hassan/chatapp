package com.example.chatapp.ui.login.signUp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.chatapp.R
import com.example.chatapp.base.Base
import com.example.chatapp.databinding.ActivityRegisterBinding

class RegisterActivity : Base<RegisterViewModel, ActivityRegisterBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        bind = DataBindingUtil.setContentView(this, R.layout.activity_register)
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        bind.vm = viewModel
        observation()
    }
    fun observation(){
        viewModel.isLoadingLiveData.observe(this){
            if (it){
                showLoading()
            }else{
                hideLoading()
            }
        }
        viewModel.dialogMessageLiveData.observe(this){
            if (it=="done"){
                finish()
            }else{
                showMessage(title = it, posButtonTitle = "ok")
            }
        }
    }
}