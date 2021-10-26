package com.example.threeviews.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.threeviews.presentation.one.OneFragment
import com.example.threeviews.presentation.three.ThreeFragment
import com.example.threeviews.presentation.two.TwoFragment

class NavigationAdapter(private val context: Context, fm: FragmentManager, private val totalTabs: Int) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int = totalTabs

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {
                return OneFragment()
            }
            1 -> {
                return TwoFragment()
            }
            2 -> {
                return ThreeFragment()
            }
            else -> return OneFragment()
        }
    }

}