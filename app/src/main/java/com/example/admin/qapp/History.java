package com.example.admin.qapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class History extends AppCompatActivity implements View.OnClickListener {
    private RadioGroup radioGroup;
    private RadioButton btn_nelson_mandela;
    private  RadioButton btn_julius_malema;
    private RadioButton btn_protea;
    private RadioButton btn_11;
    private RadioButton btn_simphiwe_tshabalala;
    private Button btn_score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn_11=(RadioButton) findViewById(R.id.btn_11);
        btn_julius_malema=(RadioButton)findViewById(R.id.btn_julius_malema);
        btn_nelson_mandela=(RadioButton)findViewById(R.id.btn_nelson_mandela);
        btn_protea=(RadioButton)findViewById(R.id.btn_protea);
        btn_simphiwe_tshabalala=(RadioButton)findViewById(R.id.btn_simphiwe_tshabalala);
        btn_score=(Button)findViewById(R.id.btn_score);
        btn_score.setOnClickListener(this);

    }
    public void back(View view) {
        Intent click = new Intent(this, MainActivity.class);

        startActivity(click);
    }

    @Override
    public void onClick(View v) {
        int score=0;

        if (btn_nelson_mandela.isChecked()){
            score+=2;
        }
        if (btn_protea.isChecked()){
            score +=2;
        }
        if (btn_simphiwe_tshabalala.isChecked()){
            score+=2;
        }
        if (btn_11.isChecked()){
            score+=2;
        }
        if (btn_julius_malema.isChecked()){
            score+=2;
        }
        TextView results =(TextView)findViewById(R.id.history_results);
        results.setText("your total score is...." + score);
    }

}

