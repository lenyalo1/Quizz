package com.example.admin.qapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Technology extends AppCompatActivity implements View.OnClickListener {
    private RadioGroup radio_1,radio_2,radio_3,radio_4,radio_5;
    private RadioButton btn_field, btn_animation, btn_true, btn_2007, btn_ROM;
    private Button btn_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_field = (RadioButton) findViewById(R.id.btn_field);
        btn_2007 = (RadioButton) findViewById(R.id.btn_2007);
        btn_animation = (RadioButton) findViewById(R.id.btn_animation);
        btn_ROM = (RadioButton) findViewById(R.id.btn_ROM);
        btn_true = (RadioButton) findViewById(R.id.btn_true);
        btn_score = (Button) findViewById(R.id.btn_score);
        btn_score.setOnClickListener(this);


        // radio groups
        radio_1=(RadioGroup)findViewById(R.id.radio_1);
        radio_2=(RadioGroup)findViewById(R.id.radio_2);
        radio_3=(RadioGroup)findViewById(R.id.radio_3);
        radio_4=(RadioGroup)findViewById(R.id.radio_4);
        radio_5=(RadioGroup)findViewById(R.id.radio_5);
    }

    public void back(View view) {
        Intent click = new Intent(this, MainActivity.class);

        startActivity(click);

    }
    public void clear(View v) {
        TextView results =(TextView)findViewById(R.id.results);
        results.setText("");
        radio_1.clearCheck();
        radio_2.clearCheck();
        radio_3.clearCheck();
        radio_4.clearCheck();
        radio_5.clearCheck();

    }


    @Override
    public void onClick(View v) {
        int score = 0;
        if (btn_field.isChecked()) {
            score += 2;
        }
        if ((btn_animation.isChecked())) {
            score += 2;
        }
        if (btn_true.isChecked()) {
            score += 2;
        }
        if (btn_2007.isChecked()) {
            score += 2;
        }
        if (btn_ROM.isChecked()) {
            score+=2;

        }
        TextView results = (TextView) findViewById(R.id.results);
        results.setText("your tolat score is " + score);

    }
}













