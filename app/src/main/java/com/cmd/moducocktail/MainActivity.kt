package com.cmd.moducocktail

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data:MutableList<Memo> = loadData()
        var adapter = CustomAdapter()
        adapter.listData = data
        recyclerView.adapter = adapter

        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun loadData() : MutableList<Memo>{
        val data:MutableList<Memo> = mutableListOf()
        for(no in 0..100){
            val title = "이것이 코틀린이다 ${no+1}"
            val date = System.currentTimeMillis()
            var memo = Memo(no, title, date)
            data .add(memo)
        }
        return data
    }
}