package com.example.shopapp.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class BoldTextView(context : Context,attributeSet : AttributeSet)
    : AppCompatTextView(context,attributeSet) {

        init {

            applyFont()
        }

    private fun applyFont() {
        val boldType : Typeface =
            Typeface.createFromAsset(context.assets,"Montserrat-Bold.ttf")
        typeface = boldType  //setTypeface(boldType) ayni

    }

}