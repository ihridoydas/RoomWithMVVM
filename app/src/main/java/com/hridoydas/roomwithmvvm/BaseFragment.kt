package com.hridoydas.roomwithmvvm

import androidx.fragment.app.Fragment
import com.hridoydas.roomwithmvvm.database.AppDatabase

class BaseFragment:Fragment() {

    protected val mainActivity:MainActivity
        get() = activity as MainActivity

    protected val appDatabase: AppDatabase
    get() = AppDatabase.getDatabase(requireActivity())
}