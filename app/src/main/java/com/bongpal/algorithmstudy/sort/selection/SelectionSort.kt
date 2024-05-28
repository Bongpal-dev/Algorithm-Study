package com.bongpal.algorithmstudy.sort.selection

fun main() {
    val insert = intArrayOf(5, 2, 1, 9, 6, 3, 7, 4, 10, 8).selectionSort()

    println(insert.joinToString())
}

fun IntArray.selectionSort(): IntArray {
    val result = this.copyOf()
    var counter = 0L
    var minIndex = 0

    for (i in 0 .. result.lastIndex) {
        minIndex = i

        for (j in i + 1 .. result.lastIndex) {
            if (result[j] < result[minIndex]) {
                minIndex = j
            }
            counter++
        }
        val temp = result[minIndex]

        result[minIndex] = result[i]
        result[i] = temp
    }
    println("선택정렬 연산 횟수: ${counter}회")
    return result
}