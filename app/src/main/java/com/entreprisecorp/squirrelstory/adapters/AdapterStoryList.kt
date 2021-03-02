package com.entreprisecorp.squirrelstory.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.entreprisecorp.squirrelstory.R

class AdapterStoryList() : RecyclerView.Adapter<AdapterStoryList.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imageStory = view.findViewById<ImageView>(R.id.imageStory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_story_list,parent,false)
        return AdapterStoryList.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }


}