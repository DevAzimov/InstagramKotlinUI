
package com.magicapp.instagramkotlinui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.magicapp.instagramkotlinui.R
import com.magicapp.instagramkotlinui.adapter.FeedAdapter
import com.magicapp.instagramkotlinui.model.Feed
import com.magicapp.instagramkotlinui.model.Post
import com.magicapp.instagramkotlinui.model.Story


class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))
        refreshAdapter(getAllFeeds())
    }
    fun refreshAdapter(feeds: ArrayList<Feed>){
        val adapter = FeedAdapter(this, feeds)
        recyclerView!!.adapter = adapter
    }
    fun getAllFeeds(): ArrayList<Feed> {
        val stories: ArrayList<Story> = ArrayList()
        stories.add(Story(R.drawable.muslim_3, "Muslim"))
        stories.add(Story(R.drawable.muslim_1, "Muslim"))
        stories.add(Story(R.drawable.muslim_2, "Muslim"))
        stories.add(Story(R.drawable.muslim_4, "Muslim"))
        stories.add(Story(R.drawable.muslim_5, "Muslim"))
        stories.add(Story(R.drawable.muslim_6, "Muslim"))

        val feeds: ArrayList<Feed> = ArrayList<Feed>()
        feeds.add(Feed(stories))
        feeds.add(Feed(Post(R.drawable.muslim_1, "Muslim", R.drawable.masjid)))
        feeds.add(Feed(Post(R.drawable.muslim_2, "Muslim", R.drawable.masjid_4)))
        feeds.add(Feed(Post(R.drawable.muslim_3, "Muslim", R.drawable.masjid_5)))
        feeds.add(Feed(Post(R.drawable.muslim_4, "Muslim", R.drawable.kaba)))

        return feeds;
    }
}