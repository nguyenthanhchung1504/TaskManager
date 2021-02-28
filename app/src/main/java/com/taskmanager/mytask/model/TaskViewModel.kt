package com.taskmanager.mytask.model

import androidx.lifecycle.ViewModel
import com.taskmanager.mytask.database.TaskDataSource
import com.taskmanager.mytask.entity.TaskEntity
import io.reactivex.Completable


/**
 * Created by Nguyễn Thành Chung on 2/22/21.
 */
class TaskViewModel : ViewModel {
    private var mDataSource: TaskDataSource? = null

    constructor(dataSource: TaskDataSource?){
        this.mDataSource = dataSource
    }


    fun insertTask(taskEntity: TaskEntity?): Completable? {
        return mDataSource?.insertTask(taskEntity)
    }

}