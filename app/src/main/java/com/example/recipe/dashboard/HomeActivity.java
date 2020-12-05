package com.example.recipe.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.recipe.AccountActivity;
import com.example.recipe.DashboardActivity;
import com.example.recipe.R;

public class HomeActivity extends AppCompatActivity {

    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        int images[] = {R.drawable.img_slide1, R.drawable.img_slide2, R.drawable.img_slide3};

        v_flipper = findViewById(R.id.v_flipper);

        // for loop
        for (int image: images){
            flipperImages(image);
        }
    }

    public void flipperImages (int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);// 4 sec
        v_flipper.setAutoStart(true);

        //animation
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    public void home(View view) {
        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
    }

    public void logout(View view) {
        startActivity(new Intent(getApplicationContext(), AccountActivity.class));
    }
}
