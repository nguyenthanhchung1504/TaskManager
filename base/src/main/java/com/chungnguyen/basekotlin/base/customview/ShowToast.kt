package com.chungnguyen.basekotlin.base.customview

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.chungnguyen.basekotlin.R
import kotlinx.android.synthetic.main.custom_view_error_show_toast_layout.view.*
import kotlinx.android.synthetic.main.custom_view_normal_show_toast_layout.view.*
import kotlinx.android.synthetic.main.custom_view_warning_show_toast_layout.view.*

/**
 * Created by Nguyễn Thành Chung on 7/19/20.
 */
class ShowToast : Toast {
    private var context : Context
    private var style : String
    private var message : String

    companion object{
        const val NORMAL : String = "NORMAL"
        const val ERROR : String = "ERROR"
        const val WARNING : String = "WARNING"

    }

    constructor(context : Context,style : String = NORMAL,message : String = "") : super(context){
        this.context = context
        this.style = style
        this.message = message
        initView(style)
    }

    
    private fun initView(style: String) {
        var view : View? = null
        when(style){
            NORMAL ->{
                view = LayoutInflater.from(context).inflate(R.layout.custom_view_normal_show_toast_layout,null)
                view.rootView.tvTextNormal.text = message
            }
            ERROR -> {
                view = LayoutInflater.from(context).inflate(R.layout.custom_view_error_show_toast_layout,null)
                view.rootView.tvTextError.text = message
            }
            WARNING -> {
                view = LayoutInflater.from(context).inflate(R.layout.custom_view_warning_show_toast_layout,null)
                view.rootView.tvTextWarning.text = message
            }
        }

        setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL,0,context.resources.getDimensionPixelOffset(R.dimen._40sdp))
        setView(view)
    }


}