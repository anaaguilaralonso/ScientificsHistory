package com.einao.scientificshistoryandroid.events

import android.text.SpannableString

class EventsProvider {

  private fun applyStyle(text: String) = SpannableString(text)

  fun getBirthDate() = applyStyle("[1867] Warsaw. Birth")

  fun getMigration() = applyStyle("[1891] Depart to France")

  fun getFirstDegree() = applyStyle("[1893] Physics degree")

  fun getSecondUniversityDegree() = applyStyle("[1894] Mathematics degree. Second of promotion")

  fun getMarried() = applyStyle("[1895] She came back to Paris. She married with Pierre Curie")

}