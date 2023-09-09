package com.rubi.bornomala;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class splash_screen extends AppCompatActivity {

    TextView text1;
    Animation Splash_bottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        // For Hide Action Bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        text1 = findViewById(R.id.textView);
        Splash_bottom = AnimationUtils.loadAnimation(this, R.anim.bottom_anim);
        text1.setAnimation(Splash_bottom);

        //For Splash Screen
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Code here
                Intent myIntent = new Intent(splash_screen.this, MainActivity.class);
                startActivity(myIntent);
                finish();
            }
        }, 3000);
        //==================================
    }
}
