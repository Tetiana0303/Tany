package com.myapplication_tata

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    var animals: ArrayList<Animal>,
    var context: Context
) :RecyclerView.Adapter<Adapter.AnimalViewHolder>() {

    class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var textViewAnimalName : TextView = itemView.findViewById(R.id.nameOfAnmal)
        var textViewAnimalShortDescription : TextView = itemView.findViewById(R.id.shortDesciption)
        var imageView : ImageView = itemView.findViewById(R.id.imageAnimal)
        var button : Button = itemView.findViewById(R.id.buttonDetails)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.animal,parent,false)

        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return animals.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {

        holder.textViewAnimalName.text = animals.get(position).name
        holder.textViewAnimalShortDescription.text = animals.get(position).shortDescription
        holder.imageView.setImageResource(animals.get(position).picture)

        holder.button.setOnClickListener{

            var passingName = animals.get(position).name
            var passingDescription = animals.get(position).description

            var intent = Intent(context,ActiviyTwo::class.java)

            intent.putExtra("passingName", passingName)
            intent.putExtra("passingDescription", passingDescription)

            context.startActivity(intent)

        }
    }
}