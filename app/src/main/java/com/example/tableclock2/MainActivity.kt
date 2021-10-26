package com.example.tableclock2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tableclock2.databinding.ActivityMainBinding
import com.example.tableclock2.settingsactivity.SettingsActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //This Code of line doesn't let screen to get off.
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // Code below is to Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //Todo: Extract the values of the user chosen color from the fragment_settings intent &
        // apply on the clock.
        this.binding.settingsButton.setOnClickListener {
            val intent = Intent(this,SettingsActivity::class.java )
            startActivity(intent)
        }
    }
}



