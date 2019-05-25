package com.puseletsomaraba.pjportfolio;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.puseletsomaraba.pjportfolio.controller.DavPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager);
        viewPager.setAdapter(new DavPagerAdapter(getSupportFragmentManager()));
        TabLayout tabs=findViewById(R.id.tabLayoutId);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabTextColors(Color.GRAY,Color.parseColor("#1d82c1"));


    }
}
