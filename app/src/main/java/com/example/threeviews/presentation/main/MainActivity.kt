package com.example.threeviews.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.threeviews.R
import com.example.threeviews.adapters.NavigationAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        tabLayout.addTab(tabLayout.newTab().setText("News").setIcon(R.drawable.ic_news))
        tabLayout.addTab(tabLayout.newTab().setText("Gallery").setIcon(R.drawable.ic_gallery))
        tabLayout.addTab(tabLayout.newTab().setText("Settings").setIcon(R.drawable.ic_settings))

        val adapter = NavigationAdapter(this, supportFragmentManager, tabLayout.tabCount)
        viewPager.adapter = adapter

        //Swipe in the screen
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })

    }
}