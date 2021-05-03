package com.example.tetrix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tetrix.storage.AppPreferences

class GameActivity : AppCompatActivity() {
    var tvHighScore: TextView? = null
    var tvCurrentScore: TextView? = null
    var appPreferences:AppPreferences?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        appPreferences = AppPreferences(this)
        val btnRestart = findViewById<Button>(R.id.btnRestart)
        tvHighScore = findViewById(R.id.tv_HigScore)
        tvCurrentScore = findViewById(R.id.tvCurrentScore)

        updateHighScore()
        updateCurrentScore()

    }

    private fun updateHighScore() {
        tvCurrentScore?.text ="0"
    }
    private fun updateCurrentScore() {
        tvHighScore?.text = "${appPreferences?.getHighScore()}"
    }




}