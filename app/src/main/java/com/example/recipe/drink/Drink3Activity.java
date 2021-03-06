package com.example.recipe.drink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.recipe.DashboardActivity;
import com.example.recipe.R;
import com.example.recipe.AccountActivity;

public class Drink3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink3);
    }

    public void home(View view) {
        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
    }

    public void logout(View view) {
        startActivity(new Intent(getApplicationContext(), AccountActivity.class));
    }
}
