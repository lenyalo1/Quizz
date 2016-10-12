package com.example.admin.qapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Biology extends AppCompatActivity implements View.OnClickListener {
    private RadioGroup radio1,radio2,radio3,radio4,radio5;
    private RadioButton btn_keratin;
    private RadioButton btn_skin;
    private RadioButton btn_true;
    private RadioButton btn_double_h;
    private RadioButton btn_melanin;
    private Button btn_score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn_double_h=(RadioButton)findViewById(R.id.btn_double_h);
        btn_keratin=(RadioButton)findViewById(R.id.btn_keratin);
        btn_melanin=(RadioButton)findViewById(R.id.btn_melanin);
        btn_skin=(RadioButton)findViewById(R.id.btn_skin);
        btn_true=(RadioButton)findViewById(R.id.btn_true);
        btn_score=(Button)findViewById(R.id.btn_biology);
        btn_score.setOnClickListener(this);
        radio1=(RadioGroup)findViewById(R.id.radio1);
        radio2=(RadioGroup)findViewById(R.id.radio2);
        radio3=(RadioGroup)findViewById(R.id.radio3);
        radio4=(RadioGroup)findViewById(R.id.radio4);
        radio5=(RadioGroup)findViewById(R.id.radio5);
    }
    public void back(View view) {
        Intent click = new Intent(this, MainActivity.class);

        startActivity(click);

    }
    public void clear(View v) {
        TextView results =(TextView)findViewById(R.id.score);
        results.setText("");
        radio1.clearCheck();
        radio2.clearCheck();
        radio3.clearCheck();
        radio4.clearCheck();
        radio5.clearCheck();

    }

    @Override
    public void onClick(View v) {

        int score = 0;
        if (btn_keratin.isChecked()) {
            score += 1;

        }
        if (btn_melanin.isChecked()) {
            score += 2;
        }
        if (btn_double_h.isChecked()) {
            score += 2;
        }
        if (btn_true.isChecked()) {
            score += 2;
        }
        if (btn_skin.isChecked()) {
            score += 2;
        }
        TextView results =(TextView)findViewById(R.id.score);
        results.setText("your total score is...." + score);
    }
    }

