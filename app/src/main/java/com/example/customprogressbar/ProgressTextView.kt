package com.example.customprogressbar

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.widget.TextView

class ProgressTextView : TextView {
    var color: Int = 0
    var progress: Float = 0f
//    val underlineHeight:Float =  30f

    constructor(context: Context?) : this(context,null)


    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs,0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ){
        val attrib = context?.obtainStyledAttributes(attrs,R.styleable.ProgressTextView,defStyleAttr,0)
        color = attrib?.getColor(R.styleable.ProgressTextView_progressColor,0)?:0
        progress = attrib?.getFloat(R.styleable.ProgressTextView_progressValue,0f)?:0f
        if(progress>1f)progress=1f
    }

//
//    constructor(
//        context: Context?,
//        attrs: AttributeSet?,
//        defStyleAttr: Int,
//        defStyleRes: Int
//    ) : super(context, attrs, defStyleAttr, defStyleRes)


    fun setParams(color: Int, progress: Float) {
        this.color = color
        this.progress = progress

    }

    override fun onDraw(canvas: Canvas?) {

        if (progress>1f)progress=1f
        val width = width
        val tvheight = height
        val paint = Paint()
        paint.color = color
        val rect = RectF(0f, getLineTop(), width * progress, tvheight.toFloat())
        canvas?.drawRect(rect, paint)
        super.onDraw(canvas)
    }





    private fun getLineTop():Float{
        return (this@ProgressTextView.textSize * 2) / 3
    }
}