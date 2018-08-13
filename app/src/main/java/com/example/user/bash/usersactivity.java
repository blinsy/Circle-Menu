package com.example.user.bash;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class usersactivity extends AppCompatActivity {
    ListView list;
    CustomAdapter adapter;
    ArrayList<User> users;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usersactivity);
        dialog=new ProgressDialog(this);
        dialog.setMessage("loading...");
        list=findViewById(R.id.userslist);
        users=new ArrayList<>();
        adapter=new CustomAdapter(this,users);
        list.setAdapter((ListAdapter) adapter);
        DatabaseReference reference= FirebaseDatabase.getInstance().getReference().child("User");
        dialog.show();
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                users.clear();
                for (DataSnapshot snap: dataSnapshot.getChildren()){
                    User user =snap.getValue(User.class);
                    users.add(user);
                }
                adapter.notifyDataSetChanged();
                dialog.dismiss();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(usersactivity.this, "sorry. It failed", Toast.LENGTH_SHORT).show();

            }
        });
    }
    }

