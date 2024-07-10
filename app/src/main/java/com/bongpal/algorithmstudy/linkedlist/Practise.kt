package com.bongpal.algorithmstudy.linkedlist

fun main() {
    val test = Test()
    val case1 = ListNode(1).apply { add(2); add(3); add(4) }

    test.swapElement(case1, 1, 2)
    println(case1.joinToString())
}

class Test {
    fun swapElement(head: ListNode?, f: Int, e: Int) {
        var index = 1

        
    }
}