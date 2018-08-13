package com.example.user.bash;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {
    private EditText mName,mEmail,mAge;
    ProgressDialog progress;
    public Button sign;
    public void tick(){
        sign=(Button)findViewById(R.id.button);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(buy);

            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tick();
        mName=findViewById(R.id.editText);
        mEmail=findViewById(R.id.editText3);
        mAge=findViewById(R.id.editText2);


    }
    public void save(View view) {
        String name = mName.getText().toString();
        String email = mEmail.getText().toString();
        String age = mAge.getText().toString();
        progress = new ProgressDialog(this);
        progress.setMessage("saving...");
        if (name.isEmpty()||email.isEmpty()||age.isEmpty()){
            Toast.makeText(this,"FILL ALL INPUTS",Toast.LENGTH_SHORT);
            return;
        }
        long time=System.currentTimeMillis();
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("User/"+time);
        User members=new User(name,email,age);
        progress.show();
        ref.setValue(members).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                progress.dismiss();
                if (task.isSuccessful()){
                    mName.setText("");
                    mEmail.setText("");
                    mAge.setText("");
                    Toast.makeText(Main2Activity.this, "Success", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Main2Activity.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    //fetch code here
    //put the view code here
    public void fetch(View view){
        Intent fetch =new Intent(getApplicationContext(),usersactivity.class);
        startActivity(fetch);
    }

}
