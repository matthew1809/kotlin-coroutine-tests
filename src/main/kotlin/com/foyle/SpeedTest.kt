package com.foyle

import kotlin.concurrent.thread
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

class SpeedTest {

    fun runBasicThreadTest(numOfThreads: Int) {

        println("running runBasicThreadTest to create $numOfThreads threads and have each one increment a counter")

        var counter = 0

        val time = measureTimeMillis {
            for (i in 1 until numOfThreads) {
                thread {
                    counter += 1
                }
            }
        }
        println("Created $numOfThreads threads in ${time}ms.")
    }

    fun runBasicCoroutineTest(numOfCoroutines: Int) {

        println("running runBasicCoroutineTest to create $numOfCoroutines coroutines and have each one increment a counter")

        var counter = 0

        val time = measureTimeMillis {
            for (i in 1 until numOfCoroutines) {
                GlobalScope.launch {
                    counter += 1
                }
            }
        }
        println("Created $numOfCoroutines coroutines in ${time}ms.")
    }
}
