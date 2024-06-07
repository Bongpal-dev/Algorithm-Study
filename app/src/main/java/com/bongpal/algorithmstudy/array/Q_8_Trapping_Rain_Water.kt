package com.bongpal.algorithmstudy.array

import androidx.core.text.isDigitsOnly

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
        var result = 0
        var s = 0
        var e = 0

        while (true) {
            if (s > height.lastIndex || e > height.lastIndex) {
                break
            }

            if (s == e) {
                e++
                continue
            }

            if (height[s] < 1) {
                s++
                continue
            }

            if (height[e] < height[s]) {
                e++
            } else {
                result += countWater(height.copyOfRange(s, e + 1))
                s = e
                continue
            }

            if (e > height.lastIndex) {
                s++
                e = s
            }
        }

        return result
    }

    fun countWater(arr: IntArray): Int {
        var count = 0
        val limit = if (arr.first() < arr.last()) arr.first() else arr.last()

        arr.forEach {
            if (it < limit) count += limit - it
        }
        println("arr: ${arr.contentToString()}")
        println("count: $count")

        return count
    }
}

// https://leetcode.com/problems/trapping-rain-water/