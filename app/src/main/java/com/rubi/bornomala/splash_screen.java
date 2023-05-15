package com.rubi.bornomala;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {


                try {
                    sleep(4000);

                    Intent intent =new Intent(splash_screen.this,MainActivity.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            }
        });
        thread.start();

    }
}
