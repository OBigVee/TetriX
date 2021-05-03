package com.example.tetrix.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.os.Handler
import android.os.Message
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import androidx.annotation.Dimension
import androidx.recyclerview.widget.RecyclerView
import com.example.tetrix.Constants.CellConstants
import com.example.tetrix.GameActivity
import com.example.tetrix.Constants.FieldConstants
import com.example.tetrix.models.AppModel
import com.example.tetrix.models.Block

class TetrisView:View{
    private  val paint = Paint()
    private var lastMove: Long = 0
    private var activity: GameActivity? = null
    private val viewHandler = ViewHandler(this)
    private var cellSize: Dimension = Dimension(0,0)
    private var frameOffset: Dimension = Dimension(0,0)
//    private val viewHandler: RecyclerView.ViewHolder(this)
//    private var cellSize: Dimension = Dimension(0,0)
//    private var frameOffset: Dimension = Dimension(0,0)

    constructor(context: Context, attrs: AttributeSet):
            super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyle:Int):
            super (context,attrs,defStyle)

    companion object{
        private val DELAY = 500
        private val BLOCK_OFFSET = 2
        private val FRAME_OFFSET_BASE = 10
    }
}