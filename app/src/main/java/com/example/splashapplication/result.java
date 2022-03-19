package com.example.splashapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    private Button button;private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        button=findViewById(R.id.button);
        result=findViewById(R.id.textView6);
        Bundle ex=getIntent().getExtras();
        String s1=ex.getString("username");
        String s2=ex.getString("password");
        result.setText("your username : "+s1+"\n\n"+"your password : "+s2);
    }
   public void back(View view){
       Intent intent=new Intent(this,MainActivity.class);
       startActivity(intent);
   }
}