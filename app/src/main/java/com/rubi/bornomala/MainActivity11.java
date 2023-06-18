package com.rubi.bornomala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("বাংলা ১২ মাসের নাম");


    }

    public void b1(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public void b2(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public void b3(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public void b4(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public void b5(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public void b6(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public void b7(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public void b8(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public void b9(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public void b10(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public void b11(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public void b12(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_6);
        mediaPlayer.start();
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);

    }


}