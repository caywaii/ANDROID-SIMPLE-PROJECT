package com.carylsantiago.fundandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculatorOnClick extends AppCompatActivity {


    EditText fNum, sNum, res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_on_click);

        fNum = findViewById(R.id.firstNum);
        sNum = findViewById(R.id.secondNum);
        res = findViewById(R.id.answer);
    }
    public void btnAddition(View view){
        int num1 = Integer.parseInt(fNum.getText().toString());
        int num2 = Integer.parseInt(sNum.getText().toString());
        int sum = num1 + num2;
        res.setText(String.valueOf(sum));
    }
    public void btnSubtract(View view){
        int num1 = Integer.parseInt(fNum.getText().toString());
        int num2 = Integer.parseInt(sNum.getText().toString());
        int difference = num1 - num2;
        res.setText(String.valueOf(difference));
    }
    public void btnTimes(View view){
        int num1 = Integer.parseInt(fNum.getText().toString());
        int num2 = Integer.parseInt(sNum.getText().toString());
        int product = num1 * num2;
        res.setText(String.valueOf(product));
    }
    public void btnDivide(View view){
        int num1 = Integer.parseInt(fNum.getText().toString());
        int num2 = Integer.parseInt(sNum.getText().toString());
        int quotient = num1 / num2;
        res.setText(String.valueOf(quotient));
    }

    public void btnGoHomeOnClick(View view){
       finish();
    }
}