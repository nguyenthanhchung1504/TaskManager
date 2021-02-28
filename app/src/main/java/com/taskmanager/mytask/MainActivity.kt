package com.taskmanager.mytask

import com.chungnguyen.basekotlin.base.BaseActivity
import com.chungnguyen.basekotlin.base.common.Common

class MainActivity : BaseActivity() {

    override fun layoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        try{

        }catch (e : Exception){
            Common.handleException(e)
        }
    }


}