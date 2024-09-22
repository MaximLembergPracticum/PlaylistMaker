package dev.lemberg.playlistmaker

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class SettingsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val arrowBackButton = findViewById<Toolbar>(R.id.arrow_back_button)

        arrowBackButton.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}