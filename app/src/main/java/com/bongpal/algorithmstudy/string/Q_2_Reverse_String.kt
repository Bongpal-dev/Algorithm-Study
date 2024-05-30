package com.bongpal.algorithmstudy.string

fun main() {
    val sol = Solution2()
    val case1 = charArrayOf('h', 'e', 'l', 'l', 'o')
    val case2 = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')

    sol.reverseString(case1)
    sol.reverseString(case2)

    println(case1.contentToString())
    println(case2.contentToString())
}

class Solution2 {
    fun reverseString(s: CharArray) {
        var f = 0
        var e = s.lastIndex

        while(f < e) {
            val temp = s[f]

            s[f] = s[e]
            s[e] = temp

            f++
            e--
        }
    }
}



// http://leetcode.com/problems/reverse-string/
