package com.example.myapplication.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;


public class ShopActivity extends AppCompatActivity {
    public String name;
    public int nportate;

    public ShopActivity(String n, int portate){
        this.name = n;
        this.nportate = portate;
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actyvity_shop);
    }
}
