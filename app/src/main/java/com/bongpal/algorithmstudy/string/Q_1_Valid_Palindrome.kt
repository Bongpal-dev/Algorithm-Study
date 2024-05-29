package com.bongpal.algorithmstudy.string

fun main() {
    val solution = Solution()

    println(solution.isPalindrome("A man, a plan, a canal: Panama"))
    println(solution.isPalindrome("race a car"))
    println(solution.isPalindrome(" "))
}

class Solution {
    fun isPalindrome(s: String): Boolean {
        val origin = s.filter{it.isLetterOrDigit()}.lowercase()
        val reverse = origin.reversed()

        return origin == reverse
    }
}

//class Solution {
//    fun isPalindrome(s: String): Boolean {
//        val origin = s.map{
//            when{
//                it == ' ' -> ""
//                it.isLetterOrDigit().not() -> ""
//                it.isUpperCase() -> it.lowercase()
//                else -> it
//            }
//        }.joinToString("")
//        val reverse = origin.reversed()
//
//        return origin == reverse
//    }
//}

// https://leetcode.com/problems/valid-palindrome/
