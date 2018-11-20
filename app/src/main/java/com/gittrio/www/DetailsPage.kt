package com.gittrio.www

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class DetailsPage : AppCompatActivity() {


    lateinit var ibBackButtonDetails:ImageButton;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_page)

        onStartNewActivity()

        val actionBar = supportActionBar
        actionBar!!.hide()

        ibBackButtonDetails = findViewById(R.id.ibBackButtonDetails)
        ibBackButtonDetails.setOnClickListener {
            this.finish()
        }
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
