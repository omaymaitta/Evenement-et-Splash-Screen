package com.example.splashapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class SplashActivity extends AppCompatActivity {
Animation haut,bas;
    TextView t1,t2;
    private static int SPLASH_TIME_OUT = 6000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
haut= AnimationUtils.loadAnimation(this, R.anim.animation);
bas= AnimationUtils.loadAnimation(this, R.anim.animation2);
t1=findViewById(R.id.textView);
t2=findViewById(R.id.textView2);
t1.setAnimation(bas);
t2.setAnimation(haut);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(SplashActivity.this,
                        MainActivity.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}