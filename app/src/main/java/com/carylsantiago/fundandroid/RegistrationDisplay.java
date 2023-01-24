package com.carylsantiago.fundandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationDisplay extends AppCompatActivity {

    EditText name, add, work;
    Button backRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_display);

        name = findViewById(R.id.displayName);
        add = findViewById(R.id.displayAdd);
        work = findViewById(R.id.displayOcc);

       backRegister = findViewById(R.id.btnBackRegister);

       String pangalan = getIntent().getStringExtra("keyname");
       String trabaho = getIntent().getStringExtra("keywork");
       String lugar = getIntent().getStringExtra("keyadd");

       name.setText(pangalan);
       work.setText(trabaho);
       add.setText(lugar);

       backRegister.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               finish();
           }

       });
    }
}