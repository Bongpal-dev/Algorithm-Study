package com.bongpal.algorithmstudy.sort.selection

fun main() {
    val insert = intArrayOf(5, 2, 1, 9, 6, 3, 7, 4, 10, 8).selectionSort()

    println(insert.joinToString())
}

fun IntArray.selectionSort(): IntArray {
    var minIndex = 0

    for (i in 0 .. this.lastIndex) {
        minIndex = i

        for (j in i + 1 .. this.lastIndex) {
            if (this[j] < this[minIndex]) {
                minIndex = j
            }
        }
        val temp = this[minIndex]

        this[minIndex] = this[i]
        this[i] = temp
    }
    return this.copyOf()
}