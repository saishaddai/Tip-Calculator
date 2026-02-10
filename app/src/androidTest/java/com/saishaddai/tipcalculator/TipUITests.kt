package com.saishaddai.tipcalculator

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTextInput
import com.saishaddai.tipcalculator.ui.test.TestTags
import com.saishaddai.tipcalculator.ui.theme.TipTimeTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

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
        composeTestRule
            .onNodeWithTag(TestTags.BILL_AMOUNT_INPUT)
            .performTextInput("10")
        composeTestRule
            .onNodeWithTag(TestTags.TIP_PERCENTAGE_INPUT)
            .performTextInput("20")
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        composeTestRule.onNodeWithTag(TestTags.TIP_AMOUNT_DISPLAY).assertExists(
            "No node with this text was found."
        ).assertTextEquals("Tip Amount: $expectedTip")
    }

}