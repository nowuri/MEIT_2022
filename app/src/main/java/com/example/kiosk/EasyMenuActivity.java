package com.example.kiosk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class EasyMenuActivity extends AppCompatActivity {

    public static Context main_mContext;

    public ArrayList<String> MenuList = new ArrayList<String>();
    public ArrayList<Integer> PriceList = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_menu);
        main_mContext = this;

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_pager);

        Fragment[] arrFragment = new Fragment[4];
        arrFragment[0] = new EasyMenuBurger();
        arrFragment[1] = new EasyMenuDessert();
        arrFragment[2] = new EasyMenuMuffin();
        arrFragment[3] = new EasyMenuSide();

        EasyMenuActivity.MyPagerAdapter adapter = new EasyMenuActivity.MyPagerAdapter(getSupportFragmentManager(),arrFragment);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //장바구니 버튼 누르면 CartActivity2로 이동
        Button mBtn = (Button) findViewById(R.id.cartButton);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).NextPage();
            }
        });
    }

    public void NextPage(){
        Intent intent = new Intent(getApplicationContext(), CartActivity3.class);
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