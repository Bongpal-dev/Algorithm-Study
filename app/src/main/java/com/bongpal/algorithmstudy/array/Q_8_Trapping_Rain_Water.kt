package com.bongpal.algorithmstudy.array

fun main() {
    val sol = Solution8()
    val case1 = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
    val case2 = intArrayOf(4, 2, 0, 3, 2, 5)
    val case3 = intArrayOf(4, 2, 3)

    println("case1 ===========================")
    println(sol.trap(case1))
    println("case2 ===========================")
    println(sol.trap(case2))
    println("case3 ===========================")
    println(sol.trap(case3))
}

class Solution8 {
    fun trap(height: IntArray): Int {
        if (height.size < 3) return 0

        var result = 0
        var startMax = height.first()
        var endMAx = height.last()
        var start = 0
        var end = height.lastIndex

        while (start < end) {
            if (height[start] <= height[end]) {
                start++
                startMax = maxOf(startMax, height[start])
                val waterHeight = startMax - height[start]

                if (waterHeight > 0) result += waterHeight
            } else {
                end--
                endMAx = maxOf(endMAx, height[end])
                val waterHeight = endMAx - height[end]

                if (waterHeight > 0) result += waterHeight
            }
        }
        return result
    }
}

// https://leetcode.com/problems/trapping-rain-water/