package com.carylsantiago.fundandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sms extends AppCompatActivity {
    EditText number, text;
    TextView countText;
    Button btnHome, btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        btnHome = findViewById(R.id.btnBack);
        btnSend = findViewById(R.id.btnSend);

        number = findViewById(R.id.phoneNum);
        text = findViewById(R.id.message);

        countText = findViewById(R.id.counter);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              finish();
            }
        });

        text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                countText.setText(text.getText().length() + "/150");
                if(text.getText().length() == 150){
                    countText.setTextColor(Color.RED);
                }else{
                    countText.setTextColor(Color.GRAY);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnSend.setOnClickListener(v->sendMess());
    }

    public void sendMess(){
        String phone = number.getText().toString();
        String message = text.getText().toString();

        Intent sms = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:")); //Path
       //sms.setType("vnd.android-dir/mms-sms"); //Path or Actual Tab of Messages
        sms.putExtra("address", phone);
        sms.putExtra("sms_body", message);
        startActivity(sms);

    }
}