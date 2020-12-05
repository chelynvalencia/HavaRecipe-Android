package com.example.recipe.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.recipe.DashboardActivity;
import com.example.recipe.R;
import com.example.recipe.drink.Drink3Activity;
import com.example.recipe.food.Food1Activity;
import com.example.recipe.food.Food2Activity;
import com.example.recipe.food.Food3Activity;
import com.example.recipe.food.Food4Activity;
import com.example.recipe.food.Food5Activity;
import com.example.recipe.food.Food6Activity;

public class FoodActivity extends AppCompatActivity {
    CardView cFood1, cFood2, cFood3, cFood4, cFood5, cFood6;
    ImageButton btnHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        btnHome = findViewById(R.id.btn_home);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FoodActivity.this, DashboardActivity.class);
                startActivity(a);
            }
        });

        cFood1 = findViewById(R.id.food1);
        cFood2 = findViewById(R.id.food2);
        cFood3 = findViewById(R.id.food3);
        cFood4 = findViewById(R.id.food4);
        cFood5 = findViewById(R.id.food5);
        cFood6 = findViewById(R.id.food6);

        cFood1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FoodActivity.this, Food1Activity.class);
                startActivity(a);
            }
        });

        cFood2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FoodActivity.this, Food2Activity.class);
                startActivity(a);
            }
        });

        cFood3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FoodActivity.this, Food3Activity.class);
                startActivity(a);
            }
        });

        cFood4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FoodActivity.this, Food4Activity.class);
                startActivity(a);
            }
        });

        cFood5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FoodActivity.this, Food5Activity.class);
                startActivity(a);
            }
        });

        cFood6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FoodActivity.this, Food6Activity.class);
                startActivity(a);
            }
        });

    }
}
