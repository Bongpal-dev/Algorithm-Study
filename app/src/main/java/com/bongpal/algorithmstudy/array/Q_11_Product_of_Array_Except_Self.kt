package com.bongpal.algorithmstudy.array

fun main() {
    val sol = Solution11()
    val case1 = intArrayOf(1, 2, 3, 4)
    val case2 = intArrayOf(-1, 1, 0, -3, 3)
    val case3 = intArrayOf(4, 3, 2, 1, 2)

    println("case1 ===========================")
    println(sol.productExceptSelf(case1).joinToString())
    println("case2 ===========================")
    println(sol.productExceptSelf(case2).joinToString())
    println("case3 ===========================")
    println(sol.productExceptSelf(case3).joinToString())
}

class Solution11 {
    fun productExceptSelf(nums: IntArray): IntArray {
        val answer = IntArray(nums.size) { 1 }
        var left = 1
        var right = 1

        for (i in 0 .. nums.lastIndex) {
            answer[i] = left
            left *= nums[i]
        }

        for (i in nums.lastIndex downTo 0) {
            answer[i] *= right
            right *= nums[i]
        }
        return answer
    }
}

// https://leetcode.com/problems/product-of-array-except-self/