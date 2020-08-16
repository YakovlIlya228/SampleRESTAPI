package com.example.samplerestapitest

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sampleRecycler = sampleRecycler
        val adapter = SampleListAdapter(this)
        sampleRecycler.layoutManager = LinearLayoutManager(this)
        sampleRecycler.adapter = adapter
        val viewModel = ViewModelProvider(this).get(SampleViewModel::class.java)
        viewModel.posts.observe(this, Observer {
            adapter.setPosts(it)
        })
    }
}