package com.bongpal.algorithmstudy.linkedlist

fun main() {
    val sol = Solution14()
    val case1 = listOf(ListNode(1).apply { add(2); add(4); }, ListNode(1).apply { add(3); add(4) })

    println(sol.mergeTwoLists(case1[0], case1[1])?.joinToString())
}

class Solution14 {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var result: ListNode? = null
        var temp: ListNode? = null
        var a = list1
        var b = list2

        // 모두 null일경우는 null, 하나가 null일 경우 다른 list반환
        if (a == null && b == null) return null

        if (a == null) return b

        if (b == null) return a

        // 가장 첫 원소값을 비교해서 작은값을 result의 첫노드로 저장
        if (a.`val` < b.`val`) {
            result = ListNode(a.`val`)
            a = a.next
        } else {
            result = ListNode(b.`val`)
            b = b.next
        }
        // 다음 노드를 계속 생성해야 하기 때문에 반환해야하는 reuslt와 순회하는 리스트를 분리
        temp = result

        // 두 리스트중 하나가 null이 될때까지 비교해서 다음 노드에 저장
        while (a != null && b != null) {
            if (a.`val` < b.`val`) {
                temp?.next = ListNode(a.`val`)
                temp = temp?.next
                a = a.next
            } else {
                temp?.next = ListNode(b.`val`)
                temp = temp?.next
                b = b.next
            }
        }

        // 둘 중 null이 아니라면 남은 노드 모두를 다음 노드에 저장
        if (a != null) temp?.next = a

        if (b != null) temp?.next = b

        return result
    }
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

// https://leetcode.com/problems/merge-two-sorted-lists/