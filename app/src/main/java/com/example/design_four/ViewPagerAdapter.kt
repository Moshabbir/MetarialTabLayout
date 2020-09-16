package com.example.design_four

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(supportFragmentManager: FragmentManager):FragmentPagerAdapter(supportFragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val mfragmentList = ArrayList<Fragment>()
    private val mfragmentTitleList = ArrayList<String>()

    override fun getCount(): Int {
        return mfragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return mfragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mfragmentTitleList[position]
    }

    fun addFragment(fragment: Fragment, title:String){
        mfragmentList.add(fragment)
        mfragmentTitleList.add(title)
    }
}