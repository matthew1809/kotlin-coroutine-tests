package com.foyle.tests
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class WaitTest {

    fun waitForChildCoroutine() = runBlocking {

        println("running waitForChildCoroutine, creating one coroutine and having it say Hello, and forcing the main thread to wait until the coroutine completes before saying World")

        val job = GlobalScope.launch {
            delay(1000L)
            println("World!")
        }
        println("Hello,")
        job.join()
    }
}
