package com.rubi.bornomala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("ইংরেজী ১২ মাসের নাম");
    }

    public void b1(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m1);
        mediaPlayer.start();
    }

    public void b2(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m2);
        mediaPlayer.start();
    }

    public void b3(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m3);
        mediaPlayer.start();
    }

    public void b4(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m4);
        mediaPlayer.start();
    }

    public void b5(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m5);
        mediaPlayer.start();
    }

    public void b6(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m6);
        mediaPlayer.start();
    }

    public void b7(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m7);
        mediaPlayer.start();
    }

    public void b8(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m8);
        mediaPlayer.start();
    }

    public void b9(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m9);
        mediaPlayer.start();
    }

    public void b10(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m10);
        mediaPlayer.start();
    }

    public void b11(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m11);
        mediaPlayer.start();
    }

    public void b12(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_m12);
        mediaPlayer.start();
    }


    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);

    }


}