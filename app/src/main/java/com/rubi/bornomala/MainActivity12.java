package com.rubi.bornomala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void b1(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_day1);
        mediaPlayer.start();
    }

    public void b2(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_day2);
        mediaPlayer.start();
    }

    public void b3(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_day3);
        mediaPlayer.start();
    }

    public void b4(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_day4);
        mediaPlayer.start();
    }

    public void b5(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_day5);
        mediaPlayer.start();
    }

    public void b6(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_day6);
        mediaPlayer.start();
    }

    public void b7(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_day7);
        mediaPlayer.start();
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);

    }


}