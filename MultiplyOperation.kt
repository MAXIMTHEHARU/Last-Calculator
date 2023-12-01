package com.android.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MultiplyOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int):Double = (num1 * num2).toDouble()
}
