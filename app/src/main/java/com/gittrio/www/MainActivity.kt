package com.gittrio.www

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {


    lateinit var btGoNextActivity: Button
    lateinit var btSignUp: Button
    lateinit var ibGoBackMain: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Only useful codes used in this activity.

        onStartNewActivity()

        btGoNextActivity = findViewById(R.id.btGotonextactivity)
        ibGoBackMain = findViewById(R.id.ibBackButtonMain)
        btSignUp = findViewById(R.id.btSignUp)

        btGoNextActivity.setOnClickListener {
            val intent = Intent(this,DetailsPage::class.java)
            startActivity(intent)
        }

        btSignUp.setOnClickListener {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }

        ibGoBackMain.setOnClickListener {
            this.finish()
        }

        //Appcenter analytics implementation.
        AppCenter.start(getApplication(),
            "29b84e98-3617-4f34-a6b8-32dce04845bc",
            Analytics::class.java,
                    Crashes::class.java)
        val actionBar = supportActionBar
        actionBar!!.hide()
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
