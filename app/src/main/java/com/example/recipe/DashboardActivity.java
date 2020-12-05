package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recipe.dashboard.AboutActivity;
import com.example.recipe.dashboard.ContactActivity;
import com.example.recipe.dashboard.HomeActivity;
import com.example.recipe.dashboard.RecipeActivity;

public class DashboardActivity extends AppCompatActivity {

    CardView cHome, cRecipe, cAbout, cContact;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        cHome = (CardView) findViewById(R.id.menu_home);
        cRecipe = (CardView) findViewById(R.id.menu_recipe);
        cAbout = (CardView) findViewById(R.id.menu_about);
        cContact = (CardView) findViewById(R.id.menu_contact);

        logout = (Button) findViewById(R.id.logout);

        cAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DashboardActivity.this, AboutActivity.class);
                startActivity(a);
            }
        });

        cContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DashboardActivity.this, ContactActivity.class);
                startActivity(a);
            }
        });

        cRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DashboardActivity.this, RecipeActivity.class);
                startActivity(a);
            }
        });

        cHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DashboardActivity.this, HomeActivity.class);
                startActivity(a);
            }
        });
    }

    public void logout(View view) {
        startActivity(new Intent(getApplicationContext(), AccountActivity.class));
    }
}
