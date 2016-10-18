package com.example.admin.qapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  Button btn_tech;


            public void tech(View v){
                Intent click =new Intent(MainActivity.this,Technology.class);

                startActivity(click);
            }

    public  Button btn_biology;


    public void biology (View v){
        Intent click =new Intent(MainActivity.this,Biology.class);

        startActivity(click);
    }


    public  Button btn_history;


    public void history (View v){
        Intent click =new Intent(MainActivity.this,History.class);

        startActivity(click);
    }
    public void Exit (View v) {
        // TODO Auto-generated method stub
        System.exit(0);
        finish();
    }
}






