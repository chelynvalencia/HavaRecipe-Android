package com.example.recipe.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.recipe.DashboardActivity;
import com.example.recipe.R;
import com.example.recipe.AccountActivity;

public class Food2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food2);
    }

    public void logouta(View view) {
        startActivity(new Intent(getApplicationContext(), AccountActivity.class));
    }

    public void homea(View view) {
        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
    }
}
