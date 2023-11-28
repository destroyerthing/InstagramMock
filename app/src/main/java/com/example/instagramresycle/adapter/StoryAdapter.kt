package com.example.instagramresycle.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramresycle.databinding.StoryItemBinding
import com.example.instagramresycle.models.StoryItem

class StoryAdapter (private val list:List<StoryItem>):RecyclerView.Adapter<StoryAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryAdapter.ViewHolder {

val view = StoryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size



    override fun onBindViewHolder(holder: StoryAdapter.ViewHolder, position: Int) {
       holder.onBind(list[position])
    }

    inner class ViewHolder(private val binding: StoryItemBinding):RecyclerView.ViewHolder(binding.root){
        fun onBind(storyItem: StoryItem){
        binding.ivChannel.setImageResource(storyItem.image)
            if (storyItem.isViewed){
                binding.storyView.visibility = View.VISIBLE
            }else{
                binding.storyView.visibility = View.INVISIBLE
            }
        }
    }
}