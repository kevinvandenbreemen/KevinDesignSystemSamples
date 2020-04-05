package com.vandenbreemen.kevindesignsystemsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vandenbreemen.kevindesignsystem.views.KDSSystemActivity

class SystemStatusLogDemo : KDSSystemActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_system_status_log_demo)
        super.onCreate(savedInstanceState)

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

}
