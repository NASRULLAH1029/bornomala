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

        setTitle("ইংরেজী ছয় ঋতুর নাম");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

    public void b1(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_ritu1);
        mediaPlayer.start();
    }

    public void b2(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_ritu2);
        mediaPlayer.start();
    }

    public void b3(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_ritu3);
        mediaPlayer.start();
    }

    public void b4(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_ritu4);
        mediaPlayer.start();
    }

    public void b5(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_ritu5);
        mediaPlayer.start();
    }

    public void b6(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.e_ritu6);
        mediaPlayer.start();
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);

    }


}