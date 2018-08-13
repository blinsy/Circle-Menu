package com.example.user.bash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.WindowDecorActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowId;
import android.view.WindowInsets;

import java.util.ArrayList;
import java.util.List;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        RecyclerView recyclerView=findViewById(R.id.rv_list);
        List<item>mlist=new ArrayList<>();
        mlist.add(new item(R.drawable.ff,"colorfest",R.drawable.hy,4500));
        mlist.add(new item(R.drawable.inv,"colorfest",R.drawable.cute,700));
        mlist.add(new item(R.drawable.inva,"colorfest",R.drawable.ghg,5000));
        mlist.add(new item(R.drawable.invit,"colorfest",R.drawable.her,3500));
        mlist.add(new item(R.drawable.ivnd,"colorfest",R.drawable.herr,4700));
        mlist.add(new item(R.drawable.ingg,"colorfest",R.drawable.lol,6500));
        mlist.add(new item(R.drawable.dhh,"colorfest",R.drawable.lolo,3500));
        mlist.add(new item(R.drawable.ll,"colorfest",R.drawable.wow,4000));
        mlist.add(new item(R.drawable.inv,"colorfest",R.drawable.cute,500));
        mlist.add(new item(R.drawable.ool,"colorfest",R.drawable.herr,3500));
        mlist.add(new item(R.drawable.ff,"colorfest",R.drawable.cute,2500));
        mlist.add(new item(R.drawable.invit,"colorfest",R.drawable.lol,1500));
        Adapter adapter=new Adapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
