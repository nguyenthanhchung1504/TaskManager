package com.taskmanager.mytask.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chungnguyen.basekotlin.base.common.Common
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.taskmanager.mytask.R
import com.taskmanager.mytask.entity.TaskEntity
import com.thekhaeng.pushdownanim.PushDownAnim
import com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE
import com.thekhaeng.pushdownanim.PushDownAnim.MODE_STATIC_DP
import kotlinx.android.synthetic.main.bottom_sheet_add_task.*

/**
 * Created by Nguyễn Thành Chung on 2/23/21.
 */
class AddTaskBottomSheet : BottomSheetDialogFragment() {
    var taskEntity = TaskEntity()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.BottomSheetDialog)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet_add_task, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        try {
            initListener()
        } catch (e: Exception) {
            Common.handleException(e)
        }
    }

    private fun initListener() {
        try {
            PushDownAnim.setPushDownAnimTo(tvSave).setScale(MODE_STATIC_DP, 0.89f)
                .setOnClickListener {
                    processSaveTask()
                }

            PushDownAnim.setPushDownAnimTo(lnChooseDate).setScale(MODE_STATIC_DP, 0.89f)
                .setOnClickListener {
                    processChooseDate()
                }

            PushDownAnim.setPushDownAnimTo(ivFolder).setScale(MODE_STATIC_DP, 0.89f)
                .setOnClickListener {
                    processChooseFolder()
                }

            PushDownAnim.setPushDownAnimTo(ivImage).setScale(MODE_STATIC_DP, 0.89f)
                .setOnClickListener {
                    processChooseImage()
                }

            PushDownAnim.setPushDownAnimTo(ivCamera).setScale(MODE_STATIC_DP, 0.89f)
                .setOnClickListener {
                    processOpenCamera()
                }

        } catch (e: Exception) {
            Common.handleException(e)
        }
    }

    private fun processOpenCamera() {
        try {

        } catch (e: Exception) {
            Common.handleException(e)
        }
    }

    private fun processChooseImage() {
        try {

        } catch (e: Exception) {
            Common.handleException(e)
        }
    }

    private fun processChooseFolder() {
        try {

        } catch (e: Exception) {
            Common.handleException(e)
        }
    }

    private fun processChooseDate() {
        try {

        } catch (e: Exception) {
            Common.handleException(e)
        }
    }

    private fun processSaveTask() {
        try {

        } catch (e: Exception) {
            Common.handleException(e)
        }
    }


}