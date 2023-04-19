package com.example.chatapp.ui.login.signIn

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.chatapp.R
import com.example.chatapp.base.Base
import com.example.chatapp.databinding.ActivitySigninBinding
import com.example.chatapp.ui.home.HomeActivity
import com.example.chatapp.ui.login.signUp.RegisterActivity

class SigninActivity: Base<SignInViewMoodel, ActivitySigninBinding>(),SigninNavigator{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = DataBindingUtil.setContentView(this@SigninActivity , R.layout.activity_signin)
        viewModel= ViewModelProvider(this).get(SignInViewMoodel::class.java)
        bind.vm=viewModel
        viewModel.signinNavigator=this
        bind.signUpTextView.setOnClickListener {
            val intent= Intent(this@SigninActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
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
            showMessage(title = it, posButtonTitle = "ok")
        }
    }

    override fun goTOHomeScreen() {
       val intent=Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}