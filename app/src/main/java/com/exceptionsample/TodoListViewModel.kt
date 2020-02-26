package com.exceptionsample

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.lifecycle.ViewModel
import me.tatarka.bindingcollectionadapter2.ItemBinding


/**
 * Created by shivanggoel
 */
class TodoListViewModel : ViewModel() {

    val todoItems: ObservableList<String> = ObservableArrayList()
    val todoItemBinding: ItemBinding<String> = ItemBinding.of(BR.item, R.layout.list_item_todo)
    val adapter = MyRecyclerViewAdapter<String>()

    init {
        for (i in 1..10) {
            todoItems.add("hello world $i")
        }
        showTodoList()
    }

    fun showTodoList() {

    }


}