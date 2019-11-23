package com.einao.scientificshistoryandroid.events

import android.text.SpannableString

class EventsProvider {

  private fun applyStyle(text: String) = SpannableString(text)

  fun getBirthDate() = applyStyle("[1867] Warsaw. Birth")

  fun getMigration() = applyStyle("[1891] Depart to France")

  fun getFirstDegree() = applyStyle("[1893] Physics degree")

  fun getSecondUniversityDegree() = applyStyle("[1894] Mathematics degree. Second of promotion")

  fun getMarried() = applyStyle("[1895] She came back to Paris. She married with Pierre Curie")

  fun getFirstNobelPrize() = applyStyle("[1903] Doctoral thesis with what she received the first Nobel Prize shared with her Pierre Curie and with Henri Becquerel")

  fun getSecondNobelPrize() = applyStyle("[1910] Nobel Prize in Chemistry for discovering Polonio and Radio")

  fun getSolvayCongress() = applyStyle("[1911] First woman being part of the Solvay Congress about radiation and quantums. She came across Albert Einstein in that Congress")

  fun getDeath() = applyStyle("[1934] France. Death due to radiation exposure")

}