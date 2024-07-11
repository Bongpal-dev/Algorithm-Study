package com.bongpal.algorithmstudy.stack

fun main() {
    val sol = Solution20()
    val case1 = "()"
    val case2 = "()[]{}"
    val case3 = "(]"
    val case4 = "{[]}"

    println(sol.isValid(case1))
    println(sol.isValid(case2))
    println(sol.isValid(case3))
    println(sol.isValid(case4))
}

class Solution20 {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()

        for (c in s) {
            if (stack.isEmpty()) {
                stack.add(c)
                continue
            }
            val top = stack.last()
            if (checkBracket(top, c)) {
                stack.removeAt(stack.lastIndex)
            } else {
                stack.add(c)
            }
        }
        return stack.isEmpty()
    }

    private fun checkBracket(open: Char, close: Char): Boolean {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}')
    }
}

// https://leetcode.com/problems/valid-parentheses/