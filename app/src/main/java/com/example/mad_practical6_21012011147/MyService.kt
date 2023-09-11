package com.example.mad_practical6_21012011147

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : Service() {
    lateinit var player : MediaPlayer
    companion object {
        val PLAYERKEY: "Service"
        val PLAYERVALUE: "play/pause"
    }

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Return the communication channel to the service.")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (!this :: player.isInitialized){
            player= MediaPlayer.create(this,R.raw.song)
        }
        if (intent!= null){

        }
    }
}