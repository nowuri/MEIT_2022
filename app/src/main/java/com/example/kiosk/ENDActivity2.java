package com.example.kiosk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class ENDActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent(ENDActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}