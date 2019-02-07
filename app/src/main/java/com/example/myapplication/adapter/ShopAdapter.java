package com.example.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.data.Product;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ShopViewHolder> {
    ArrayList<Product> lista;
    Context context;

    View.OnClickListener listener;

    public ShopAdapter(ArrayList<Product>l , Context context, View.OnClickListener listener){
        this.lista = l;
        this.context = context;
        this.listener = listener;
    }


    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View shopview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shop_item, viewGroup,false);
        return new ShopViewHolder(shopview);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder shopViewHolder, int i) {
        Product s = lista.get(i);
        shopViewHolder.view.setText(s.getName());


    }

    @Override
    public int getItemCount() {
        return  lista.size();
    }



    public class ShopViewHolder extends RecyclerView.ViewHolder {
        TextView view;
        Button aggiungi;


        public ShopViewHolder(View v){
            super(v);
            view = v.findViewById(R.id.shopitemview);
            aggiungi = v.findViewById(R.id.aggiungi);
            aggiungi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lista.get(getAdapterPosition()).setQt(lista.get(getAdapterPosition()).getQt()+1);
                    listener.onClick(v);
                }
            });
        }

    }
}
