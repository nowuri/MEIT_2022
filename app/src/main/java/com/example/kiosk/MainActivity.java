package com.example.kiosk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button generalmenu = (Button)findViewById(R.id.generalmenu);
        Button easymenu = (Button)findViewById(R.id.easymenu);

        generalmenu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent gintent = new Intent(getApplicationContext(),GeneralMenuActivity.class);
                startActivity(gintent);
            }
        });

        easymenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent eintent = new Intent(getApplicationContext(),EasyMenuActivity.class);
                startActivity(eintent);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}