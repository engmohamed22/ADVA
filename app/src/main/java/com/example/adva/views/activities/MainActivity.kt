package com.example.adva.views.activities

import com.example.adva.data.utils.ProgressDisplay
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.adva.R
import com.example.adva.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , ProgressDisplay {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

    }
    override fun showProgress() {
        binding.progressBar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        binding.progressBar.visibility = View.GONE
    }
}