package com.thejoeun.zigbang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.thejoeun.zigbang.adapters.RoomAdapter
import com.thejoeun.zigbang.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mAdapter: RoomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(Room(180000, "서울시 종로구", 4, "종로의 4층 방"))
        mRoomList.add(Room(8500, "고양시 종로구", -3, "종로의 4층 방"))
        mRoomList.add(Room(7000, "안양시 종로구", 6, "종로의 4층 방"))
        mRoomList.add(Room(7500, "천안시 종로구", 0, "종로의 4층 방"))
        mRoomList.add(Room(18000, "안산시 종로구", 5, "종로의 4층 방"))
        mRoomList.add(Room(12000, "서울시 구로구", 7, "종로의 4층 방"))
        mRoomList.add(Room(10000, "서울시 영등포구", 8, "종로의 4층 방"))
        mRoomList.add(Room(16000, "서울시 동작구", 5, "종로의 4층 방"))
        mRoomList.add(Room(9500, "서울시 강남구", -2, "종로의 4층 방"))
        mRoomList.add(Room(9200, "서울시 관악구", 4, "종로의 4층 방"))
        mRoomList.add(Room(15000, "서울시 강서구", 0, "종로의 4층 방"))
        mRoomList.add(Room(20000, "서울시 은평구", 9, "종로의 4층 방"))

        mAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mAdapter

    }
}