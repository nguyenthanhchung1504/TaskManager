package com.taskmanager.mytask.database

import androidx.room.*
import com.taskmanager.mytask.entity.TaskEntity
import io.reactivex.Completable
import io.reactivex.Flowable


/**
 * Created by Nguyễn Thành Chung on 2/22/21.
 */
@Dao
interface TaskDao {
    @Query("SELECT * FROM Task")
    fun getAllTask(): Flowable<TaskEntity>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(task: TaskEntity?) : Completable?

    @Delete
    fun deleteTask(task: TaskEntity?) : Completable?

    @Update
    fun updateTask(task: TaskEntity?) : Completable?
}