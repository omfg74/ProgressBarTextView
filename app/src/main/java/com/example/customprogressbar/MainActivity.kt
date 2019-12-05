package com.example.customprogressbar

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add1()
        add2()
        add3()
        add4()
        add5()
        add6()
        add7()


    }

    private fun dp(px: Float): Float {
        return px * resources.displayMetrics.density
    }

    private fun add1() {
        val tv1 = ProgressTextView(this)
        val layoutParams = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutParams.topMargin = dp(100f).toInt()
        layoutParams.leftMargin = dp(100f).toInt()
        tv1.text = "56%"
        tv1.setParams(Color.parseColor("#00ff00"), 0.56f)
        layoutMain.addView(tv1, layoutParams)
    }

    private fun add2() {
        val tv1 = ProgressTextView(this)
        val layoutParams = FrameLayout.LayoutParams(100, ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutParams.topMargin = dp(120f).toInt()
        layoutParams.leftMargin = dp(100f).toInt()
        tv1.text = "56%"
        tv1.setParams(Color.parseColor("#00ff00"), 0.56f)
        layoutMain.addView(tv1, layoutParams)
    }

    private fun add3() {
        val tv1 = ProgressTextView(this)
        val layoutParams = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutParams.topMargin = dp(140f).toInt()
        layoutParams.leftMargin = dp(100f).toInt()
        tv1.text = "56%"
        tv1.setParams(Color.parseColor("#00ff00"), 0.56f)
        layoutMain.addView(tv1, layoutParams)
    }

    private fun add4() {
        val tv1 = ProgressTextView(this)
        val layoutParams = FrameLayout.LayoutParams(150, ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutParams.topMargin = dp(160f).toInt()
        layoutParams.leftMargin = dp(100f).toInt()
        tv1.text = "56%"
        tv1.setParams(Color.parseColor("#00ff00"), 0.56f)
        layoutMain.addView(tv1, layoutParams)
    }

    private fun add5() {
        val tv1 = ProgressTextView(this)
        val layoutParams = FrameLayout.LayoutParams(200, ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutParams.topMargin = dp(180f).toInt()
        layoutParams.leftMargin = dp(100f).toInt()
        tv1.text = "56%"
        tv1.setParams(Color.parseColor("#00ff00"), 0.56f)
        layoutMain.addView(tv1, layoutParams)
    }

    private fun add6() {
        val tv1 = ProgressTextView(this)
        val layoutParams = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutParams.topMargin = dp(200f).toInt()
        layoutParams.leftMargin = dp(100f).toInt()
        tv1.text = "56%"
        tv1.setParams(Color.parseColor("#00ff00"), 0.56f)
        layoutMain.addView(tv1, layoutParams)
    }

    private fun add7() {
        val tv1 = ProgressTextView(this)
        val layoutParams = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutParams.topMargin = dp(220f).toInt()
        layoutParams.leftMargin = dp(100f).toInt()
        tv1.text = "56%"
        tv1.setParams(Color.parseColor("#00ff00"), 0.56f)
        layoutMain.addView(tv1, layoutParams)
    }
}
