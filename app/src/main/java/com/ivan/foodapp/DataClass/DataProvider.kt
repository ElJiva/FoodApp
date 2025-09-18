package com.ivan.foodapp.DataClass


import com.ivan.foodapp.R

object DataProvider {

    fun getCategories(): List<Category> {
        return listOf(
            Category(1, "Fast Food", R.drawable.category_fast_food),
            Category(2, "Chinese", R.drawable.category_chinese),
            Category(3, "Italian", R.drawable.category_italian),
            Category(4, "Mexican", R.drawable.category_mexican),
            Category(5, "Japanese", R.drawable.category_japanese),
            Category(6, "Indian", R.drawable.category_indian)
        )
    }

    fun getRestaurants(): List<Restaurant> {
        return listOf(
            Restaurant(1, "Burger King", R.drawable.logo_burger_king),
            Restaurant(2, "McDonald's", R.drawable.logo_mcdonalds),
            Restaurant(3, "KFC", R.drawable.logo_kfc),
            Restaurant(4, "Pizza Hut", R.drawable.logo_pizza_hut),
            Restaurant(5, "Subway", R.drawable.logo_subway),
            Restaurant(6, "Domino's", R.drawable.logo_dominos)
        )
    }

    fun getRecommendedFoods(): List<Food> {
        return listOf(
            Food(1, "Whopper", R.drawable.food_whopper, 4.5, 99.8),
            Food(2, "Chicken Fries", R.drawable.food_chicken_fries, 4.3, 59.8),
            Food(3, "Big Mac", R.drawable.food_big_mac, 4.6, 79.8),
            Food(4, "McFlurry", R.drawable.food_mcflurry, 4.7, 49.8),
            Food(5, "Original Recipe", R.drawable.food_original_recipe, 4.4, 89.8),
            Food(6, "Margherita Pizza", R.drawable.food_margherita_pizza, 4.8, 129.8)
        )
    }
}