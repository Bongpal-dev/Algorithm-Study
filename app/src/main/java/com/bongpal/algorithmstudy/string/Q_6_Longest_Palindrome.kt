package com.bongpal.algorithmstudy.string

import androidx.core.text.isDigitsOnly

fun main() {
    val sol = Solution6()
    val case1 = "abccccdd"
    val case2 = "a"

    println(sol.longestPalindrome(case1))
    println(sol.longestPalindrome(case2))
}

class Solution6 {
    fun longestPalindrome(s: String): Int {
        var answer = 0
        var result = s.groupingBy { it }.eachCount().map {
            if(it.value > 1) {
                answer += (it.value / 2) * 2
                it.value % 2
            } else {
                it.value
            }
        }

        if (1 in result) answer++

        return answer
    }
}

// https://leetcode.com/problems/longest-palindrome/