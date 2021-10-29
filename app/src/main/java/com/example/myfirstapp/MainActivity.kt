package com.example.myfirstapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.databinding.ActivityMainBinding
import com.example.myfirstapp.utilities.MyClass

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val myClass = MyClass()
        myClass.saySomething()
    }
}