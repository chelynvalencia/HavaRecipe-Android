package com.example.recipe.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipe.R;
import com.example.recipe.model.DataRecipe;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<DataRecipe> dataRecipes;

    public RecipeAdapter(Context cont, ArrayList<DataRecipe> data){
        context = cont;
        dataRecipes = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_new_recipe,
                parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.vmenu.setText(dataRecipes.get(position).getMenu());
        holder.vcategory.setText(dataRecipes.get(position).getCategory());
        holder.vdescription.setText(dataRecipes.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return dataRecipes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView vmenu, vcategory, vdescription;
        Button btnRecipe;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            vmenu = itemView.findViewById(R.id.nama_recipe);
            vcategory = itemView.findViewById(R.id.category);
            vdescription = itemView.findViewById(R.id.desc);

        }
    }
}
