package com.example.user.bash;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter  extends BaseAdapter{
    Context mContext;
    ArrayList<User> data;//modify here

    public CustomAdapter(Context mContext, ArrayList<User> data) {
        this.mContext = mContext;
        this.data = data;
}
    @Override
    public int getCount() {
        return data.size();// # of items in your arraylist
    }
    @Override
    public Object getItem(int position) {
        return data.get(position);// get the actual item
    }
    @Override
    public long getItemId(int id) {
        return id;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(R.layout.itemlayout, parent,false);//modify here
            viewHolder = new ViewHolder();
            //modify this block of code
            viewHolder.tvnames = (TextView) convertView.findViewById(R.id.tvname);
            viewHolder.tvemail = (TextView) convertView.findViewById(R.id.tvmail);
            viewHolder.tvage = (TextView) convertView.findViewById(R.id.tvage);
            //viewHolder.imageView=(ImageView) convertView.findViewById(R.id.imageView);
            //Up to here
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //MODIFY THIS BLOCK OF CODE
        User person = data.get(position);//modify here
        viewHolder.tvnames.setText(person.getNames());//modify here
        viewHolder.tvemail.setText(person.getEmail());//modify here
        viewHolder.tvage.setText(person.getAge());//modify here
        //viewHolder.imageView.setImageResource(person.getImage());
        return convertView;

    }
    static class ViewHolder {
        TextView tvnames;
        TextView tvemail;
        TextView tvage;//These don't have to be same names as the Id's
        //MODIFY THIS BLOCK OF CODE
        //TextView textViewTitle;
        //ImageView imageView;
    }

}
