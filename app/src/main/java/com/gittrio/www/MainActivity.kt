package com.gittrio.www

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Only useful codes used in this activity.


        AppCenter.start(getApplication(),
            "29b84e98-3617-4f34-a6b8-32dce04845bc",
            Analytics::class.java,
                    Crashes::class.java)
    }
}
