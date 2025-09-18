package com.ivan.foodapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ivan.foodapp.DataClass.DataProvider
import com.ivan.foodapp.ui.theme.FoodAppTheme
import com.ivan.foodapp.Screens.HeaderSection

@Composable
fun HomeScreen(
    userName: String = "Ivan",
    onLogout: () -> Unit = {}
) {
    val categories = DataProvider.getCategories()
    val restaurants = DataProvider.getRestaurants()
    val recommendedFoods = DataProvider.getRecommendedFoods()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState())
    ) {
        // Header with greeting and logout button
        HeaderSection(userName = userName, onLogout = onLogout)

        Spacer(modifier = Modifier.height(24.dp))

        // Categories section
        CategoriesSection(categories = categories)

        Spacer(modifier = Modifier.height(32.dp))

        // Restaurants section
        RestaurantsSection(restaurants = restaurants)

        Spacer(modifier = Modifier.height(32.dp))


    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    FoodAppTheme {
        HomeScreen()
    }
}