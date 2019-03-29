package com.einao.scientificshistoryandroid

import android.text.SpannableString

class MainPresenter(private val view: View) {

  fun init() {

  }

  interface View {
    fun show(event: SpannableString)
  }
}