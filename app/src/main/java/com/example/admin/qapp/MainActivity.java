package com.example.admin.qapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public  Button btn_tech;


            public void tech(View v){
                Intent click =new Intent(MainActivity.this,Main2Activity.class);

                startActivity(click);
            }

    public  Button btn_bio;


    public void bio(View v) {
        Intent click = new Intent(MainActivity.this, Main3Activity.class);

        startActivity(click);
    }


    public  Button btn_history;


    public void history (View v){
        Intent click =new Intent(MainActivity.this,Main4Activity.class);

        startActivity(click);
    }




}


