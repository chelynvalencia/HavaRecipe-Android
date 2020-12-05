package com.example.recipe.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.recipe.DashboardActivity;
import com.example.recipe.R;
import com.example.recipe.dessert.Dessert1Activity;
import com.example.recipe.dessert.Dessert2Activity;
import com.example.recipe.dessert.Dessert3Activity;
import com.example.recipe.dessert.Dessert4Activity;
import com.example.recipe.dessert.Dessert5Activity;

public class DessertActivity extends AppCompatActivity {

    CardView cDess1, cDess2, cDess3, cDess4, cDess5;
    ImageButton btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        cDess1 = findViewById(R.id.dess1);
        cDess2 = findViewById(R.id.dess2);
        cDess3 = findViewById(R.id.dess3);
        cDess4 = findViewById(R.id.dess4);
        cDess5 = findViewById(R.id.dess5);

        btnHome = findViewById(R.id.btn_home);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DessertActivity.this, DashboardActivity.class);
                startActivity(a);
            }
        });

        cDess1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DessertActivity.this, Dessert1Activity.class);
                startActivity(a);
            }
        });

        cDess2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DessertActivity.this, Dessert2Activity.class);
                startActivity(a);
            }
        });

        cDess3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DessertActivity.this, Dessert5Activity.class);
                startActivity(a);
            }
        });

        cDess4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DessertActivity.this, Dessert4Activity.class);
                startActivity(a);
            }
        });

        cDess5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DessertActivity.this, Dessert3Activity.class);
                startActivity(a);
            }
        });

    }
}
