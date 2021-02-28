package com.thejoeun.zigbang.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.thejoeun.zigbang.R
import com.thejoeun.zigbang.datas.Room

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {


    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

//        설명 문구 : 있는 그대로
        descriptionTxt.text = data.description

//        주소/층수 => ~~시, ~~구, 5층 => String 가공
//        1이상, 0, -1이하 에 따라 다르게 가공되어야 함
//        상황에 따라 층수를 가공하는 기능을 => Room의 기능으로 추가해보자

        addressAndFloorTxt.text = "${data.address}, ${data.getFormattedFloor()}"

//        가격 표시 : price가 1만 이상, 아니냐에 따라 다르게 가공
//        1만 미만 : 8,500 로 컴마만 추가 , 1만 이상 : 5억 4,500 등으로 억단위 별도 표기
//        해당 기능도 Room의 기능으로 추가해서 사용하자

        priceTxt.text = "${data.getFormattedPrice()}"

        return row

    }

}