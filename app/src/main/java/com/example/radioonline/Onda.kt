package com.example.radioonline

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Onda : AppCompatActivity() {
    private lateinit var BPlayPause:Button
    private lateinit var BBack:Button
    private lateinit var Mplayer:MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onda)
    }
}