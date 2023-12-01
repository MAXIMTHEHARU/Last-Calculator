package com.android.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DivideOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int):Double {
        require(num2 != 0) {
            ArithmeticException( "Divide by zero")
        }
        return (num1 / num2).toDouble()
    }

}
