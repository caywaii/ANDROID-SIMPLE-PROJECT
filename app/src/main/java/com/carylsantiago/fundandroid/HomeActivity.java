package com.carylsantiago.fundandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    MenuItem calcu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.funda_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){

        switch(item.getItemId()){
            case R.id.menuRegistration:
                Toast.makeText(this, "This is Registration", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, Registration.class));
                return true;
            case R.id.menuCalculator:
                Toast.makeText(this, "This is Calculator", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menuCamera:
                Toast.makeText(this, "This is Camera", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, Camera.class));
                return true;

            case R.id.calListener:
                Toast.makeText(this, "This is Calculator: Listener", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, Calculator.class));
                return true;

            case R.id.calOnClick:
                Toast.makeText(this, "This is Calculator: On Click", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, CalculatorOnClick.class));
                return true;

            case R.id.menuCall:
                Toast.makeText(this, "This is Call", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, Call.class));
                return true;
            case R.id.menuSMS:
                Toast.makeText(this, "This is SMS", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, Sms.class));
                return true;
            case R.id.menuImages:
                Toast.makeText(this, "This are Images", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, Image.class));
                return true;
            case R.id.menUrl:
                Toast.makeText(this, "This is URL", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, Url.class));
                return true;
            case R.id.menuAbout:
                Toast.makeText(this, "This is About", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, About.class));
                return true;
            case R.id.menulogOut:
               startActivity(new Intent(HomeActivity.this, MainActivity.class));
                return true;

            case R.id.menuExit:
                Toast.makeText(this, "This is Exit", Toast.LENGTH_SHORT).show();
                finishAffinity();
                System.exit(0);
                return true;
            case R.id.menuOrganizer:
                startActivity(new Intent(HomeActivity.this, ToDoList.class));
                return true;


        }
        return super.onOptionsItemSelected(item);
    }

}