package com.exceptionsample

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import android.view.ViewGroup
import android.view.LayoutInflater
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter



/**
 * Created by shivanggoel on 26,February,2020
 */
class MyRecyclerViewAdapter<T> : BindingRecyclerViewAdapter<T>() {

    override fun onCreateBinding(
        inflater: LayoutInflater, @LayoutRes layoutId: Int,
        viewGroup: ViewGroup
    ): ViewDataBinding {
        val binding = super.onCreateBinding(inflater, layoutId, viewGroup)
//        Log.d(TAG, "created binding: $binding")
        return binding
    }

    override fun onBindBinding(
        binding: ViewDataBinding,
        bindingVariable: Int, @LayoutRes layoutId: Int,
        position: Int,
        item: T
    ) {
        super.onBindBinding(binding, bindingVariable, layoutId, position, item)
//        Log.d(TAG, "bound binding: $binding at position: $position")
    }
}