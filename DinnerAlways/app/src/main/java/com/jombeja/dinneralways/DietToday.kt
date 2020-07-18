package com.jombeja.dinneralways

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class DietToday : AppCompatActivity() {

    var menuposition = POS_NOT_INDICATED

    lateinit var toolbar: Toolbar
    lateinit var spinnerDays : Spinner
    lateinit var imageView: ImageView
    lateinit var tvDinnerLabel: TextView
    lateinit var tvDinnertext: TextView
    lateinit var tvDrinkLabel: TextView
    lateinit var tvDrinktext: TextView
    lateinit var tvNutrientsLabel: TextView
    lateinit var tvNutrientstext: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinner_today)
        spinnerDays = findViewById(R.id.spinner_days)
        imageView = findViewById(R.id.image_dinner_today)
        tvDinnerLabel = findViewById(R.id.text_dinner_label)
        tvDinnertext = findViewById(R.id.text_dinner_today)
        tvDrinkLabel = findViewById(R.id.text_drink_label)
        tvDrinktext = findViewById(R.id.text_drink_today)
        tvNutrientsLabel = findViewById(R.id.text_nutrients_label)
        tvNutrientstext = findViewById(R.id.text_nutrients)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val adapterDiet = ArrayAdapter<DietClass>(this,
            android.R.layout.simple_spinner_item, DataManager.diets.values.toList())
        adapterDiet.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerDays.adapter = adapterDiet

        menuposition = intent.getIntExtra(EXTRA_MENU_POSITION, POS_NOT_INDICATED)

        if (menuposition != POS_NOT_INDICATED)
            displayTodaysDiet()

    }

    private fun displayTodaysDiet() {
        val menu = DataManager.menus[menuposition]
        imageView.setImageResource(menu.Icon)
        tvDinnertext.setText(menu.diet.Recipe)
        tvDrinktext.setText(menu.Drink)
        tvNutrientstext.setText(menu.Nutrients)

        val dietPosition = DataManager.diets.values.indexOf(menu.diet)
        spinnerDays.setSelection(dietPosition)

    }

}