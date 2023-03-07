package com.example.kiosk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EatWhere2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_where2);

        Button bt1 = (Button) findViewById(R.id.eatinside);
        Button bt2 = (Button) findViewById(R.id.eatout);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuintent1 = new Intent(getApplicationContext(), GeneralMenuActivity.class);
                startActivity(menuintent1);

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuintent1 = new Intent(getApplicationContext(), GeneralMenuActivity.class);
                startActivity(menuintent1);

            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}
