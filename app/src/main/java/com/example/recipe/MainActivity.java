package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread ssThread = new Thread(){
            public void run(){
                try{
                    sleep(3*1000);
                    Intent i = new Intent(getBaseContext(), SignInActivity.class);
                    startActivity(i);
                    finish();
                }catch (Exception e){
                }
            }
        };
        ssThread.start();


    }
}
