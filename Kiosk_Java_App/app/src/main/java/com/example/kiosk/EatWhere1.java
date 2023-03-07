package com.example.kiosk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EatWhere1 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_where1);

        Button bt1 = (Button) findViewById(R.id.eatinside);
        Button bt2 = (Button) findViewById(R.id.eatout);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuintent = new Intent(getApplicationContext(), EasyMenuActivity.class);
                startActivity(menuintent);

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuintent = new Intent(getApplicationContext(), EasyMenuActivity.class);
                startActivity(menuintent);

            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}