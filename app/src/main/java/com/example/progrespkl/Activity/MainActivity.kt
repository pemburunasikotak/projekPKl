package com.example.progrespkl.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import bersatu.kita.part11.Viewmodel.ListViewModel
import com.example.progrespkl.R
import kotlinx.android.synthetic.main.activity_main.*
import io.reactivex.Observer as Observer1

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: ListViewModel
    private val photoListAdapter = (arrayListOf())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(ListViewModel::class.java)
        viewModel.fetchData()

        rv.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = photoListAdapter
        }
        observeViewModel()
    }

    fun observeViewModel() {
        viewModel.photos.observe(this, Observer1 { photos ->
            photos?.let {
                photoListAdapter.updatePhotos()
            }
        })
    }
}
