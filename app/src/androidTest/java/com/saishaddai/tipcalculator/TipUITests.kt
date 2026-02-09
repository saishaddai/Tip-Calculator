package com.saishaddai.tipcalculator

import androidx.compose.ui.test.junit4.createComposeRule
import com.saishaddai.tipcalculator.ui.theme.TipTimeTheme
import org.junit.Rule
import org.junit.Test

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            TipTimeTheme {
                TipTimeLayout()
            }
        }
    }

}