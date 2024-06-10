package com.bongpal.algorithmstudy.array

import androidx.core.text.isDigitsOnly

fun main() {
    val sol = Solution7()

    println(sol.twoSum(intArrayOf(2, 7, 11, 15), 9).joinToString())
    println(sol.twoSum(intArrayOf(3, 2, 4), 6).joinToString())
    println(sol.twoSum(intArrayOf(3, 3), 6).joinToString())
    println(sol.twoSum(intArrayOf(-3, 4, 3, 90), 0).joinToString())
}

class Solution7 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}

// https://leetcode.com/problems/two-sum/