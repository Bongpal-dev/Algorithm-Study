package com.bongpal.algorithmstudy.array

import kotlin.math.max
import kotlin.math.min

fun main() {
    val sol = Solution12()
    val case1 = intArrayOf(7, 1, 5, 3, 6, 4)
    val case2 = intArrayOf(7, 6, 4, 3, 1)
    val case3 = intArrayOf(2, 4, 1)
    val case4 = intArrayOf(2, 1, 2, 1, 0, 1, 2)
    val case5 = intArrayOf(3, 3, 5, 0, 0, 3, 1, 4)

    println(sol.maxProfit(case1))
    println(sol.maxProfit(case2))
    println(sol.maxProfit(case3))
    println(sol.maxProfit(case4))
    println(sol.maxProfit(case5))
}

class Solution12 {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxPrice = 0
        var profit = 0

        for (i in prices.indices) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]
                maxPrice = prices[i]
            }

            if (prices[i] > maxPrice) {
                maxPrice = prices[i]
            }
            profit = max(maxPrice - minPrice, profit)
        }
        return profit
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/