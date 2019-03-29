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

  fun getWarsawStudies() =
    applyStyle("She studied secretly because as a woman, you couldn’t have access to higher education")

  fun getHowSheUsedToStudy() =
    applyStyle("She studied for the day and taught at night. She survived with scarce resources and fainting from hunger")
}