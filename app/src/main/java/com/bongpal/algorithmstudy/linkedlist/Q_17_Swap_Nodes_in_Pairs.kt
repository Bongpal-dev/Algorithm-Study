package com.bongpal.algorithmstudy.linkedlist

fun main() {
    val sol = Solution17()
    val case1 = ListNode(1).apply { add(2); add(3); add(4) }
    val case2 = null
    val case3 = ListNode(1)
    val case4 = ListNode(1).apply { add(2); add(3) }

    println(sol.swapPairs(case1)?.joinToString())
    println(sol.swapPairs(case2)?.joinToString())
    println(sol.swapPairs(case3)?.joinToString())
    println(sol.swapPairs(case4)?.joinToString())
}

class Solution17 {
    fun swapPairs(head: ListNode?): ListNode? {
        if (head?.next == null) return head

        var list: ListNode? = ListNode(0).apply { next = head }
        var nodeHead = list
        var index = 0

        while (list?.next?.next != null) {
            if (index % 2 == 0) {
                var prev = list
                var first = list.next
                var second = list.next?.next

                first?.next = second?.next
                second?.next = first
                prev.next = second
            }
            index++
            list = list.next
        }
        return nodeHead?.next
    }
}

// https://leetcode.com/problems/swap-nodes-in-pairs/