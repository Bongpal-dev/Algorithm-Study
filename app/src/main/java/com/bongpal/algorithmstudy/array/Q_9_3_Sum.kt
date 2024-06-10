package com.bongpal.algorithmstudy.array

fun main() {
    val sol = Solution9()
    val case1 = intArrayOf(-1, 0, 1, 2, -1, -4)
    val case2 = intArrayOf(0, 1, 1)
    val case3 = intArrayOf(0, 0, 0)
    val case4 = intArrayOf(1, -1, -1, 0)

    println("case1 ===========================")
    println(sol.threeSum(case1))
    println("case2 ===========================")
    println(sol.threeSum(case2))
    println("case3 ===========================")
    println(sol.threeSum(case3))
    println("case4 ===========================")
    println(sol.threeSum(case4))
}

class Solution9 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val lastIndex = nums.lastIndex
        var answer = mutableListOf<List<Int>>()

        if (nums.size == 3 && nums[0] + nums[1] + nums[2] == 0) {
            return listOf(listOf(nums[0], nums[1], nums[2]))
        }

        if (nums.size == 3) return listOf()

        for (i in 0 until lastIndex - 1) {
            var s = i + 1
            var e = i + 2

            while (e <= lastIndex && s < lastIndex - 1) {
                var target = nums[i] + nums[s]

                if (target + nums[e] == 0) {
                    val zeroList = listOf(nums[i], nums[s], nums[e]).sorted()

                    if (answer.contains(zeroList).not()) answer += zeroList
                }
                e++

                if (e > lastIndex) {
                    s++
                    e = s + 1
                }
            }
        }
        return answer.sortedWith(compareBy({ it[0] }, { it[1] }, { it[2] }))
    }
}

// https://leetcode.com/problems/two-sum/