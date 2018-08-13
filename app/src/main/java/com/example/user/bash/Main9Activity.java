package com.example.user.bash;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class Main9Activity extends AppCompatActivity {

    String arrayName[]={"Home","Events","Share","Explore","Post"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.ic_add,R.drawable.ic_remove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.home_icon)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.icon_tickest)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.share_icon)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.explore_icon)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.icon_post)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                       // Toast.makeText(Main9Activity.this,"You selected"+arrayName[index],Toast.LENGTH_SHORT).show();
                        if (index == 0){
                            Intent home = new Intent(getApplicationContext(),Main5Activity.class);
                            startActivity(home);
                        }else if (index == 1){
                            Intent event =new Intent(getApplicationContext(),Main11Activity.class);
                            startActivity(event);
                        }else if (index == 2){
                           Intent share=new Intent(getApplicationContext(),Main12Activity.class);
                           startActivity(share);
                        }else if (index == 3){
                            Intent search=new Intent(getApplicationContext(),Main13Activity.class);
                            startActivity(search);
                        }else if (index == 4){
                            Intent post=new Intent(getApplicationContext(),Main14Activity.class);
                            startActivity(post);
                        }

                    }
                });
    }
}
