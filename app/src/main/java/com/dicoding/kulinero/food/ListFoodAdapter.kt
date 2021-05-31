package com.dicoding.kulinero.food

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.kulinero.R

class ListFoodAdapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_food, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (foodName, foodDetail, foodIngredient, foodPhoto) = listFood[position]

        Glide.with(holder.itemView.context).load(foodPhoto).apply(RequestOptions())
            .into(holder.imgPhoto)
        holder.tvName.text = foodName
        holder.tvDetail.text = foodDetail

        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Kamu memilih " + listFood[position].name,
                Toast.LENGTH_SHORT
            ).show()
            val moveData = Intent(holder.itemView.context, FoodDetail::class.java)
            moveData.putExtra(FoodDetail.FOOD_NAME, foodName)
            moveData.putExtra(FoodDetail.FOOD_DETAIL, foodDetail)
            moveData.putExtra(FoodDetail.FOOD_INGREDIENT, foodIngredient)
            moveData.putExtra(FoodDetail.FOOD_PHOTO, foodPhoto)
            holder.itemView.context.startActivity(moveData)
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }
}