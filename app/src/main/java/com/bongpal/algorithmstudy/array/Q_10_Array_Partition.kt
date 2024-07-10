package com.bongpal.algorithmstudy.array

fun main() {
    val sol = Solution10()
    val case1 = intArrayOf(1, 4, 3, 2)
    val case2 = intArrayOf(6, 2, 6, 5, 1, 2)

    println("case1 ===========================")
    println(sol.arrayPairSum(case1))
    println("case2 ===========================")
    println(sol.arrayPairSum(case2))
}

class Solution10 {
    fun arrayPairSum(nums: IntArray): Int {
        var result = 0

        nums.sort()
        nums.forEachIndexed{i, v -> if(i % 2 == 0) { result += v} }

        return result
    }
//    fun arrayPairSum(nums: IntArray): Int {
//        return nums.sorted().filterIndexed{i, _ -> i % 2 == 0}.sum()
//    }
}

// https://leetcode.com/problems/array-partition/