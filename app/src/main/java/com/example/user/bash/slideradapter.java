package com.example.user.bash;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class slideradapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public slideradapter(Context context){
        this.context =context;
    }
    //Arrays
    public int[] slide_images= {
            R.drawable.partyicon,
            R.drawable.gettickrts,
            R.drawable.invit,
            R.drawable.post,
    };
    public String[] slide_headings={
            "Get  events here",
            "Book space or Buy Tickets",
            "Invite Friends",
            "Post your own "
    };

    public String[] slide_desa={
      "Find cool events of your like to attend in your city,country or world wide in the BASH APP,It makes it easy to find close and great event.",
      "Book space and Buy tickets from any event such as cinemas, festivals,and ceremonies of your interest",
      "Share your experience with friends and family and invite them to book or buy tickets for an event ",
      "Set your own event for family,locals public or to any person around the world"
    };



    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject( View view,  Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slidelayout,container,false);
        ImageView slideImageView =(ImageView) view.findViewById(R.id.slide_images);
        TextView slideTextview = (TextView) view.findViewById(R.id.slideheading);
        TextView slideDescription=(TextView) view.findViewById(R.id.slide_desa);

        slideImageView.setImageResource(slide_images[position]);
        slideTextview.setText(slide_headings[position]);
        slideDescription.setText(slide_desa[position]);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
