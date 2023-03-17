package com.myapplication_tata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.myapplication_tata.R.drawable.dog

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView



    var animals = ArrayList<Animal>()

    lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rV)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        var dog = Animal( name = "Wafer", shortDescription = "Dog", description = "Miniature breed - maltipu,\n Height from 20 to 30 cm.,\n Weight from 20 to 5 kg,\n, Cheeful, loyal, clever ",  R.drawable.dog,R.drawable.maltipu,)
        var hamster = Animal("Pashtet", "Hamster", "Breed - jungarik,\n Lenght up to 10 cm,\n Weight from 25 - 65 gram,\n Height: 35cm\n Cute, active, modest", R.drawable.hamster,R.drawable.pashtet)
        var rabbit = Animal ("Chuck", "Rabbit", "Breed - dwarf rabbit,\n Lenght from 32 to 34 cm, \n Weight from 1.5 to 3 kg, \n Communicative, calm, beautiful ", R.drawable.rabbit,R.drawable.chuck)
        animals.add(dog)
        animals.add(hamster)
        animals.add(rabbit)

        adapter = Adapter(animals, this@MainActivity)

        recyclerView.adapter = adapter

    }
}