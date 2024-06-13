package com.bongpal.algorithmstudy.linkedlist

fun main() {
    val sol = Solution13()
    val case1 = ListNode(1).apply { add(2); add(2); add(1) }
    val case2 = ListNode(1).apply { add(2) }
    val case3 = ListNode(1)
    val case4 = ListNode(1).apply { add(0); add(1) }

    println(sol.isPalindrome(case1))
    println(sol.isPalindrome(case2))
    println(sol.isPalindrome(case3))
    println(sol.isPalindrome(case4))
}

class Solution13 {
    fun isPalindrome(head: ListNode?): Boolean {
        var size = head?.size() ?: 0
        var origin = head
        var list = head

        for (i in 1 until size / 2) list = list?.next

        list?.reverse()
        list = list?.next

        for (i in 1..size / 2) {
            if (origin?.`val` != list?.`val`) return false

            origin = origin?.next
            list = list?.next
        }
        return true
    }

    private fun ListNode.size(): Int {
        var result = 1
        var temp = this

        while (temp.next != null) {
            result++
            temp = temp.next!!
        }
        return result
    }

    private fun ListNode.reverse() {
        var list = this
        var prev: ListNode? = null
        var current: ListNode? = this.next
        var next: ListNode?

        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        list.next = prev
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    fun add(value: Int) {
        var node = this
        while (node.next != null) {
            node = node.next!!
        }
        node.next = ListNode(value)
    }
}

//fun ListNode.joinToString(): String {
//    var result = "["
//    var temp = this
//
//    while (temp.next != null) {
//        result += temp.`val`.toString() + ", "
//        temp = temp.next!!
//    }
//    result += temp.`val`.toString() + "]"
//    return result
//}

// https://leetcode.com/problems/palindrome-linked-list/