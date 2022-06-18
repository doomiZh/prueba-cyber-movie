package com.example.cybermovie.activity

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.VideoView
import com.example.cybermovie.R


class MainActivity : AppCompatActivity() {
    protected lateinit var videoView: VideoView
    protected lateinit var mMediaPlayer: MediaPlayer
    protected var mCurrentVideoPosition: Int=0

    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_CyberMovie)
        Thread.sleep(200)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   val btnlogin = findViewById<Button>(R.id.btnLogin)

        btnlogin.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, ListaVideos::class.java)
            startActivity(intent)
        })


        videoView = findViewById(R.id.videoView)

        val url = Uri.parse("android.resource://"
                +packageName
                +"/"
                + R.raw.kong
        )

       videoView.setVideoURI(url)
        videoView.start()

        videoView.setOnPreparedListener { mp ->
            mMediaPlayer = mp
            mMediaPlayer.isLooping = true

            if (mCurrentVideoPosition !=0){

                mMediaPlayer.seekTo(mCurrentVideoPosition)
                mMediaPlayer.start()
            }


        }
    }





    override fun onPause() {
        super.onPause()

        mCurrentVideoPosition = mMediaPlayer.currentPosition
        videoView.start()

    }


    override fun onResume() {
        super.onResume()

        videoView.start()
    }

    override fun onDestroy() {
        super.onDestroy()

        mMediaPlayer.release()

    }








}