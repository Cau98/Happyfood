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
    ArrayList<String> lista = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLista(lista);
        Log.d("List", String.valueOf(lista));
        setContentView(R.layout.activity_restaurant);
        recycleview = findViewById(R.id.recicleviewrestaurant);
        adapter =  new RestaurantAdapter(lista);
        recycleview.setAdapter(adapter);
        recycleview.setLayoutManager(new LinearLayoutManager(this));

    }
    public void setLista(ArrayList<String> s){
        s.add("prova1");
    }


}
