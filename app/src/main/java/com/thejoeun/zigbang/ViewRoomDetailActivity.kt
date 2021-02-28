package com.thejoeun.zigbang

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class ViewRoomDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("roomInfo")


    }

}