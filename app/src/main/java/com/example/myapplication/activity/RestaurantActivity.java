package com.example.myapplication.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import java.lang.String;
import com.example.myapplication.R;
import com.example.myapplication.adapter.RestaurantAdapter;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity implements View.OnClickListener {
    RecyclerView recycleview;
    RestaurantAdapter adapter;
    ArrayList<String> lista = new ArrayList<String>();
    RecyclerView.LayoutManager manager;
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        l = findViewById(R.id.linearlayout);
        setLista(lista);
        manager = new LinearLayoutManager(this);
        recycleview = findViewById(R.id.recicleviewrestaurant);
        adapter = new RestaurantAdapter(lista, this);
        recycleview.setAdapter(adapter);
        recycleview.setLayoutManager(manager);
        l.setOnClickListener(this);
    }

    public void setLista(ArrayList<String> l) {
        l.add("s");
        l.add("s1");
        l.add("s3");
        l.add("s4");
        l.add("s5");
        l.add("s6");
    }


    @Override
    public void onClick(View v) {
        adapter.setGrid(!adapter.isGrid());
        manager = adapter.isGrid()?new GridLayoutManager(this,2): new LinearLayoutManager(this) ;
        recycleview.setAdapter(adapter);
        recycleview.setLayoutManager(manager);
    }
}