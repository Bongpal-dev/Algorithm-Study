package com.bongpal.algorithmstudy.string

fun main() {
    val sol = Solution2()
    val case1 = charArrayOf('h', 'e', 'l', 'l', 'o')
    val case2 = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
    val case3 = "1234567890".toCharArray()

    sol.reverseString(case1)
    sol.reverseString(case2)
    sol.reverseString(case3)

    println(case1.contentToString())
    println(case2.contentToString())
    println(case3.contentToString())
}

class Solution2 {
    fun reverseString(s: CharArray) {
        var f = 0
        var e = s.lastIndex

        while(f < e) {
            s[f] = s[e].also { s[e] = s[f] }

            f++
            e--
        }
    }
}



// http://leetcode.com/problems/reverse-string/
