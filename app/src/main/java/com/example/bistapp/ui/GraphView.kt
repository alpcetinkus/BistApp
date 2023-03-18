package com.example.bistapp.ui

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.example.bistapp.R
import com.example.bistapp.utils.toPx
import kotlinx.android.synthetic.main.activity_detail.view.*

class GraphView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    val paintLine = Paint(Paint.ANTI_ALIAS_FLAG).apply {

        style = Paint.Style.STROKE
        strokeWidth = 3.toPx()

    }
        var gradientColor = Color.parseColor("#ffFF0000")
    init {
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.AlpView,
            0, 0).apply {

            try {
                gradientColor = getColor(R.styleable.AlpView_graphColor, Color.parseColor("#ffFF0000"))
            } finally {
                recycle()
            }
        }
    }

    val myPath = Path()

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        paintLine.shader = LinearGradient(0f,0f,0f,measuredHeight.toFloat(),gradientColor,Color.parseColor("#10F7F7F7"),Shader.TileMode.MIRROR)
        lastValues?.let {
            drawGraph(it)
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
//        canvas?.drawText("alp", 50f, 50f, paintText)
//        canvas?.drawRect(0f,0f,100f,50f,paintKare)
//        canvas?.drawLine(10f,0f,10f,100f,paintLine)
        canvas?.drawPath(myPath,paintLine)
    }

    var lastValues: List<Double>? = null

    fun drawGraph (values: List<Double>) {

        lastValues = values
        var lastX = 0f
        var lastY = 0f
        val xSpacing = measuredWidth.toFloat() / values.size

        myPath.moveTo(lastX,lastY)

        values.forEach{
            lastX += xSpacing
            lastY = measuredHeight - it.toFloat() * measuredHeight

            myPath.lineTo(lastX,lastY)
        }
        myPath.lineTo(lastX,measuredHeight.toFloat())
        myPath.lineTo(0f,measuredHeight.toFloat())
        Log.e("alpppppppp","lastx = $lastX mesw = $measuredWidth")
    }
}