package com.thejoeun.zigbang.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.thejoeun.zigbang.datas.Room

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {



}