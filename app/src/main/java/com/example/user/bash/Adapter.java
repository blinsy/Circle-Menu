package com.example.user.bash;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder>{

    Context mContext;
    List<item>mData;


    public Adapter(Context mContext, List<item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public myViewHolder onCreateViewHolder( ViewGroup parent, int i) {
        LayoutInflater inflater =LayoutInflater.from(mContext);
        View view=inflater.inflate(R.layout.card_item,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder( myViewHolder holder, int position) {

        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.profile_photo.setImageResource(mData.get(position).getProfilephoto());
        holder.tv_title.setText(mData.get(position).getProfileName());
        holder.tv_nbFollowers.setText(mData.get(position).getNbFollowers()+"Followers");

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public  class myViewHolder extends RecyclerView.ViewHolder{

        ImageView profile_photo,background_img;
        TextView tv_title,tv_nbFollowers;


        public myViewHolder( View itemView) {
            super(itemView);
            profile_photo=itemView.findViewById(R.id.profile_img);
            background_img=itemView.findViewById(R.id.card_background);
            tv_title=itemView.findViewById(R.id.card_title);
            tv_nbFollowers=itemView.findViewById(R.id.card_nb_followers);
        }
    }
}
