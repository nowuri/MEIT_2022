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
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    public static Context main_mContext;

    public ArrayList<String> MenuList = new ArrayList<String>();
    public ArrayList<Integer> PriceList = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_mContext = this;

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_pager);

        Fragment[] arrFragment = new Fragment[4];
        arrFragment[0] = new MenuBurger(main_mContext);
        arrFragment[1] = new MenuDessert(main_mContext);
        arrFragment[2] = new MenuMuffin(main_mContext);
        arrFragment[3] = new MenuSide(main_mContext);

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(),arrFragment);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void NextPage(){
        Intent intent = new Intent(getApplicationContext(), CartActivity2.class);
        startActivity(intent);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        private Fragment[] arrFragment;

        public MyPagerAdapter(FragmentManager fm, Fragment[] arrFragment) {
            super(fm);
            this.arrFragment = arrFragment;
        }


        @Override
        public Fragment getItem(int position) {
            return arrFragment[position];
        }

        @Override
        public int getCount() {
            return arrFragment.length;
        }

        @Override
        public CharSequence getPageTitle(int position){

            switch (position) {
                case 0:
                    return "햄버거";
                case 1:
                    return "디저트";
                case 2:
                    return "맥머핀";
                case 3:
                    return "사이드";
                default:
                    return "";
            }
        }



    }


}