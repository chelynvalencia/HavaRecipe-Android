package com.example.recipe.dashboard;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.recipe.AccountActivity;
import com.example.recipe.DashboardActivity;
import com.example.recipe.LoginActivity;
import com.example.recipe.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class AboutActivity extends FragmentActivity implements OnMapReadyCallback {


    Button ourrecipe;

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        ourrecipe = findViewById(R.id.ourrecipe);


        ourrecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(AboutActivity.this, RecipeActivity.class);
                startActivity(a);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng HavaRecipe = new LatLng(-6.362139, 106.824927);
        map.addMarker(new MarkerOptions().position(HavaRecipe).title("CCIT-FTUI"));
        map.moveCamera(CameraUpdateFactory.newLatLng(HavaRecipe));
    }

    public void homea(View view) {
        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
    }

    public void logouta(View view) {
        startActivity(new Intent(getApplicationContext(), AccountActivity.class));
    }
}
