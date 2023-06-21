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

public class MainActivity4 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("বাংলা ব্যঞ্জনবর্ণ সমূহ");
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
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_1);
        mediaPlayer.start();
    }

    public void C2(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_2);
        mediaPlayer.start();
    }

    public void C3(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_3);
        mediaPlayer.start();
    }

    public void C4(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_4);
        mediaPlayer.start();
    }

    public void C5(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_5);
        mediaPlayer.start();
    }

    public void C6(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_6);
        mediaPlayer.start();
    }

    public void C7(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_7);
        mediaPlayer.start();
    }

    public void C8(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_8);
        mediaPlayer.start();
    }

    public void C9(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_9);
        mediaPlayer.start();
    }

    public void C10(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_10);
        mediaPlayer.start();
    }

    public void C11(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_11);
        mediaPlayer.start();
    }

    public void C12(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_12);
        mediaPlayer.start();
    }

    public void C13(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_13);
        mediaPlayer.start();
    }

    public void C14(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_14);
        mediaPlayer.start();
    }

    public void C15(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_15);
        mediaPlayer.start();
    }

    public void C16(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_16);
        mediaPlayer.start();
    }

    public void C17(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_17);
        mediaPlayer.start();
    }

    public void C18(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_18);
        mediaPlayer.start();
    }

    public void C19(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_19);
        mediaPlayer.start();
    }

    public void C20(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_20);
        mediaPlayer.start();
    }

    public void C21(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_21);
        mediaPlayer.start();
    }

    public void C22(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_22);
        mediaPlayer.start();
    }

    public void C23(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_23);
        mediaPlayer.start();
    }

    public void C24(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_24);
        mediaPlayer.start();
    }

    public void C25(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_25);
        mediaPlayer.start();
    }

    public void C26(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_26);
        mediaPlayer.start();
    }

    public void C27(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_27);
        mediaPlayer.start();
    }

    public void C28(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_28);
        mediaPlayer.start();
    }

    public void C29(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_29);
        mediaPlayer.start();
    }

    public void C30(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_30);
        mediaPlayer.start();
    }

    public void C31(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_31);
        mediaPlayer.start();
    }

    public void C32(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_32);
        mediaPlayer.start();
    }

    public void C33(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_33);
        mediaPlayer.start();
    }

    public void C34(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_34);
        mediaPlayer.start();
    }

    public void C35(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_35);
        mediaPlayer.start();
    }

    public void C36(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_36);
        mediaPlayer.start();
    }

    public void C37(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_37);
        mediaPlayer.start();
    }

    public void C38(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_38);
        mediaPlayer.start();
    }

    public void C39(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bb_39);
        mediaPlayer.start();

    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }


}