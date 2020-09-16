package com.example.design_four

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.design_four.fragment.FirstFragment
import com.example.design_four.fragment.SecondFragment
import com.example.design_four.fragment.ThirdFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

       setUpTabs()
    }

    private fun setUpTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FirstFragment(),"Explore")
        adapter.addFragment(SecondFragment(),"Flights")
        adapter.addFragment(ThirdFragment(),"Travel")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_explore)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_airplane)
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_travel)

    }
}





