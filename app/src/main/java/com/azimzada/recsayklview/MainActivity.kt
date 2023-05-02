package com.azimzada.recsayklview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimzada.recsayklview.data.CountryDTO
import com.azimzada.recsayklview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var countryList = mutableListOf<CountryDTO>(
        CountryDTO(R.drawable.ic_launcher_background, "USA"),
        CountryDTO(R.drawable.ic_launcher_foreground, "Kanda")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRsycleView()

    }

    fun setUpRsycleView() {
        var adapter = MyCustomAdapter(countryList)
        var layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false)
        binding.recycleView.layoutManager = layoutManager
        binding.recycleView.adapter = adapter
    }

}