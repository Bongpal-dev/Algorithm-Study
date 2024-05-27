package com.bongpal.algorithmstudy.sort.bubble

fun main() {
    val input = intArrayOf(5, 125, 7, 1, 6, 1, 2, 8, 4, 2, 9, 10, 3)

    input.bubbleSort()
    println(input.joinToString())

}

fun IntArray.bubbleSort() {
    for (i in this.lastIndex downTo 0) {
        for (j in 0 until i) {
            if (this[j] > this[j + 1]) {
                val temp = this[j]

                this[j] = this[j + 1]
                this[j + 1] = temp
            }
        }
    }
}