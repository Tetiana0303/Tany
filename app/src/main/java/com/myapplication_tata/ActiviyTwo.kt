package com.myapplication_tata

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActiviyTwo : AppCompatActivity() {

    lateinit var fullDescription: TextView
    lateinit var nameOfAnimal: TextView
    lateinit var photo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        nameOfAnimal = findViewById(R.id.name)
        photo = findViewById(R.id.photo)
        fullDescription = findViewById(R.id.descript)

        var passingName = intent.getStringExtra("passingName")
        var passingDescription = intent.getStringExtra("passingDescription")

        when(passingName){
            "Wafer" -> photo.setImageResource(R.drawable.maltipu)
            "Pashtet" -> photo.setImageResource(R.drawable.pashtet)
            "Chuck" -> photo.setImageResource(R.drawable.chuck)
        }


        nameOfAnimal.text = passingName

        fullDescription.text = passingDescription

    }
}