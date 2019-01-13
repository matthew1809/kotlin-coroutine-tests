package com.foyle

import com.foyle.tests.SpeedTest
import com.foyle.tests.WaitTest

class Runner {
    fun run() {
        val speedTest = SpeedTest()
        speedTest.runBasicThreadTest(100)
        speedTest.runBasicCoroutineTest(100)

        val waitTest = WaitTest()
        waitTest.waitForChildCoroutine()
    }
}
