package com.saishaddai.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculate20PercentTipNoRounding() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculate0PercentTipNoRounding() {
        val amount = 123.00
        val tipPercent = 0.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(0)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculate15PercentTipWithRounding() {
        val amount = 135.00
        val tipPercent = 15.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(21)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, true)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculate15PercentTipWithoutRounding() {
        val amount = 135.00
        val tipPercent = 15.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(20.25)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

}