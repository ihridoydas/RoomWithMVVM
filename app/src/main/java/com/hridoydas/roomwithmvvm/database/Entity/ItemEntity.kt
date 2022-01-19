package com.hridoydas.roomwithmvvm.database.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "item_entity")
data class ItemEntity (
    @PrimaryKey
    val id: String = "",
    val title: String = "",
    val description: String ="",
    val priority : Int = 0,
    val createdAt : Long =0L,
    val categoryId: String = ""
        )