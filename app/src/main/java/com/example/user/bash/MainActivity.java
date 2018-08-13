package com.example.user.bash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread bb = new Thread() {
            //execute thread

            @Override
            public void run() {
                try {
                    //the progress bar will load for 5 seconds
                    sleep(3 * 1000);
                    //intents allow you to perform an activity
                    Intent jj = new Intent(getApplicationContext(),Main2Activity .class);
                    startActivity(jj);
                    finish();
                } catch (Exception e) {
                }
            }
        };
        bb.start();
    }
}
