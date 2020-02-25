package com.exceptionsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.ethanhua.skeleton.Skeleton
import com.exceptionsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewModel = ViewModelProviders.of(this).get(TodoListViewModel::class.java)
        var binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewmodel = viewModel

        var skeletonScreen = Skeleton.bind(binding.rvTodo)
            .adapter(binding.rvTodo.adapter)
            .load(R.layout.list_item_todo)
            .show()

//        skeletonScreen.hide()
    }
}
