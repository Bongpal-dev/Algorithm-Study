package com.bongpal.algorithmstudy

import com.bongpal.algorithmstudy.sort.bubble.bubbleSort
import com.bongpal.algorithmstudy.sort.insertion.insertionSort
import com.bongpal.algorithmstudy.sort.merge.mergeSort
import com.bongpal.algorithmstudy.sort.selection.selectionSort
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlin.random.Random

suspend fun main() {
    val size = 100000
    val input = IntArray(size) {
        var randon = Random.nextInt(size)

        while (it == randon) {
            randon = Random.nextInt(size)
        }
        randon
    }
    val sort = input.sortedArray()

    listOf(
        GlobalScope.async {
            val result = async { input.bubbleSort() }

            val arr = result.await()
            println("버블정렬 결과: ${sort.contentEquals(arr)}")
        },

        GlobalScope.async {
            val result = async { input.insertionSort() }

            val arr = result.await()
            println("삽입정렬 결과: ${sort.contentEquals(arr)}")
        },

        GlobalScope.async {
            val result = async { input.selectionSort() }

            val arr = result.await()
            println("선택정렬 결과: ${sort.contentEquals(arr)}")
        },

        GlobalScope.async {
            val result = async { input.mergeSort() }
            val arr = result.await()

            println("병합정렬 결과: ${sort.contentEquals(arr)}")
        }
    ).awaitAll()
}