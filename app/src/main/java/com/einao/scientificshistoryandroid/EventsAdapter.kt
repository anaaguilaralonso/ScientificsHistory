package com.einao.scientificshistoryandroid

import android.annotation.SuppressLint
import android.content.Context
import android.text.SpannableString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class EventsAdapter(
  private val context: Context,
  private val events: ArrayList<SpannableString>
) : BaseAdapter() {

  private val inflater: LayoutInflater =
    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

  @SuppressLint("ViewHolder")
  override fun getView(
    position: Int,
    convertView: View?,
    parent: ViewGroup
  ): View {
    val rootView = inflater.inflate(android.R.layout.simple_list_item_1, parent, false)
    val textView = rootView.findViewById(android.R.id.text1) as TextView
    textView.text = events[position]
    return rootView
  }

  override fun getItem(position: Int): SpannableString = events[position]

  override fun getItemId(position: Int): Long = position.toLong()

  override fun getCount(): Int = events.size

  fun addItem(event: SpannableString) = events.add(event)

}