package com.azimzada.recsayklview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.azimzada.recsayklview.data.CountryDTO

class MyCustomAdapter(val list: List<CountryDTO>) :
    RecyclerView.Adapter<MyCustomAdapter.ViewHolder>() {
    lateinit var list1: List<CountryDTO>

    init {
        this.list1 = list
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val counryNameTextView = itemView.findViewById<TextView>(R.id.textViewCounter)
        val counryFlagTextView = itemView.findViewById<ImageView>(R.id.imageCountryFlag)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
//        Log.d("Lifcycle", "Listden Elementi goturduk  $")
        val contactView = inflater.inflate(R.layout.countre_item, parent, false)

        return ViewHolder(contactView)

    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val country = list.get(position);
        Log.d("Lifcycle", "onBindViewHolder $position")
        holder.counryNameTextView.setText(country.countrNama)
        holder.counryFlagTextView.setImageResource(country.resurceName)
    }
}