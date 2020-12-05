package com.example.recipe.dessert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.recipe.DashboardActivity;
import com.example.recipe.R;
import com.example.recipe.AccountActivity;

public class Dessert1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert1);
    }

    public void home(View view) {
        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
    }

    public void logout(View view) {
        startActivity(new Intent(getApplicationContext(), AccountActivity.class));
    }
}
