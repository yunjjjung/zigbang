package com.thejoeun.zigbang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thejoeun.zigbang.datas.Room

class MainActivity : AppCompatActivity() {

    val mBangList = ArrayList<Room>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}