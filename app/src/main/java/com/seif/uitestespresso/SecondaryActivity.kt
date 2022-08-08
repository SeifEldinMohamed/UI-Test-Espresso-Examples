package com.seif.uitestespresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seif.uitestespresso.databinding.ActivitySecondaryBinding

class SecondaryActivity : AppCompatActivity() {
    lateinit var binding:ActivitySecondaryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondaryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonBack.setOnClickListener {
            onBackPressed()
        }

    }
}