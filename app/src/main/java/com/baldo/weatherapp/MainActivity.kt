package com.baldo.weatherapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val items = listOf(
        "Kalanchoe marmorata",
        "Euphorbia lactea",
        "Euphorbia pulcherrima",
        "Euphorbia tirucalli",
        "Sedum prealtrum",
        "Euphorbia marginata",
        "Echeveria agavoides"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtDisplay.text = "Plants Collection"

        val forecastList = findViewById(R.id.listForecast) as RecyclerView
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)
    }

}
