package com.rubi.bornomala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("ইংরেজী বর্ন সমূহ");
    }

    public void C1(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_1);
        mediaPlayer.start();
    }

    public void C2(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_2);
        mediaPlayer.start();
    }

    public void C3(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_3);
        mediaPlayer.start();
    }

    public void C4(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_4);
        mediaPlayer.start();
    }

    public void C5(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_5);
        mediaPlayer.start();
    }

    public void C6(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_6);
        mediaPlayer.start();
    }

    public void C7(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_7);
        mediaPlayer.start();
    }

    public void C8(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_8);
        mediaPlayer.start();
    }

    public void C9(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_9);
        mediaPlayer.start();
    }

    public void C10(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_10);
        mediaPlayer.start();
    }

    public void C11(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_11);
        mediaPlayer.start();
    }

    public void C12(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_12);
        mediaPlayer.start();
    }

    public void C13(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_13);
        mediaPlayer.start();
    }

    public void C14(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_14);
        mediaPlayer.start();
    }

    public void C15(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_15);
        mediaPlayer.start();
    }

    public void C16(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_16);
        mediaPlayer.start();
    }

    public void C17(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_17);
        mediaPlayer.start();
    }

    public void C18(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_18);
        mediaPlayer.start();
    }

    public void C19(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_19);
        mediaPlayer.start();
    }

    public void C20(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_20);
        mediaPlayer.start();
    }

    public void C21(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_21);
        mediaPlayer.start();
    }

    public void C22(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_22);
        mediaPlayer.start();
    }

    public void C23(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_23);
        mediaPlayer.start();
    }

    public void C24(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_24);
        mediaPlayer.start();
    }

    public void C25(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_25);
        mediaPlayer.start();
    }

    public void C26(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.en_26);
        mediaPlayer.start();
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }


}