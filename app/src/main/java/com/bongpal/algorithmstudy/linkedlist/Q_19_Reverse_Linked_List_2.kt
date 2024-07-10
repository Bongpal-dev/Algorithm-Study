package com.bongpal.algorithmstudy.linkedlist

fun main() {
    val sol = Solution19()
    val case1 = ListNode(1).apply { add(2); add(3); add(4); add(5) }

    println(sol.reverseBetween(case1, 2, 4)?.joinToString())
}

class Solution19 {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        var list = head
        val tempList = mutableListOf<Int>()

        while(list != null) {
            tempList += list.`val`
            list = list.next
        }

        val reverse = tempList.subList(left - 1, right).reversed()

        for (i in left - 1 until right) {
            tempList[i] = reverse[i]
        }

        var result: ListNode? = null
        var temp: ListNode? = null

        for (i in tempList) {
            if (result == null) {
                result = ListNode(i)
                temp = result
            } else {
                temp?.next = ListNode(i)
                temp = temp?.next
            }
        }
        return result
    }

    fun ListNode.joinToString(): String {
        var result = "["
        var temp = this

        while (temp.next != null) {
            result += temp.`val`.toString() + ", "
            temp = temp.next!!
        }
        result += temp.`val`.toString() + "]"
        return result
    }
}

// https://leetcode.com/problems/add-two-numbers/