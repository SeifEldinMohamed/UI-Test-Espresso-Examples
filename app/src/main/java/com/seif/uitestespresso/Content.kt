package com.seif.uitestespresso

// 1- Testing Activities in Isolation:
//      ActivityScenario
//      ActivityScenarioRule

// 2- Activity Navigation:
//      Intents and startActivity
//      Back navigation

// 3- Test Suites:
//      Running multiple test classes in a suite

// 4- Firebase Test Lab:
//      Run UI tests on hundreds of virtual devices using Firebase Test Lab
// 5- Testing Fragments in Isolation:
//      FragmentScenario
//      launchInContainer
//      FragmentFactory
// 6- Fragment Navigation:
//      Testing fragment transactions
//      Fragment transactions with FragmentFactory
// 7- Mockk (Mockk.io):
//      Mocking dependencies
//      Constructor injection (no dagger)
// 8- Intents:
//      IntentsTestRule
//      Retrieving activity results
//      Choosing image from gallery
//      Capturing an image with camera
// 9- Dialogs:
//      Material Dialogs (Library)
//      Is dialog visible?
//      Capturing input from user
// 10- Toasts:
//      Is toast visible?
// 11- RecyclerView:
//      Scrolling to list item
//      Clicking list items
//      List item verification
// 12- Espresso Idling Resource:
//      Required for background work
// 13- Creating Custom Test Rules:
//      TestRule
//      TestWatcher


/**
 // withId(R.id.my_view) is a ViewMatcher
// click() is a ViewAction
// matches(isDisplayed()) is a ViewAssertion

onView(withId(R.id.my_view))
.perform(click())
.check(matches(isDisplayed()))
 **/