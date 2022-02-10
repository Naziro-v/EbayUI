package com.nazirov.ebayui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initVIews()
    }

    private fun initVIews() {
        recyclerView = findViewById(R.id.recyclerView)
        val  manager = LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = manager

        refreshAdapter(getFavourites())
    }

    private fun getFavourites(): ArrayList<Favourite> {

        val items :ArrayList<Favourite> = ArrayList()
        items.add(Favourite("Apple watch", R.drawable.img_applewatch))
        items.add(Favourite("Apple watch", R.drawable.img_applewatch))
        items.add(Favourite("Apple watch", R.drawable.img_applewatch))
        items.add(Favourite("Apple watch", R.drawable.img_applewatch))
        items.add(Favourite("Apple watch", R.drawable.img_applewatch))
        items.add(Favourite("Apple watch", R.drawable.img_applewatch))
        items.add(Favourite("Apple watch", R.drawable.img_applewatch))
        items.add(Favourite("Apple watch", R.drawable.img_applewatch))
        items.add(Favourite("Apple watch", R.drawable.img_applewatch))
        items.add(Favourite("Apple watch", R.drawable.img_applewatch))

        return items

    }

    private fun refreshAdapter(items: ArrayList<Favourite>) {
        val adapter = FavouriteAdapter(this,items)
        recyclerView!!.adapter = adapter

    }
}