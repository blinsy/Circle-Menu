package com.example.user.bash;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.WindowDecorActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowAnimationFrameStats;
import android.view.WindowContentFrameStats;
import android.view.WindowId;
import android.view.WindowInsets;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


        RecyclerView recyclerView=findViewById(R.id.rv_list);
        List<item>mlist=new ArrayList<>();
        mlist.add(new item(R.drawable.ingg,"event",R.drawable.lol,2500));
        mlist.add(new item(R.drawable.ingg,"event",R.drawable.lol,2500));
        mlist.add(new item(R.drawable.ingg,"event",R.drawable.lol,2500));
        mlist.add(new item(R.drawable.ingg,"event",R.drawable.lol,2500));
        mlist.add(new item(R.drawable.ingg,"event",R.drawable.lol,2500));
        mlist.add(new item(R.drawable.ingg,"event",R.drawable.lol,2500));
        mlist.add(new item(R.drawable.ingg,"event",R.drawable.lol,2500));
        mlist.add(new item(R.drawable.ingg,"event",R.drawable.lol,2500));
        mlist.add(new item(R.drawable.ingg,"event",R.drawable.lol,2500));
        mlist.add(new item(R.drawable.ingg,"event",R.drawable.lol,2500));
        mlist.add(new item(R.drawable.ingg,"event",R.drawable.lol,2500));
        Adapter adapter=new Adapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
