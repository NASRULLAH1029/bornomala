package com.rubi.bornomala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public class MainActivity2 extends AppCompatActivity {
    private AdView adView;
    private InterstitialAd interstitialAd;
    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onDestroy() {
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("আরবি হরফ সমূহ");


        facebookAds();

    }

    private void facebookAds() {
        AudienceNetworkAds.initialize(this);


        adView = new AdView(this, "3542537152693641_3542537679360255", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();


        interstitialAd = new InterstitialAd(this, "3542537152693641_3542537909360232");
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                Log.e(TAG, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                Log.e(TAG, "Interstitial ad dismissed.");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.d(TAG, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.d(TAG, "Interstitial ad impression logged!");
            }
        };

        interstitialAd.loadAd(
                interstitialAd.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener)
                        .build());


    }


    public void callClick(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_1);
        mediaPlayer.start();
    }

    public void call(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_2);
        mediaPlayer.start();
    }

    public void Click(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_3);
        mediaPlayer.start();
    }


    public void C_1(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_6);
        mediaPlayer.start();

    }


    public void C_2(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_5);
        mediaPlayer.start();

    }

    public void C_3(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_4);
        mediaPlayer.start();
    }

    public void C_4(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_9);
        mediaPlayer.start();
    }

    public void C_5(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_8);
        mediaPlayer.start();
    }

    public void C_6(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_7);
        mediaPlayer.start();
    }

    public void C_7(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_12);
        mediaPlayer.start();
    }

    public void C_8(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_11);
        mediaPlayer.start();
    }

    public void C_9(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_10);
        mediaPlayer.start();
    }

    public void C_10(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_15);
        mediaPlayer.start();
    }

    public void C_11(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_14);
        mediaPlayer.start();
    }

    public void C_12(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_13);
        mediaPlayer.start();
    }

    public void C_13(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_18);
        mediaPlayer.start();
    }

    public void C_14(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_17);
        mediaPlayer.start();
    }

    public void C_15(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_16);
        mediaPlayer.start();
    }

    public void C_16(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_21);
        mediaPlayer.start();
    }

    public void C_17(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_20);
        mediaPlayer.start();
    }

    public void C_18(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_19);
        mediaPlayer.start();
    }

    public void C_19(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_24);
        mediaPlayer.start();
    }

    public void C_20(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_23);
        mediaPlayer.start();
    }


    public void C_21(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_22);
        mediaPlayer.start();
    }

    public void C_22(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_27);
        mediaPlayer.start();
    }

    public void C_23(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_26);
        mediaPlayer.start();
    }


    public void C_24(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_25);
        mediaPlayer.start();
    }

    public void C_25(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_29);
        mediaPlayer.start();
    }


    public void C_26(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ar_28);
        mediaPlayer.start();
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }


}