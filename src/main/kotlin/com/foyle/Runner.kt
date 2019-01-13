package com.foyle

class Runner {
    fun run() {
        val speedTest = SpeedTest()
        speedTest.runBasicThreadTest(100)
        speedTest.runBasicCoroutineTest(100)

        val waitTest = WaitTest()
        waitTest.waitForChildCoroutine()
    }
}
