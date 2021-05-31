package com.dicoding.kulinero.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.kulinero.R

class FoodDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        val actionBar = supportActionBar
        actionBar!!.title = "Food Detail"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tvName: TextView = findViewById(R.id.tv_food_name)
        val tvDetail: TextView = findViewById(R.id.tv_food_detail)
        val tvIngredient: TextView = findViewById(R.id.tv_content_ingredient)
        val imgPhoto: ImageView = findViewById(R.id.img_food)
        val btnFavorite: Button = findViewById(R.id.btn_set_favorite)
        val btnShare: Button = findViewById(R.id.btn_set_share)

        val foodName = intent.getStringExtra(FOOD_NAME)
        val foodDetail = intent.getStringExtra(FOOD_DETAIL)
        val foodIngredient = intent.getStringExtra(FOOD_INGREDIENT)
        val foodPhoto = intent.getIntExtra(FOOD_PHOTO, 0)
        val context = applicationContext

        tvName.text = foodName
        tvDetail.text = foodDetail
        tvIngredient.text = foodIngredient
        Glide.with(this).load(foodPhoto).apply(RequestOptions()).into(imgPhoto)

        btnFavorite.setOnClickListener {
            Toast.makeText(
                context,
                "Favorite " + foodName,
                Toast.LENGTH_SHORT
            ).show()
        }

        btnShare.setOnClickListener {
            Toast.makeText(
                context,
                "Share " + foodName,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {
        const val FOOD_NAME = "food_name"
        const val FOOD_DETAIL = "food_detail"
        const val FOOD_INGREDIENT = "food_ingredient"
        const val FOOD_PHOTO = "food_photo"
    }
}

