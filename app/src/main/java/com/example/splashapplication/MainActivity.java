package com.example.splashapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
private Button button;
private EditText name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
button=findViewById(R.id.button);
name=findViewById(R.id.name);
password=findViewById(R.id.password);

    }
    public void envoyer(View view){
        Intent intent=new Intent(this,result.class);
        intent.putExtra("username",name.getText().toString());
        intent.putExtra("password",password.getText().toString());
        startActivity(intent);

    }
}