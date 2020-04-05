package com.vandenbreemen.kevindesignsystemsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import com.vandenbreemen.kevindesignsystem.views.KDSSystemActivity

class SystemStatusLogDemo : KDSSystemActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_system_status_log_demo)
        super.onCreate(savedInstanceState)

        findViewById<View>(android.R.id.content).setBackgroundColor(getColor(R.color.kds_blackBackground))

        findViewById<ViewGroup>(R.id.mainContent).addView(layoutInflater.inflate(R.layout.layout_lorem_ipsum, null))

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

}
