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
    val map = mutableMapOf<Int, Int>()
    fun threeSum(nums: IntArray): List<List<Int>> {
        val arr = nums.sorted()
        val answer = mutableListOf<List<Int>>()

        for (i in 0..nums.lastIndex - 2) {
            if (i > 0 && arr[i] == arr[i - 1]) continue
            var s = i + 1
            var e = nums.lastIndex

            while (s < e) {
                val sum = arr[i] + arr[s] + arr[e]

                when {
                    sum < 0 -> s++
                    sum > 0 -> e--
                    else -> {
                        answer.add(listOf(arr[i], arr[s], arr[e]))
                        s++
                        while (arr[s] == arr[s - 1] && s < e) s++
                    }
                }
            }
        }
        return answer
    }
}

//class Solution9 {
//    fun threeSum(nums: IntArray): List<List<Int>> {
//        var answer = mutableListOf<List<Int>>()
//        val sums = hashMapOf<Int, Int>()
//
//        for (i in 0..nums.lastIndex - 2) {
//            val sub = -nums[i]
//
//            for (j in i + 1..nums.lastIndex) {
//                val target = sub - nums[j]
//
//                if (sums.containsKey(target)) {
//                    val list =
//                        listOf(nums[i], nums[j], nums[sums.getOrDefault(target, -1)]).sorted()
//
//                    if (!answer.contains(list)) {
//                        answer.add(list)
//                    }
//                }
//                sums[nums[j]] = j
//            }
//            sums.clear()
//        }
//        return answer
//    }
//}

// https://leetcode.com/problems/3sum/