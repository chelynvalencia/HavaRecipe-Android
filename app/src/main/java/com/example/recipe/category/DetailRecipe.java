package com.example.recipe.category;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.recipe.R;
import com.example.recipe.adapter.DetailAdapter;
import com.example.recipe.model.DataDetail;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class DetailRecipe extends AppCompatActivity {

    private DatabaseReference reference;
    ArrayList<DataDetail> list;
    DetailAdapter adapter;

    private RecyclerView mRecycler;
    private LinearLayoutManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_recipe);

        mRecycler = findViewById(R.id.list_detailrecipe);
        mRecycler.setHasFixedSize(true);

        mManager = new LinearLayoutManager(this);
        mManager.setReverseLayout(true);
        mManager.setStackFromEnd(true);
        mRecycler.setLayoutManager(mManager);

        reference = FirebaseDatabase.getInstance().getReference().child("recipes");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list = new ArrayList<>();
                for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
                    DataDetail det = dataSnapshot1.getValue(DataDetail.class);
                    list.add(det);
                }
                adapter = new DetailAdapter(getApplicationContext(),list);
                mRecycler.setAdapter(adapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(DetailRecipe.this, "Terjadi Kesalahan", Toast.LENGTH_LONG).show();
            }
        });
    }
}
