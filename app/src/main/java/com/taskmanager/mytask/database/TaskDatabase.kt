package com.taskmanager.mytask.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.chungnguyen.basekotlin.base.common.Common
import com.taskmanager.mytask.entity.TaskEntity

/**
 * Created by Nguyễn Thành Chung on 2/22/21.
 */
@Database(entities = [TaskEntity::class], version = Common.VERSION_DATABASE)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao

    companion object {
        var instance: TaskDatabase? = null
        private const val DATABASE_NAME = "Task-database"

        fun getInstance(context: Context?) : TaskDatabase?{
            if (instance == null){
                instance =
                    context?.let {
                        Room.databaseBuilder(it,TaskDatabase::class.java, DATABASE_NAME)
                            .fallbackToDestructiveMigration()
                            .build()
                    }
            }
            return instance
        }
    }
}