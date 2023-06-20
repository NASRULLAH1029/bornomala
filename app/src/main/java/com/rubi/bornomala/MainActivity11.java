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

public class MainActivity11 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main11);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("বাংলা ১২ মাসের নাম");


        facebookAds();

    }

    private void facebookAds() {
        AudienceNetworkAds.initialize(this);


        adView = new AdView(this, "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();


        interstitialAd = new InterstitialAd(this, "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID");
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


    public void b1(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_1);
        mediaPlayer.start();
    }

    public void b2(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_2);
        mediaPlayer.start();
    }

    public void b3(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_3);
        mediaPlayer.start();
    }

    public void b4(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_4);
        mediaPlayer.start();
    }

    public void b5(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_5);
        mediaPlayer.start();
    }

    public void b6(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_6);
        mediaPlayer.start();
    }

    public void b7(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_7);
        mediaPlayer.start();
    }

    public void b8(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_8);
        mediaPlayer.start();
    }

    public void b9(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_9);
        mediaPlayer.start();
    }

    public void b10(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_10);
        mediaPlayer.start();
    }

    public void b11(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_11);
        mediaPlayer.start();
    }

    public void b12(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_m_12);
        mediaPlayer.start();
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);

    }


}