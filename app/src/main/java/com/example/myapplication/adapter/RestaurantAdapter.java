package com.example.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.activity.RestaurantActivity;
import com.example.myapplication.activity.ShopActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    ArrayList<ShopActivity> lista ;



    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mItemview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.restaurant_item,viewGroup,false);
        return new RestaurantViewHolder(mItemview);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder restaurantViewHolder, int i) {
        String mCurrent = lista.get(i).name;
        int value = lista.get(i).nportate;

        restaurantViewHolder.wordItemView.setText(mCurrent+ "   " +String.valueOf(value));
        int a =0;

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public RestaurantAdapter(ArrayList<ShopActivity> lista){
        this.lista = lista;
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView wordItemView;


        public RestaurantViewHolder (View itemView) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.restaurantitem);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            //prima o poi farà qualcosa

        }
    }
}
