package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myfirstapp.R
import androidx.navigation.ui.NavigationUI
import com.example.myfirstapp.databinding.ActivityMain2Binding
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    private var appBarConfiguration: AppBarConfiguration? = null
    private var binding: ActivityMain2Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding!!.root)
        setSupportActionBar(binding!!.toolbar)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration.Builder(navController.graph).build()
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration!!)
        binding!!.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main)
        return (NavigationUI.navigateUp(navController, appBarConfiguration!!)
                || super.onSupportNavigateUp())
    }
}