package com.example.tetrix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.content.Intent
import com.google.android.material.snackbar.Snackbar
import com.example.tetrix.storage.AppPreferences
class MainActivity : AppCompatActivity() {
    private var tvHighScore:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btnNewGame = findViewById<Button>(R.id.btnNewGame)
        val btnResetGame = findViewById<Button>(R.id.btnResetGame)
        val btnExit = findViewById<Button>(R.id.btnEndGame)
        tvHighScore = findViewById(R.id.tvHigScore)

        btnNewGame.setOnClickListener(this::onBtnNewGameClick)
        btnResetGame.setOnClickListener(this::onBtnResetGameClick)
        btnExit.setOnClickListener(this::onBntExitClick)
    }
    private fun onBtnNewGameClick(view: View){
        val intent = Intent(this,GameActivity::class.java)
        startActivity(intent)
    }

    private fun onBtnResetGameClick(view: View){
       val preferences = AppPreferences(this)
        preferences.clearHighScore()
        Snackbar.make(
            view, "Score Successfully Reset",
            Snackbar.LENGTH_SHORT).show()
       tvHighScore?.text = "High Score: ${preferences.getHighScore()}"
    }

    private fun onBntExitClick(view: View){

        System.exit(0)


    }

}