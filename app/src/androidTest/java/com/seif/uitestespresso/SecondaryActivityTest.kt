package com.seif.uitestespresso

import androidx.test.espresso.Espresso.onView
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SecondaryActivityTest {

}

// 1-
//     @get: Rule // will be launched before each test case
//    val activityRule = ActivityScenarioRule(SecondaryActivity::class.java)
//
//    @Test
//    fun test_isActivityInView() {
//        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
//    }
//
//    @Test
//    fun test_visibility_title_backButton() {
//        onView(withId(R.id.button_back)).check(matches(isDisplayed()))
//        onView(withId(R.id.activity_secondary_title)).check(matches(isDisplayed()))
//    }
//
//    @Test
//    fun test_isTitleTextDisplayed() {
//        onView(withId(R.id.activity_secondary_title))
//            .check(matches(withText(R.string.text_secondaryActivity)))
//    }