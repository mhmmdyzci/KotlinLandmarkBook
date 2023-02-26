package com.mhmmdyzci.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.mhmmdyzci.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.mhmmdyzci.landmarkbookkotlin.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        // casting
        val selectedLankMark = intent.getSerializableExtra("landMark") as LandMark
        binding.imageView.setImageResource(selectedLankMark.image)
        binding.nameText.text = selectedLankMark.name
        binding.countryText.text = selectedLankMark.country







    }
}