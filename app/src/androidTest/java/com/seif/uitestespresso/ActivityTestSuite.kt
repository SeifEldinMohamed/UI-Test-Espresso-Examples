package com.seif.uitestespresso

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses( // put in here reference to the classes that we are going to test
    MainActivityTest::class,
    SecondaryActivityTest::class
)
class ActivityTestSuite