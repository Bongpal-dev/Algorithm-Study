package com.bongpal.algorithmstudy.sort.bubble

fun main() {
    val input = intArrayOf(5, 125, 7, 1, 6, 1, 2, 8, 4, 2, 9, 10, 3).bubbleSort()

    println(input.joinToString())

}

fun IntArray.bubbleSort(): IntArray {
    val result = this.copyOf()
    var counter = 0L

    for (i in result.lastIndex downTo 0) {
        for (j in 0 until i) {
            if (result[j] > result[j + 1]) {
                val temp = result[j]

                result[j] = result[j + 1]
                result[j + 1] = temp
            }
            counter++
        }
    }
    println("버블정렬 연산 횟수: ${counter}회")
    return result
}