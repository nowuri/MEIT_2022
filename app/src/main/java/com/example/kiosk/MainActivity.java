package com.example.kiosk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_pager);

        Fragment[] arrFragment = new Fragment[4];
        arrFragment[0] = new MenuBurger();
        arrFragment[1] = new MenuDessert();
        arrFragment[2] = new MenuMuffin();
        arrFragment[3] = new MenuSide();

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(),arrFragment);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
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