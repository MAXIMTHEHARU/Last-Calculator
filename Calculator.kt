package com.android.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Calculator(private val operator: AbstractOperation) {
    fun operate(num1: Int, num2: Int): Double {
        return operator.operate(num1, num2)
    }
}