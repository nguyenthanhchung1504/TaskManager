package com.taskmanager.mytask.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.taskmanager.mytask.database.TaskDataSource


/**
 * Created by Nguyễn Thành Chung on 2/22/21.
 */
class ViewModelFactory(dataSource: TaskDataSource?) : ViewModelProvider.Factory {
    private var mDataSource: TaskDataSource? = dataSource



    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TaskViewModel::class.java)) {
            return TaskViewModel(mDataSource) as T
        }
        //noinspection unchecked
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}