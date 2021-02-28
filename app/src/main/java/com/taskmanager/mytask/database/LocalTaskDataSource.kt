package com.taskmanager.mytask.database

import com.taskmanager.mytask.entity.TaskEntity
import io.reactivex.Completable
import io.reactivex.Flowable

/**
 * Created by Nguyễn Thành Chung on 2/22/21.
 */
class LocalTaskDataSource(taskDao: TaskDao?) : TaskDataSource {
    private var taskDao : TaskDao? = taskDao

    override fun getAllTask(): Flowable<TaskEntity>? {
        return taskDao?.getAllTask()
    }

    override fun insertTask(taskEntity: TaskEntity?): Completable? {
        return taskDao?.insertTask(taskEntity)
    }

    override fun updateTask(taskEntity: TaskEntity?) : Completable?{
        return taskDao?.updateTask(taskEntity)
    }

    override fun deleteTask(taskEntity: TaskEntity?) : Completable?{
        return taskDao?.deleteTask(taskEntity)
    }


}