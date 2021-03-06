package com.template.nanamare.base.ui

import androidx.recyclerview.widget.RecyclerView
import io.reactivex.subjects.PublishSubject

abstract class BaseRecyclerViewAdapter<ITEM : Any>
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    protected var items = mutableListOf<ITEM>()

    val itemClickEvent: PublishSubject<Int> = PublishSubject.create()

    fun add(item: ITEM?) {
        item?.let {
            items.add(it)
        }
    }

    fun replaceAll(newItems: List<ITEM>?) {
        newItems?.let {
            items.run {
                clear()
                addAll(it)
            }
        }
    }

    fun clear() {
        items.clear()
    }

    fun getItem(position: Int) = items[position]


    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as? BaseViewHolder<*, *>)?.onBindViewHolder(items[position])
    }

}