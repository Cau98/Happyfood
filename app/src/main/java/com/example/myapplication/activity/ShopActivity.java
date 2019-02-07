package com.example.myapplication.activity;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.ShopAdapter;
import com.example.myapplication.data.Product;

import java.util.ArrayList;


public class ShopActivity extends AppCompatActivity  implements View.OnClickListener{
    ArrayList<Product> lista = new ArrayList<>();
    RecyclerView recyclerView;
    ShopAdapter adapter;
    TextView texttot;
    ProgressBar barra;
    Button checkout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actyvity_shop);
        checkout = findViewById(R.id.checkout);
        texttot = findViewById(R.id.viewtot);
        barra = findViewById(R.id.progressbar);
        barra.setIndeterminate(false);
        barra.setMax(20);
        barra.setProgress(0);
        setLista(lista);
        recyclerView = findViewById(R.id.relative);
        adapter =  new ShopAdapter(lista, this, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.aggiungi:
                checkCart();
                break;
        }
    }


    @TargetApi(Build.VERSION_CODES.N)
    private void checkCart(){
        double tot =0;
        for (Product p : lista){
            tot += p.getPrice()*p.getQt();

        }
        texttot.setText(""+tot);
        barra.setProgress((int)(tot*100),true);
        CheckValue(tot,this.checkout);
    }

    public void CheckValue(double tot, Button b){
        if(tot >= 20){
            b.setEnabled(true);
        }
        else b.setEnabled(false);
    }

    public void setLista(ArrayList<Product> l) {
        l.add(new Product("cazzo", 15.7));
        l.add(new Product("cazzo", 14.7));
        l.add(new Product("cazzo", 13.7));
        l.add(new Product("cazzo", 12.7));
        l.add(new Product("cazzo", 11.7));
        l.add(new Product("cazzo", 10.7));
    }
}
