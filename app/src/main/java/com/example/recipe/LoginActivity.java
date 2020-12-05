package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class LoginActivity extends AppCompatActivity {

    ImageButton add_Register;
    EditText email, password;
    Button btnlogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        add_Register = findViewById(R.id.Add_Register);
        email = findViewById(R.id.input_email);
        password = findViewById(R.id.input_password);
        btnlogin = findViewById(R.id.login);

        add_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(a);
            }
        });



    }
}
