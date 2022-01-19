package com.hridoydas.roomwithmvvm.arch

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hridoydas.roomwithmvvm.database.AppDatabase
import com.hridoydas.roomwithmvvm.database.Entity.ItemEntity
import kotlinx.coroutines.launch

class ToBuyViewModel() : ViewModel() {


    private lateinit var repository: ToBuyRepository


    //TODO Its a Live Data
    val itemEntitiesLivadata = MutableLiveData<List<ItemEntity>>()

     fun init(appDatabase: AppDatabase){

        repository= ToBuyRepository(appDatabase)

         Log.d("main", "Corotines has Start")
         viewModelScope.launch {

             val items = repository.getAllItems()
             itemEntitiesLivadata.postValue(items)

         }
    }

    fun insertItem(itemEntity: ItemEntity){

        repository.insertItem(itemEntity)
    }

    fun deleteItem(itemEntity: ItemEntity){

        repository.deleteItem(itemEntity)
    }

}