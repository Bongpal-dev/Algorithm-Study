package com.bongpal.algorithmstudy.sort.insertion

fun main() {
    val input = intArrayOf(5, 3, 1, 5, 10, 4, 6, 1, 9, 2, 7, 8).insertionSort()

    println(input.joinToString())
}

fun IntArray.insertionSort(): IntArray {
    val result = this.copyOf()
    var counter = 0L

    for (i in 1..result.lastIndex) {
        var index = i

        while (index > 0 && result[index] < result[index - 1]) {
            val temp = result[index]

            result[index] = result[index - 1]
            result[index - 1] = temp
            index--
            counter++
        }
    }
    println("삽입정렬 연산 횟수: ${counter}회")
    return result
}