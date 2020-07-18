package com.jombeja.dinneralways

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val context: Context, private val menus: List<MenuClass>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.homescreen_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = menus.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menu = menus[position]

        holder.imageMenu?.setImageResource(menu.Icon)
        holder.textMenu?.text = menu.diet.Recipe
        holder.textDay?.text = menu.diet.Day
        holder.menuposition = position
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageMenu = itemView?.findViewById<ImageView?>(R.id.image_menu)
        val textMenu = itemView?.findViewById<TextView?>(R.id.text_menu)
        val textDay = itemView?.findViewById<TextView?>(R.id.text_day)
        var menuposition = 0

        init {
            itemView?.setOnClickListener {
                val intenttoday = Intent(context, DietToday::class.java)
                intenttoday.putExtra(EXTRA_MENU_POSITION, menuposition)
                context.startActivity(intenttoday)
            }
        }

    }
}