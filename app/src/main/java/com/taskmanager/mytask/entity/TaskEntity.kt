package com.taskmanager.mytask.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.joda.time.DateTime
import java.io.File

/**
 * Created by Nguyễn Thành Chung on 2/22/21.
 */
@Entity(tableName = "Task")
data class TaskEntity(
    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "task_id")
    var TaskID : Int? = null,
    @ColumnInfo(name = "task_name")
    var TaskName : String? = null,
    @ColumnInfo(name = "description")
    var Description : String? = null,
    @ColumnInfo(name = "end_date")
    var EndDate : DateTime? = null,
    @ColumnInfo(name = "is_importance")
    var IsImportance : Boolean? = null,
    @ColumnInfo(name = "file")
    var File : File? = null
)
