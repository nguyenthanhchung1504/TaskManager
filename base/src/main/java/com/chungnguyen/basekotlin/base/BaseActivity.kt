package com.chungnguyen.basekotlin.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Nguyễn Thành Chung on 7/19/20.
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
        initView()
    }


    @LayoutRes abstract fun layoutId() : Int

    abstract fun initView()
}