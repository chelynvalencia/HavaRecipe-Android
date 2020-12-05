package com.example.recipe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipe.R;
import com.example.recipe.model.DataDetail;

import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<DataDetail> dataDetails;

    public DetailAdapter(Context cont, ArrayList<DataDetail> data){
        context = cont;
        dataDetails = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detail_menu,
                parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.vmenu.setText(dataDetails.get(position).getMenu());
        holder.vpreparation.setText(dataDetails.get(position).getPreparation());
        holder.vcooking.setText(dataDetails.get(position).getCooking());
        holder.vmaterial_1.setText(dataDetails.get(position).getMaterial_1());
        holder.vmaterial_2.setText(dataDetails.get(position).getMaterial_2());
        holder.vmaterial_3.setText(dataDetails.get(position).getMaterial_3());
        holder.vstep_1.setText(dataDetails.get(position).getStep_1());
        holder.vstep_2.setText(dataDetails.get(position).getStep_2());
        holder.vstep_3.setText(dataDetails.get(position).getStep_3());
    }

    @Override
    public int getItemCount() {
        return dataDetails.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView vmenu, vpreparation, vcooking, vmaterial_1, vmaterial_2, vmaterial_3, vstep_1, vstep_2, vstep_3;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            vmenu = itemView.findViewById(R.id.menurecipe);
            vpreparation = itemView.findViewById(R.id.prep);
            vcooking = itemView.findViewById(R.id.cook);
            vmaterial_1 = itemView.findViewById(R.id.material1);
            vmaterial_2 = itemView.findViewById(R.id.material2);
            vmaterial_3 = itemView.findViewById(R.id.material3);
            vstep_1 = itemView.findViewById(R.id.step1);
            vstep_2 = itemView.findViewById(R.id.step2);
            vstep_3 = itemView.findViewById(R.id.step3);
        }
    }
}
