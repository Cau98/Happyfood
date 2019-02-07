package com.example.myapplication.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    Button login;
    EditText mail;
    EditText psw;
    Switch s;
    View t;
    private String sharedPreference = "com.example.myapplication.references";
    SharedPreferences preferences;
    String email;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getSharedPreferences(sharedPreference,MODE_PRIVATE);

        setContentView(R.layout.activity_main);
        login = findViewById(R.id.loginmain);
        mail = findViewById(R.id.mailtxt);
        psw = findViewById(R.id.pswtxt);
        s= findViewById(R.id.mainswitch);
       t = findViewById(R.id.mainlayout);
       mail.setText(preferences.getString("mail","Ciao"));
       password = preferences.getString("password","Prova");
       s.setOnCheckedChangeListener(this);
       login.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, RestaurantActivity.class);

        /*if(verificaMail(mail.getText().toString()) && verificaPassword(psw.getText().toString()) )

        else{
            Toast t = Toast.makeText(getApplicationContext(),"Verifica dati",Toast.LENGTH_SHORT);
            t.show();}*/
        email = mail.getText().toString();
        password = psw.getText().toString();
        SharedPreferences.Editor preferenceEditor = preferences.edit();
        preferenceEditor.putString("mail",email);
        preferenceEditor.putString("psw",password);
        preferenceEditor.apply();

        startActivity(intent);
    }

    public boolean verificaMail(String mail){
        return Patterns.EMAIL_ADDRESS.matcher(mail).matches();
    }

    public boolean verificaPassword(String psw){
        return psw.length()>6;
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(isChecked){
            t.setBackgroundColor(Color.BLACK);
            s.setTextColor(Color.WHITE);
        }else{
            t.setBackgroundColor(Color.WHITE);
            s.setTextColor(Color.BLACK);
        }
    }
}
