package com.carylsantiago.fundandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Call extends AppCompatActivity {

    Button btnDial, home;
    EditText txtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        btnDial = findViewById(R.id.btnCall);
        txtNumber = findViewById(R.id.callNumber);
        home = findViewById(R.id.btnGoHome);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = txtNumber.getText().toString();
                Intent dial = new Intent(Intent.ACTION_DIAL);
                dial.setData((Uri.parse("tel: " + call)));

                startActivity(dial);

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