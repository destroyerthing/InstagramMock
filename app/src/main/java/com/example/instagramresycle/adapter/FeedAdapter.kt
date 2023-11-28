package com.example.instagramresycle.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramresycle.databinding.FeedItemBinding
import com.example.instagramresycle.models.FeedItem

class FeedAdapter(private val list:List<FeedItem>):RecyclerView.Adapter<FeedAdapter.ViewHolder>(){

    inner class ViewHolder(private val binding:FeedItemBinding): RecyclerView.ViewHolder(binding.root){

        fun onBind(feedItem: FeedItem){
           with(binding){
               bigImage.setImageResource(feedItem.bigImage)
               userImageView.setImageResource(feedItem.userImage)
               usernameTop.text = feedItem.userNameTop
               tvNumberOfLikes.text = feedItem.likeCount
               usernameBottom.text = feedItem.userNameBottom
               tvDescription.text = feedItem.comment

           }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedAdapter.ViewHolder {
        val view = FeedItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int  = list.size



    override fun onBindViewHolder(holder: FeedAdapter.ViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}