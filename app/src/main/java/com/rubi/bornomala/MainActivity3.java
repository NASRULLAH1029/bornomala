package com.rubi.bornomala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("বাংলা স্বরবর্ন সমূহ");

    }


    public void C1(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nun);
        mediaPlayer.start();

    }

    public void C2(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nun);
        mediaPlayer.start();
    }


    public void C3(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nun);
        mediaPlayer.start();
    }

    public void C4(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nun);
        mediaPlayer.start();
    }


    public void C5(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nun);
        mediaPlayer.start();
    }

    public void C6(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nun);
        mediaPlayer.start();
    }

    public void C7(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nun);
        mediaPlayer.start();
    }

    public void C8(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nun);
        mediaPlayer.start();
    }

    public void C9(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nun);
        mediaPlayer.start();
    }

    public void C10(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nun);
        mediaPlayer.start();
    }

    public void C11(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nun);
        mediaPlayer.start();
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}