package com.hridoydas.roomwithmvvm

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hridoydas.roomwithmvvm.Dao.ItemEntityDao
import com.hridoydas.roomwithmvvm.Model.ItemEntity

@Database(
    entities = [ItemEntity::class],
    version  = 1
)
abstract class AppDatabase :RoomDatabase() {

    abstract fun itemEntityDao() :ItemEntityDao
}