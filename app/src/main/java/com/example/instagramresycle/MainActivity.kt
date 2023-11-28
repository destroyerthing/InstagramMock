package com.example.instagramresycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagramresycle.adapter.FeedAdapter
import com.example.instagramresycle.adapter.StoryAdapter
import com.example.instagramresycle.databinding.ActivityMainBinding
import com.example.instagramresycle.models.FeedItem
import com.example.instagramresycle.models.StoryItem


class MainActivity : AppCompatActivity() {

    private var storyList: MutableList<StoryItem> = ArrayList()
    private var feedList: MutableList<FeedItem> = ArrayList()

    private var storyAdapter: StoryAdapter? = null

    private var feedAdapter: FeedAdapter? = null

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initData()
        initAdapters()
        initRv()
    }


    private fun initData() {
    storyList.add(
        StoryItem(
        R.drawable.benavidez,
        false
    ))
        storyList.add(
            StoryItem(
                R.drawable.canelo,
                true
            ))
        storyList.add(
            StoryItem(
                R.drawable.virgil,
                false
            ))
        storyList.add(
            StoryItem(
                R.drawable.holland,
                true
            ))
        storyList.add(
            StoryItem(
                R.drawable.giroud,
                true
            ))

        feedList.add(
            FeedItem(
                R.drawable.benavidez2,
                R.drawable.benavidez,
                "2103213 likes",
                "Benavidez",
                "Im a boxer",
                "Benavidez"
            )
        )

        feedList.add(
            FeedItem(
                R.drawable.canelo2,
                R.drawable.canelo,
                "230293 likes",
                "Canelo",
                "Im a boxer",
                "Canelo"
            )
        )

        feedList.add(
            FeedItem(
                R.drawable.virgil2,
                R.drawable.virgil,
                "120399 likes",
                "Virgil",
                "Im a football player",
                "Virgil"
            )
        )

        feedList.add(
            FeedItem(
                R.drawable.holland2,
                R.drawable.holland,
                "3204390 likes" ,
                "Holland",
                "Im a football player",
                "Holland"
            )
        )


        feedList.add(
            FeedItem(
                R.drawable.giroud2,
                R.drawable.giroud,
                "239883 likes",
                "Giroud",
                "Im a football player",
                "Giroud"
            )
        )

    }

    private fun initAdapters() {

        storyAdapter = StoryAdapter(storyList)
        feedAdapter = FeedAdapter(feedList)

    }
    private fun initRv(){

        binding.rvStory.adapter = storyAdapter
        binding.rvFeeds.adapter = feedAdapter

    }

}