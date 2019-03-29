package com.einao.scientificshistoryandroid.curiosities

import android.graphics.Typeface
import android.text.SpannableString
import android.text.style.StyleSpan

class CuriositiesProvider {

  private fun applyStyle(text: String): SpannableString {
    val styledText = SpannableString(text)
    styledText.setSpan(StyleSpan(Typeface.ITALIC), 0, styledText.length, 0)
    return styledText
  }

}