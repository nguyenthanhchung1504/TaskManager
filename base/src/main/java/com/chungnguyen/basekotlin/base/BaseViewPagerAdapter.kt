package com.chungnguyen.basekotlin.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * Created by Nguyễn Thành Chung on 7/19/20.
 */
abstract class BaseViewPagerAdapter : FragmentStatePagerAdapter{

    var fragmentManager: FragmentManager
    var listFragment: ArrayList<BaseFragment>

    constructor(fragmentManager: FragmentManager,listFragment: ArrayList<BaseFragment>) : super(fragmentManager) {
        this.fragmentManager = fragmentManager
        this.listFragment = listFragment
    }

    override fun getCount(): Int {
        return listFragment.size
    }

    override fun getItem(position: Int): Fragment {
        return listFragment[position]
    }
}