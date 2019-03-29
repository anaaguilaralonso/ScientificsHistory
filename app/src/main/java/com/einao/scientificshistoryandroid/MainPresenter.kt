package com.einao.scientificshistoryandroid

import android.text.SpannableString
import com.einao.scientificshistoryandroid.curiosities.CuriositiesProvider
import com.einao.scientificshistoryandroid.events.EventsProvider

class MainPresenter(private val view: View) {

  private val eventsProvider = EventsProvider()
  private val curiositiesProvider = CuriositiesProvider()

  fun init() {

  }

  interface View {
    fun show(event: SpannableString)
  }
}