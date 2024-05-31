package com.bongpal.algorithmstudy.string

import androidx.core.text.isDigitsOnly

fun main() {
    val sol = Solution4()
    val case1 = arrayOf("Bob hit a ball, the hit BALL flew far after it was hit.", arrayOf("hit"))
    val case2 = arrayOf("a.", arrayOf<String>())
    val case3 = arrayOf("Bob. hIt, baLl", arrayOf<String>("bob", "hit"))

    println(sol.mostCommonWord(case1[0] as String, case1[1] as Array<String>))
    println(sol.mostCommonWord(case2[0] as String, case2[1] as Array<String>))
    println(sol.mostCommonWord(case3[0] as String, case3[1] as Array<String>))
}

class Solution4 {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        var result = paragraph.split("[^a-zA-Z0-9\n]".toRegex())
            .filter { it.isNotEmpty() }
            .map { word -> word.lowercase().filter { it.isLetterOrDigit() } }
            .filterNot { it in banned }
            .groupingBy { it }.eachCount()

        return result.filterValues { it == result.values.max() }.keys.first()
    }
}

// https://leetcode.com/problems/most-common-word/
