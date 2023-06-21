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

public class MainActivity3 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("বাংলা স্বরবর্ন সমূহ");

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


    public void C1(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ba_1);
        mediaPlayer.start();

    }

    public void C2(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ba_2);
        mediaPlayer.start();
    }


    public void C3(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ba_3);
        mediaPlayer.start();
    }

    public void C4(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ba_4);
        mediaPlayer.start();
    }


    public void C5(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ba_5);
        mediaPlayer.start();
    }

    public void C6(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ba_6);
        mediaPlayer.start();
    }

    public void C7(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ba_7);
        mediaPlayer.start();
    }

    public void C8(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ba_8);
        mediaPlayer.start();
    }

    public void C9(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ba_9);
        mediaPlayer.start();
    }

    public void C10(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ba_10);
        mediaPlayer.start();
    }

    public void C11(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ba_11);
        mediaPlayer.start();
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}