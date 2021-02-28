package com.chungnguyen.basekotlin.base.common

import java.lang.Exception

/**
 * Created by Nguyễn Thành Chung on 7/19/20.
 */
object Common {
    const val VERSION_DATABASE = 1

    fun handleException(ex : Exception){
        ex.printStackTrace()
    }

}