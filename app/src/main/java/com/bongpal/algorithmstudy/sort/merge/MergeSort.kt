package com.bongpal.algorithmstudy.sort.merge

fun main() {
    val input = intArrayOf(5, 2, 11, 1, 9, 6, 3, 1, 7, 4, 2, 3, 10, 8, 1).mergeSort()

    println(input.joinToString())
}

var mergeSortConter = 0

fun IntArray.mergeSort(): IntArray {
    val result = this.divide()

    println("병합정렬 연산 횟수: ${mergeSortConter}회")
    return result
}

fun IntArray.divide(): IntArray {
    if (size <= 1) return this

    val mid = size / 2
    val left = this.copyOfRange(0, mid).divide()
    val right = this.copyOfRange(mid, size).divide()

    return merge(left, right)
}

fun merge(left: IntArray, right: IntArray): IntArray {
    val result = IntArray(left.size + right.size)
    var leftIndex = 0
    var rightIndex = 0
    var resultIndex = 0

    while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] <= right[rightIndex]) {
            result[resultIndex++] = left[leftIndex++]
        } else {
            result[resultIndex++] = right[rightIndex++]
        }
        mergeSortConter++
    }

    while (leftIndex < left.size) {
        result[resultIndex++] = left[leftIndex++]
    }

    while (rightIndex < right.size) {
        result[resultIndex++] = right[rightIndex++]
    }
    return result
}