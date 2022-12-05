package com.ssong_develop.samplecustomviewlistener

import android.content.Context
import android.util.AttributeSet
import android.view.View

class CustomView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttrs: Int = 0
) : View(context, attributeSet, defStyleAttrs) {

    private var onCustomViewClickListener: OnCustomViewClickListener? = null

    init {
        setOnClickListener { onCustomViewClickListener?.onClick() }
    }

    fun setOnCustomViewClickListener(onCustomViewClickListener: OnCustomViewClickListener) {
        this.onCustomViewClickListener = onCustomViewClickListener
    }

    fun setOnCustomViewClickListener(block: () -> Unit) {
        this.onCustomViewClickListener = OnCustomViewClickListener(block)
    }
}