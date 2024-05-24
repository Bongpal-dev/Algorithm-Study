package com.bongpal.algorithmstudy.sort.insertion

fun main() {
    val input = intArrayOf(5, 3, 1, 5, 10, 4, 6, 1, 9, 2, 7, 8)

    input.insertionSort()
    println(input.joinToString())
}

fun IntArray.insertionSort() {
    for (i in 1..this.lastIndex) {
        var index = i

        for(j in (i - 1) downTo 0) {
            if(this[index] < this[j]) {
                val temp = this[index]

                this[index] = this[j]
                this[j] = temp
                index--
            }
        }
    }
}