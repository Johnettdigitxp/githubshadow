package com.gittrio.www

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.support.design.widget.TextInputLayout
import android.widget.Button
import android.widget.ImageButton

class SignUp : AppCompatActivity() {


    lateinit var ibBackButtonSignUp: ImageButton
    lateinit var btCancel:Button
    lateinit var btSignUp:Button
    lateinit var tllUsername:TextInputLayout
    lateinit var tllPassword:TextInputLayout
    lateinit var tllRetypePassword:TextInputLayout
    lateinit var tllEmail:TextInputLayout
    lateinit var tllContactNumber:TextInputLayout
    lateinit var tieUsername:TextInputEditText
    lateinit var tiePassword:TextInputEditText
    lateinit var tieRetypePassword:TextInputEditText
    lateinit var tieEmail:TextInputEditText
    lateinit var tieContactNumber:TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        onStartNewActivity()

        ibBackButtonSignUp = findViewById(R.id.ibBackButtonSignUp)
        ibBackButtonSignUp.setOnClickListener {
            this.finish()
        }

        val actionbar = supportActionBar
        actionbar!!.hide()
    }

    override fun finish() {
        super.finish()
        onLeaveThisActivity()
    }

    fun onStartNewActivity() {
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }

    fun onLeaveThisActivity() {
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}
