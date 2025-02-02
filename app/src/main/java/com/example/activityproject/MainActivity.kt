package com.example.activityproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btnclick)
        button.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        // Called when the activity is becoming visible to the user
        println("MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        // Called when the activity will start interacting with the user
        println("MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        // Called when the system is about to start resuming another activity
        println("MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        // Called when the activity is no longer visible to the user
        println("MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Called when the activity is about to be destroyed
        println("MainActivity onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        // Called after your activity has been stopped, just before it is started again
        println("MainActivity onRestart")
    }
}


