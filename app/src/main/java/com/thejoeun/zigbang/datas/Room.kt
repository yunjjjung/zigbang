package com.thejoeun.zigbang.datas

import java.lang.NumberFormatException
import java.text.NumberFormat
import java.util.*

class Room(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String) {


//    가격 값에 따라 => 억단위 표시 여부 가공 기능 => 함수로.

    fun getFormattedPrice() : String {

        if(this.price < 10000) {

            return NumberFormat.getNumberInstance(Locale.US).format(this.price)
        }
        else {
//            1억 이상. 1억 4,500 등으로
//            억? 몇억인지 => 가격을 10000 으로 나눈 몫임
            val uk = this.price / 10000

//            억 밑은 얼마인지
            val rest = this.price % 10000

//            rest => 컴마 처리
            val commaRest = NumberFormat.getNumberInstance(Locale.US).format(rest)

//            최종결과
            return "${uk}억 ${commaRest}"

        }
    }



//    층수 값에 따라 => 5층 , 반지하, 지하 2층 등으로 가공해주는 기능 => 함수 (function)

    fun getFormattedFloor() : String {
        //        층수 값에 따라 다른 값을 return
        if(this.floor >= 1) {
            return "${this.floor}층"
        }
        else if(this.floor == 0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }

    }

}