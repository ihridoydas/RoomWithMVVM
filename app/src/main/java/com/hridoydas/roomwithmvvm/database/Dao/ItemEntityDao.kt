package com.hridoydas.roomwithmvvm.database.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.hridoydas.roomwithmvvm.database.Entity.ItemEntity

@Dao
interface ItemEntityDao {


    @Query("SELECT * FROM item_entity")
    suspend fun getAllItemEntities(): List<ItemEntity>

    @Insert
    fun insert(itemEntity: ItemEntity)

    @Delete
    fun delete(itemEntity: ItemEntity)

}