package com.bongpal.algorithmstudy.linkedlist

fun main() {
    val sol = Solution19()
    val case1 = ListNode(1).apply { add(2); add(3); add(4); add(5) }

    println(sol.reverseBetween(case1, 2, 4)?.joinToString())
}

class Solution19 {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        var list: ListNode? = ListNode(0).apply { next = head }
        val listHead = list
        var start: ListNode? = null
        var end: ListNode? = null
        var index = 0

        while (list != null) {
            if (index == left - 1) start = list
            if (index == right) end = list.next

            list = list.next
            index++
        }

        var prev: ListNode? = null
        var current = start?.next
        var next: ListNode?
        val endPoint = current

        for (i in left..right) {
            next = current?.next
            current?.next = prev
            prev = current
            current = next
        }
        start?.next = prev
        endPoint?.next = end
        return listHead?.next
    }
}

// https://leetcode.com/problems/reverse-linked-list-ii/