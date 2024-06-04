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

    val s = listOf("one", "two", "three", "four")
// 각 원소의 첫째글자를 key로 지정
    val groupBy = s.groupBy { it.first() }
    val groupingBy = s.groupingBy { it.first() }

    println(groupBy)
// groupBy의 경우 map이 반환됨 {o=[one], t=[two, three], f=[four]}

    println(groupingBy.eachCount())
//
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
