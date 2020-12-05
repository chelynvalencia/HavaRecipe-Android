package com.example.recipe.category;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.recipe.R;
import com.example.recipe.adapter.RecipeAdapter;
import com.example.recipe.model.DataRecipe;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class NewActivity extends AppCompatActivity {

    private DatabaseReference reference;

    ArrayList<DataRecipe> list;
    RecipeAdapter adapter;

    private RecyclerView mRecycler;
    private LinearLayoutManager mManager;

    Button btnDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        btnDetail = findViewById(R.id.btnDetail);
        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(NewActivity.this, DetailRecipe.class);
                startActivity(a);
            }
        });

        mRecycler = findViewById(R.id.list_recipe);
        mRecycler.setHasFixedSize(true);

        mManager = new LinearLayoutManager(this);
        mManager.setReverseLayout(true);
        mManager.setStackFromEnd(true);
        mRecycler.setLayoutManager(mManager);

        reference = FirebaseDatabase.getInstance().getReference().child("foods");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list = new ArrayList<>();
                for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
                    DataRecipe recipe = dataSnapshot1.getValue(DataRecipe.class);
                    list.add(recipe);
                }
                adapter = new RecipeAdapter(getApplicationContext(), list);
                mRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(NewActivity.this, "Terjadi Kesalahan",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
