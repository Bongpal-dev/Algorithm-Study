package com.bongpal.algorithmstudy.string

import androidx.core.text.isDigitsOnly

fun main() {
    val sol = Solution5()
    val case1 = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val case2 = arrayOf("")
    val case3 = arrayOf("a")

    println(sol.groupAnagrams(case1))
    println(sol.groupAnagrams(case2))
    println(sol.groupAnagrams(case3))
}

class Solution5 {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var result = mutableMapOf<String, List<String>>()

        for (i in strs) {
            val key = i.toCharArray().sorted().joinToString("")
            val value = result.getOrDefault(key, mutableListOf())

            result[key] = value.plus(i)
        }

        return result.values.toList().sortedBy { it.size }
    }
}

// https://leetcode.com/problems/group-anagrams/
