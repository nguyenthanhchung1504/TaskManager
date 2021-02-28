package com.taskmanager.mytask.database

import android.content.Context
import com.taskmanager.mytask.model.ViewModelFactory


/**
 * Created by Nguyễn Thành Chung on 2/22/21.
 */
object Injection {
    fun provideTaskDataSource(context: Context?): TaskDataSource {
        val database = TaskDatabase.getInstance(context)
        return LocalTaskDataSource(database?.taskDao())
    }

    fun provideViewModelFactory(context: Context?): ViewModelFactory {
        val dataSource: TaskDataSource = provideTaskDataSource(context)
        return ViewModelFactory(dataSource)
    }
}