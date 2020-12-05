package com.example.recipe.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.recipe.AccountActivity;
import com.example.recipe.DashboardActivity;
import com.example.recipe.LoginActivity;
import com.example.recipe.Message;
import com.example.recipe.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ContactActivity extends AppCompatActivity {

    private DatabaseReference DBKoneksi;
    private String userId;

    EditText etName, etEmail, etRecipe, etMessage;
    Button btnSave, btnLogout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        etName = findViewById(R.id.et_nama);
        etEmail = findViewById(R.id.et_email);
        etRecipe = findViewById(R.id.et_recipe);
        etMessage = findViewById(R.id.et_message);

        btnLogout = findViewById(R.id.logout);

        btnSave = findViewById(R.id.btnsave);

        DBKoneksi = FirebaseDatabase.getInstance().getReference().child("feedback");
        userId = DBKoneksi.push().getKey();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sName = etName.getText().toString();
                String sEmail = etEmail.getText().toString();
                String sRecipe = etRecipe.getText().toString();
                String sMessage = etMessage.getText().toString();


                if (sEmail.equals("") || sMessage.equals(""))
                {
                    Toast.makeText(ContactActivity.this, "Data cannot be empty", Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(ContactActivity.this, "Data Saved",
                            Toast.LENGTH_SHORT).show();
                    simpanData();
                    finish();
                }
            }
        });

    }

    private void simpanData() {
        Message message = new Message(userId,
                etName.getText().toString(),
                etEmail.getText().toString(),
                etRecipe.getText().toString(),
                etMessage.getText().toString());

        DBKoneksi.child(userId).setValue(message);
    }



    public void dashboard(View view) {
        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
    }

    public void account(View view) {
            startActivity(new Intent(getApplicationContext(), AccountActivity.class));
    }
}
