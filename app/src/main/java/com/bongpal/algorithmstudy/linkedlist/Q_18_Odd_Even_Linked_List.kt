package com.bongpal.algorithmstudy.linkedlist

fun main() {
    val sol = Solution18()
    val case1 = ListNode(1).apply { add(2); add(3); add(4); add(5) }
    val case2 = ListNode(1).apply { add(2); add(3); add(4); add(5); add(6); add(7); add(8) }

    println(sol.oddEvenList(case1)?.joinToString())
    println(sol.oddEvenList(case2)?.joinToString())
}

class Solution18 {
    fun oddEvenList(head: ListNode?): ListNode? {
        if(head?.next?.next == null) return head

        var list = head
        var listHead = list
        var even: ListNode? = ListNode(0)
        var evenHead = even

        while (list?.next?.next != null) {
            even?.next = list.next
            even = even?.next
            list.next = list.next?.next
            list = list.next
        }
        even?.next = even?.next?.next
        list?.next = evenHead?.next
        return listHead
    }
}

// https://leetcode.com/problems/odd-even-linked-list/