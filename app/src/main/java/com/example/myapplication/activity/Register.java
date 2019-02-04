package com.example.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.activity.MainActivity;

public class Register extends AppCompatActivity implements View.OnClickListener{
    Button buttonr;
    EditText mailr;
    EditText pswr;
    EditText cellr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mailr = findViewById(R.id.mailr);
        pswr = findViewById(R.id.pswr);
        cellr = findViewById(R.id.cellr);
        buttonr = findViewById(R.id.buttonr);
        buttonr.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Toast t = Toast.makeText(getApplicationContext(),"Registrazione Effettuata",Toast.LENGTH_SHORT);
        t.show();
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }
}
