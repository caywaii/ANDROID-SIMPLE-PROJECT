package com.carylsantiago.fundandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    EditText fNum, sNum, res;
    Button add, sub, mul, div, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        fNum = findViewById(R.id.firstNum);
        sNum = findViewById(R.id.secondNum);
        res = findViewById(R.id.answer);

        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnMinus);
        mul = findViewById(R.id.btnMultiply);
        div = findViewById(R.id.btnDiv);
        home = findViewById(R.id.btnGoBackCalculatorListener);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(fNum.getText().toString());
                int num2 = Integer.parseInt(sNum.getText().toString());
                int sum = num1 + num2;
                res.setText(String.valueOf(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(fNum.getText().toString());
                int num2 = Integer.parseInt(sNum.getText().toString());
                int difference = num1 - num2;
                res.setText(String.valueOf(difference));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(fNum.getText().toString());
                int num2 = Integer.parseInt(sNum.getText().toString());
                int product = num1 * num2;
                res.setText(String.valueOf(product));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(fNum.getText().toString());
                int num2 = Integer.parseInt(sNum.getText().toString());
                int quotient = num1 / num2;
                res.setText(String.valueOf(quotient));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}