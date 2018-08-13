package com.example.user.bash;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main5Activity extends AppCompatActivity {


    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        tabLayout=(TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout=(AppBarLayout)findViewById(R.id.appbarid);
        viewPager= (ViewPager) findViewById(R.id.viewpager_id);
        viewpageradapter adapter =new viewpageradapter(getSupportFragmentManager());
        adapter.AddFragment(new Fragmentabout(),"About");
        adapter.AddFragment(new Fragmentdetailes(),"Detailes");
        adapter.AddFragment(new Fragmentbuybook(),"Buy/book tickets");
        //adapter set up
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
