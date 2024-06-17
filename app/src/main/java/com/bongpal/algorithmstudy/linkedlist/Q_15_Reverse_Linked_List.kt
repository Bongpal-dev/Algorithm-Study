package com.bongpal.algorithmstudy.linkedlist

fun main() {
    val sol = Solution15()
    val case1 = ListNode(1).apply { add(2); add(3); add(4); add(5) }

    println(sol.reverseList(case1)?.joinToString())
}

class Solution15 {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var next: ListNode? = null
        var current: ListNode? = head

        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        return prev
    }
}

// https://leetcode.com/problems/reverse-linked-list/