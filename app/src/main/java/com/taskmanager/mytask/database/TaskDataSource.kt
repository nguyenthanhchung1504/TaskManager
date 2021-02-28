package com.taskmanager.mytask.database

import com.taskmanager.mytask.entity.TaskEntity
import io.reactivex.Completable
import io.reactivex.Flowable


/**
 * Created by Nguyễn Thành Chung on 2/22/21.
 */
interface TaskDataSource {
    fun getAllTask(): Flowable<TaskEntity>?

    fun insertTask(taskEntity: TaskEntity?) : Completable?

    fun updateTask(taskEntity: TaskEntity?) : Completable?

    fun deleteTask(taskEntity: TaskEntity?) : Completable?
}