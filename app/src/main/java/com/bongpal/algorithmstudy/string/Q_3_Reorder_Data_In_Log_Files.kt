package com.bongpal.algorithmstudy.string

import androidx.core.text.isDigitsOnly

fun main() {
    val sol = Solution3()
    val case1 =
        arrayOf("dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero")
    val case2 = arrayOf("a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo")

    println(sol.reorderLogFiles(case1).joinToString())
    println(sol.reorderLogFiles(case2).joinToString())
}

class Solution3 {
    fun reorderLogFiles(logs: Array<String>): Array<String> {
        return logs.sortedWith(
            Comparator { o1, o2 ->
                val r1 = o1.substringAfter(' ')
                val r2 = o2.substringAfter(' ')

                when {
                    r1[0].isDigit() && r2[0].isDigit() -> return@Comparator 0

                    r1 == r2 -> return@Comparator o1.compareTo(o2)

                    r1[0].isLetter() && r2[0].isDigit() -> return@Comparator -1

                    r1[0].isDigit() && r2[0].isLetter() -> return@Comparator 1

                    else -> return@Comparator r1.compareTo(r2)
                }
            }
        ).toTypedArray()
    }
}


// https://leetcode.com/problems/reorder-data-in-log-files/description/
