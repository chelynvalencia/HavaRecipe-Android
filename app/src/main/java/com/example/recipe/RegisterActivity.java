package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    EditText etUsername, etEmail, etPassword, etPhone;
    TextView tvLogin;
    Button btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUsername = findViewById(R.id.cr_username);
        etEmail = findViewById(R.id.cr_email);
        etPassword = findViewById(R.id.cr_password);
        etPhone = findViewById(R.id.cr_phone);

        tvLogin = findViewById(R.id.homelogin);

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(a);
            }
        });

    }
}
