package dev.lemberg.playlistmaker

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val searchButton = findViewById<Button>(R.id.search_button)
        searchButton.setOnClickListener {

            val displayIntent = Intent(this@MainActivity, SearchActivity::class.java)
            startActivity(displayIntent)

        }

        val mediaButton = findViewById<Button>(R.id.media_button)
        mediaButton.setOnClickListener {

            val displayIntent = Intent(this@MainActivity, MediaActivity::class.java)
            startActivity(displayIntent)

        }

        val settingsButton = findViewById<Button>(R.id.settings_button)
        settingsButton.setOnClickListener {

            val displayIntent = Intent(this@MainActivity, SettingsActivity::class.java)
            startActivity(displayIntent)

        }
    }
}