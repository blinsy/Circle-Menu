package com.example.user.bash;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private ViewPager mSlideviewpager;
    private LinearLayout mDotlayout;

    private TextView[] mDots;

    private slideradapter slideradapter;
    private Button Nextbtn;
    private Button mbackbtn;
    private int mCurrentpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mSlideviewpager=(ViewPager)findViewById(R.id.slideviewpager);
        mDotlayout=(LinearLayout)findViewById(R.id.dotlayout);
        Nextbtn=(Button)findViewById(R.id.nextbtn);
        mbackbtn=(Button)findViewById(R.id.prevbtn);

        slideradapter=new slideradapter(this);
        mSlideviewpager.setAdapter(slideradapter);
        addDotsIndicator(0);
        mSlideviewpager.addOnPageChangeListener(viewListener);
//        OnClicklistener
        Nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Nextbtn.getText().toString().toLowerCase().contains("finish")){
                    Intent intent = new Intent(Main3Activity.this,Main9Activity.class);
                    startActivity(intent);
                }
                mSlideviewpager.setCurrentItem(mCurrentpage+1);

            }
        });
        mbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSlideviewpager.setCurrentItem(mCurrentpage-1);
            }
        });
    }
    public void addDotsIndicator(int position){
        mDots=new TextView[4];
        mDotlayout.removeAllViews();
        for (int i = 0;i < mDots.length;i++){
            mDots[i]=new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.TransparentWhite));

            mDotlayout.addView(mDots[i]);
        }
        if (mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.colorWhite));

        }
    }
    ViewPager.OnPageChangeListener viewListener =new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            mCurrentpage = i;
            if (i==0){
                Nextbtn.setEnabled(true);
                mbackbtn.setEnabled(false);
                mbackbtn.setVisibility(View.INVISIBLE);
                Nextbtn.setText("Next");
                mbackbtn.setText("");

            }else if (i==mDots.length-1){
                Nextbtn.setEnabled(true);
                mbackbtn.setEnabled(true);
                mbackbtn.setVisibility(View.VISIBLE);

                Nextbtn.setText("FINISH");
                mbackbtn.setText("Back");
            }else {
                Nextbtn.setEnabled(true);
                mbackbtn.setEnabled(true);
                mbackbtn.setVisibility(View.VISIBLE);

                Nextbtn.setText("Next");
                mbackbtn.setText("Back");
            }

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
