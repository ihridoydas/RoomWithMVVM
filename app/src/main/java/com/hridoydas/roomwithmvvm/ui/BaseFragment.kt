package com.hridoydas.roomwithmvvm.ui

import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.hridoydas.roomwithmvvm.arch.ToBuyViewModel
import com.hridoydas.roomwithmvvm.database.AppDatabase

open class BaseFragment:Fragment() {

    protected val mainActivity: MainActivity
        get() = activity as MainActivity

    protected val appDatabase: AppDatabase
    get() = AppDatabase.getDatabase(requireActivity())


    protected val sharedViewModel:ToBuyViewModel by activityViewModels()


}