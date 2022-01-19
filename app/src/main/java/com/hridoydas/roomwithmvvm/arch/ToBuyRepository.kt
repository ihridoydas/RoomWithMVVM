package com.hridoydas.roomwithmvvm.arch

import com.hridoydas.roomwithmvvm.database.AppDatabase
import com.hridoydas.roomwithmvvm.database.Entity.ItemEntity

class ToBuyRepository(

    private val appDatabase: AppDatabase
) {

    //ToDo Interact database
    fun insertItem(itemEntity: ItemEntity){

        appDatabase.itemEntityDao().insert(itemEntity)
    }

    fun deleteItem(itemEntity: ItemEntity){

        appDatabase.itemEntityDao().delete(itemEntity)

    }

    suspend fun getAllItems():List<ItemEntity>{

        return appDatabase.itemEntityDao().getAllItemEntities()
    }
}