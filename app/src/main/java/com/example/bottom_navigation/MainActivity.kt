package com.example.bottom_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottom_navigation.databinding.ActivityMainBinding
import com.example.bottom_navigation.fragments.AddElementFragment
import com.example.bottom_navigation.fragments.HomeFragment
import com.example.bottom_navigation.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {

    private var _binding:  ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        binding.bottomNavigation.setOnNavigationItemReselectedListener { item ->
            when(item.itemId){
                R.id.main ->{
                    supportFragmentManager.beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, HomeFragment())
                        .commit()
                    true
                }
                R.id.add -> {
                    supportFragmentManager.beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, AddElementFragment())
                        .commit()
                    true
                }
                R.id.profile -> {
                    supportFragmentManager.beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, ProfileFragment())
                        .commit()
                    true
                }
                else -> false
            }
        }
    }
}