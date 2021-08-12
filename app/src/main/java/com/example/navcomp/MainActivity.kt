package com.example.navcomp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment);
        val navController = navHostFragment?.findNavController();

        var button1 = findViewById<Button>(R.id.button1);
        var button2 = findViewById<Button>(R.id.button2);

        button1.setOnClickListener {
            navController?.navigate(R.id.action_fragmentMain_to_fragmentSecond);
        }

        button2.setOnClickListener {
            navController?.navigate(R.id.action_fragmentSecond_to_fragmentThird);
        }
    }
}