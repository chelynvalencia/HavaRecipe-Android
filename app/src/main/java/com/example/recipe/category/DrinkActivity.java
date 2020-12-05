package com.example.recipe.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.recipe.DashboardActivity;
import com.example.recipe.R;
import com.example.recipe.drink.Drink1Activity;
import com.example.recipe.drink.Drink2Activity;
import com.example.recipe.drink.Drink3Activity;
import com.example.recipe.drink.Drink4Activity;

public class DrinkActivity extends AppCompatActivity {
    CardView cDrink1, cDrink2, cDrink3, cDrink4;

    ImageButton btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        cDrink1 = findViewById(R.id.drink1);
        cDrink2 = findViewById(R.id.drink2);
        cDrink3 = findViewById(R.id.drink3);
        cDrink4 = findViewById(R.id.drink4);

        btnHome = findViewById(R.id.btn_home);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DrinkActivity.this, DashboardActivity.class);
                startActivity(a);
            }
        });

        cDrink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DrinkActivity.this, Drink1Activity.class);
                startActivity(a);
            }
        });

        cDrink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DrinkActivity.this, Drink2Activity.class);
                startActivity(a);
            }
        });

        cDrink3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DrinkActivity.this, Drink3Activity.class);
                startActivity(a);
            }
        });

        cDrink4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DrinkActivity.this, Drink4Activity.class);
                startActivity(a);
            }
        });
    }
}
