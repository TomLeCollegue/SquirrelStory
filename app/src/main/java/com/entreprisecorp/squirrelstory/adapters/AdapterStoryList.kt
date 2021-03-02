package com.entreprisecorp.squirrelstory.adapters

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityOptionsCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.recyclerview.widget.RecyclerView
import com.entreprisecorp.squirrelstory.HomeFragment
import com.entreprisecorp.squirrelstory.R

class AdapterStoryList(val view : View, val homeFragment: HomeFragment) : RecyclerView.Adapter<AdapterStoryList.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imageStory = view.findViewById<ImageView>(R.id.imageStory)
        val viewForThumb = view
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_story_list,parent,false)
        return AdapterStoryList.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5;
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.imageStory.setOnClickListener {

            it.apply {
                transitionName = "imageTransition"
            }
            val extras = FragmentNavigatorExtras(
                it to "imageTransition"
            )
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_storyFragment, null, null, extras)
        }



    }


}