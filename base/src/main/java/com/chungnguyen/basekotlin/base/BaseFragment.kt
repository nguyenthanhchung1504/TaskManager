package com.chungnguyen.basekotlin.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

/**
 * Created by Nguyễn Thành Chung on 7/19/20.
 */
abstract class BaseFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = LayoutInflater.from(context).inflate(layoutId(),container,false)
        initView(view)
        return view
    }

    @LayoutRes
    abstract fun layoutId(): Int

    abstract fun initView(view : View)
}