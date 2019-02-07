package com.example.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.activity.ShopActivity;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    ArrayList<String> list;
    Context context;
    private boolean isGrid;






    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int layout = isGrid? R.layout.restaurant_item_grid : R.layout.restaurant_item;
        View mItemview = LayoutInflater.from(viewGroup.getContext()).inflate(layout,viewGroup,false);
        return new RestaurantViewHolder(mItemview);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder restaurantViewHolder, int i) {
        String mCurrent = list.get(i);
        restaurantViewHolder.wordItemView.setText(mCurrent);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public RestaurantAdapter(ArrayList<String> lista, Context context){
        this.context = context;
        this.list = lista;
    }

    public boolean isGrid() {
        return isGrid;
    }

    public void setGrid(boolean grid) {
        isGrid = grid;
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView wordItemView;



        public RestaurantViewHolder (View itemView) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.restaurantitem);
            wordItemView.setOnClickListener(this);



        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, ShopActivity.class);
            context.startActivity(intent);



        }
    }
}
