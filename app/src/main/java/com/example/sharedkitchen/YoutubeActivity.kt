package com.example.youtubeplayerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sharedkitchen.R
import kr.co.prnd.YouTubePlayerView

class YoutubeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val youTubePlayerView = findViewById<YouTubePlayerView>(R.id.you_tube_player_view)
        youTubePlayerView.play(VIDEO_ID)
    }

    companion object {
        private const val VIDEO_ID = "tihZKUwguAA"
    }

}