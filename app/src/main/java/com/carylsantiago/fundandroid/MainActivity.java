package com.carylsantiago.fundandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLog;
    EditText txtUsername, txtPassword;

    String x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instantiation
        btnLog = findViewById(R.id.btnLogIn);
        txtUsername = findViewById(R.id.username);
        txtPassword = findViewById(R.id.password);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                if(username.isEmpty()){
                    txtUsername.setError("Username is Empty");
                }

                if(password.isEmpty()){
                    txtPassword.setError("Password is Empty");
                }
                
                if(username.equals("CarylS") && password.equals("12345")){
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                    
                }else{
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
                finish();
            }

        });
    }
}