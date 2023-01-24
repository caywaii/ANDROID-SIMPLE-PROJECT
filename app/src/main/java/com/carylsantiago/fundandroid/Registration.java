package com.carylsantiago.fundandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    EditText name, work, add;
    Button register, home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = findViewById(R.id.fullName);
        work = findViewById(R.id.occupation);
        add = findViewById(R.id.address);

        register = findViewById(R.id.btnRegister);
        home = findViewById(R.id.btnGoHomeRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname = name.getText().toString();
                String trabaho = work.getText().toString();
                String lugar = add.getText().toString();

                Intent i = new Intent(Registration.this, RegistrationDisplay.class);
                i.putExtra("keyname", fullname);
                i.putExtra("keywork", trabaho);
                i.putExtra("keyadd", lugar);
                Registration.this.startActivity(i);

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