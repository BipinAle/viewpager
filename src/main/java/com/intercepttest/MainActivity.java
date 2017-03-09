package com.intercepttest;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    viewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager= (ViewPager) findViewById(R.id.viewPager);
        tabLayout= (TabLayout) findViewById(R.id.tabLayout);
        adapter=new viewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new fragA(),"A");
        adapter.addFragment(new fragB(),"B");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
