package com.bongpal.algorithmstudy.linkedlist

fun main() {
    val sol = Solution16()
    val case1 = listOf(ListNode(2).apply { add(4); add(3); }, ListNode(5).apply { add(6); add(2); })
    val case2 = listOf(ListNode(9).apply { add(9); add(9); add(9); add(9); add(9); add(9); },
        ListNode(9).apply { add(9); add(9); add(9) })
    val case3 = listOf(
        ListNode(9),
        ListNode(1).apply { add(9); add(9); add(9); add(9); add(9); add(9); add(9); add(9); add(9) })

    println(sol.addTwoNumbers(case1[0], case1[1])?.joinToString())
    println(sol.addTwoNumbers(case2[0], case2[1])?.joinToString())
    println(sol.addTwoNumbers(case3[0], case3[1])?.joinToString())
}

class Solution16 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var list1: ListNode? = l1
        var list2: ListNode? = l2
        var add = 0

        var result = ListNode(0)
        var temp: ListNode = result

        while (list1 != null || list2 != null || add != 0) {
            val l1Val = list1?.`val` ?: 0
            val l2Val = list2?.`val` ?: 0
            val calculation = l1Val + l2Val + add

            add = if (calculation >= 10) 1 else 0

            temp.next = ListNode(calculation % 10)
            temp = temp.next!!

            list1 = list1?.next
            list2 = list2?.next
        }
        return result.next
    }
}

// https://leetcode.com/problems/add-two-numbers/