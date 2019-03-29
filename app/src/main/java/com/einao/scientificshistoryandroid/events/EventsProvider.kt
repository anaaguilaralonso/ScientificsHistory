package com.einao.scientificshistoryandroid.events

import android.text.SpannableString

class EventsProvider {

  private fun applyStyle(text: String) = SpannableString(text)

  fun getBirthDate() = applyStyle("[1867] Warsaw. Birth")

}