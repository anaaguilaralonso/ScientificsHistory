package com.einao.scientificshistoryandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import kotlinx.android.synthetic.main.activity_main.toolbar
import kotlinx.android.synthetic.main.content_main.list

class MainActivity : AppCompatActivity(), MainPresenter.View {

  private lateinit var adapter: EventsAdapter
  private val presenter = MainPresenter(this)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    setSupportActionBar(toolbar)

    adapter = EventsAdapter(this, ArrayList())
    list.adapter = adapter
    presenter.init()

  }

  override fun show(event: SpannableString) {
    adapter.addItem(event)
  }

}
