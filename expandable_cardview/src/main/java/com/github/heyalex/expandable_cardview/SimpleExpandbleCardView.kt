package com.github.heyalex.expandable_cardview

import android.content.Context
import android.util.AttributeSet
import kotlinx.android.synthetic.main.simple_cardview_header.view.*

class SimpleExpandableCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ExpandableCardView(context, attrs, defStyleAttr) {

    private var title: String?

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.SimpleExpandableCardView)
        title = typedArray.getString(R.styleable.SimpleExpandableCardView_title)
        headerViewRes = R.layout.simple_cardview_header
        typedArray.recycle()
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        header_textview.text = title
    }

    fun setTitle(title : String) {
        this.title = title
    }

}