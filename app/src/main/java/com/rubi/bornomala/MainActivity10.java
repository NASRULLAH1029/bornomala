package com.rubi.bornomala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        setTitle("বাংলা ৬ ঋতু নাম");
    }

    public void b1(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_1);
        mediaPlayer.start();
    }

    public void b2(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_2);
        mediaPlayer.start();
    }

    public void b3(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_3);
        mediaPlayer.start();
    }

    public void b4(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_4);
        mediaPlayer.start();
    }

    public void b5(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b_ritu_5);
        mediaPlayer.start();
    }

    public void b6(View view) {

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