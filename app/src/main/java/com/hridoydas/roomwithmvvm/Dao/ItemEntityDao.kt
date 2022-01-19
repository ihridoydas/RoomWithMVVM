package com.hridoydas.roomwithmvvm.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.hridoydas.roomwithmvvm.Model.ItemEntity

@Dao
interface ItemEntityDao {


    @Query("SELECT * FROM item_entity")
    fun getAllItemEntities(): List<ItemEntity>

    @Insert
    fun insertAll(vararg users: ItemEntity)

    @Delete
    fun delete(user: ItemEntity)

}