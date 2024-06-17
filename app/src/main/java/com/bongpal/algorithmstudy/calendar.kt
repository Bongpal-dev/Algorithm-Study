package com.bongpal.algorithmstudy

import androidx.core.app.RemoteInput.Source

fun main() {
    val sol = Solution()

    sol.showCalendar(sol.makeCalenar(0, 31), "*", "_")

}


class Solution() {

    fun makeCalenar(weekDay: Int, days: Int): Array<Array<Int>> {
        var calendar = Array(6) { Array(7) { -1 } }
        var x = if (weekDay == 0) 6 else weekDay - 1
        var y = 0
        var day = 1

        while (day <= days) {
            if (x == 6) {
                calendar[y][x] = day++
                x = 0
                y++
            }

            calendar[y][x] = day++
            x++
        }
        return calendar
    }

    fun showCalendar(calendar: Array<Array<Int>>, delimiter: String, blank:String) {
        val result = calendar.map { week ->
            week.map { if (it == -1) blank else it.toString() }
        }

        result.forEach {
            println(it.joinToString(delimiter))
        }
    }
}