package com.seif.uitestespresso

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun test_navSecondaryActivity() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.button_next_activity)).perform(click())
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))

    }
    @Test
    fun test_backPress_toMainActivity() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.button_next_activity)).perform(click())
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
       // onView(withId(R.id.button_back)).perform(click()) // method 1
       pressBack() // method 2
        onView(withId(R.id.main)).check(matches(isDisplayed()))

    }
}
// withId(R.id.main) is a ViewMatcher
// click() is a ViewAction
// check(matches(isDisplayed())) is a viewAssertion

// the test run in alphapetic order

// 1-
//    @Test
//    fun test_isActivityInView() { // did we launch an activity
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
//        onView(withId(R.id.main)).check(matches(isDisplayed()))
//    }
//
//    // test visibility of title and button
//    @Test
//    fun test_visibility_textView_button() {
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
//         onView(withId(R.id.button_next_activity)).check(matches(isDisplayed()))
//         onView(withId(R.id.activity_main_title)).check(matches(isDisplayed()))
//      //  onView(withId(R.id.button_next_activity)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//    }
//
//    @Test
//    fun test_isTitleTextDisplayed() {
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
//        onView(withId(R.id.activity_main_title)).check(matches(withText(R.string.text_mainActivity)))
//    }