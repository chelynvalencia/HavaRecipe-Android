package com.example.recipe.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.recipe.DashboardActivity;
import com.example.recipe.R;
import com.example.recipe.category.DessertActivity;
import com.example.recipe.category.DrinkActivity;
import com.example.recipe.category.FoodActivity;
import com.example.recipe.category.NewActivity;
import com.example.recipe.drink.Drink4Activity;

public class RecipeActivity extends AppCompatActivity {

    ImageButton btnHome;
    CardView cvFood, cvDrink, cvDessert, cvNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        btnHome = findViewById(R.id.btn_home);
        cvFood = findViewById(R.id.food);
        cvDrink = findViewById(R.id.drink);
        cvDessert = findViewById(R.id.dessert);
        cvNews = findViewById(R.id.news);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(RecipeActivity.this, DashboardActivity.class);
                startActivity(a);
            }
        });

        cvFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(RecipeActivity.this, FoodActivity.class);
                startActivity(a);
            }
        });

        cvDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(RecipeActivity.this, DrinkActivity.class);
                startActivity(a);
            }
        });

        cvDessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(RecipeActivity.this, DessertActivity.class);
                startActivity(a);
            }
        });

        cvNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(RecipeActivity.this, NewActivity.class);
                startActivity(a);
            }
        });

    }
}
