package com.example.myapplication.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Adapter;

import com.example.myapplication.R;
import com.example.myapplication.adapter.RestaurantAdapter;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {
    RecyclerView recycleview;
    RestaurantAdapter adapter;
    ArrayList<ShopActivity> lista = new ArrayList<ShopActivity>();





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        setLista(lista);

        recycleview = findViewById(R.id.recicleviewrestaurant);
        adapter =  new RestaurantAdapter(lista);
        recycleview.setAdapter(adapter);
        recycleview.setLayoutManager(new LinearLayoutManager(this));

    }

    public void setLista(ArrayList <ShopActivity> l){
        ShopActivity s = new ShopActivity("Pizzeria",20);
        ShopActivity s1 = new ShopActivity("Pizzeria",10);
        ShopActivity s3 = new ShopActivity("Pizzeria",24);
        ShopActivity s4 = new ShopActivity("Pizzeria",15);
        ShopActivity s5= new ShopActivity("Pizzeria",26);
        ShopActivity s6 = new ShopActivity("Pizzeria",11);
        lista.add(s);
        lista.add(s1);
        lista.add(s3);
        lista.add(s4);
        lista.add(s5);
        lista.add(s6);
    }



}
