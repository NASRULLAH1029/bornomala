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

public class MainActivity7 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main7);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("ইংরেজী সংখ্যা সমূহ");
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


    public void C1(View view) {

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num1);
        mediaPlayer.start();
    }

    public void C2(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num2);
        mediaPlayer.start();
    }

    public void C3(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num3);
        mediaPlayer.start();
    }

    public void C4(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num4);
        mediaPlayer.start();
    }

    public void C5(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num5);
        mediaPlayer.start();
    }

    public void C6(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num6);
        mediaPlayer.start();
    }

    public void C7(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num7);
        mediaPlayer.start();
    }

    public void C8(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num8);
        mediaPlayer.start();
    }

    public void C9(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num9);
        mediaPlayer.start();
    }

    public void C10(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_10);
        mediaPlayer.start();
    }

    public void C11(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num11);
        mediaPlayer.start();
    }

    public void C12(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num12);
        mediaPlayer.start();
    }

    public void C13(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num13);
        mediaPlayer.start();
    }

    public void C14(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num14);
        mediaPlayer.start();
    }

    public void C15(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num15);
        mediaPlayer.start();
    }

    public void C16(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num16);
        mediaPlayer.start();
    }

    public void C17(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num17);
        mediaPlayer.start();
    }

    public void C18(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num18);
        mediaPlayer.start();
    }

    public void C19(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num19);
        mediaPlayer.start();
    }

    public void C20(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num20);
        mediaPlayer.start();
    }

    public void C21(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num21);
        mediaPlayer.start();
    }

    public void C22(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num22);
        mediaPlayer.start();
    }

    public void C23(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num23);
        mediaPlayer.start();
    }

    public void C24(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num24);
        mediaPlayer.start();
    }

    public void C25(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num25);
        mediaPlayer.start();
    }

    public void C26(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num26);
        mediaPlayer.start();
    }

    public void C27(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num27);
        mediaPlayer.start();
    }

    public void C28(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num28);
        mediaPlayer.start();
    }

    public void C29(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num29);
        mediaPlayer.start();
    }

    public void C30(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num30);
        mediaPlayer.start();
    }

    public void C31(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num31);
        mediaPlayer.start();
    }

    public void C32(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num32);
        mediaPlayer.start();
    }

    public void C33(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num33);
        mediaPlayer.start();
    }

    public void C34(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num34);
        mediaPlayer.start();
    }

    public void C35(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num35);
        mediaPlayer.start();
    }

    public void C36(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num36);
        mediaPlayer.start();

    }

    public void C37(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num37);
        mediaPlayer.start();
    }

    public void C38(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num38);
        mediaPlayer.start();
    }

    public void C39(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num39);
        mediaPlayer.start();
    }

    public void C40(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num40);
        mediaPlayer.start();
    }

    public void C41(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num41);
        mediaPlayer.start();
    }

    public void C42(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num42);
        mediaPlayer.start();
    }

    public void C43(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num43);
        mediaPlayer.start();
    }

    public void C44(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num44);
        mediaPlayer.start();
    }

    public void C45(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num45);
        mediaPlayer.start();
    }

    public void C46(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num46);
        mediaPlayer.start();
    }

    public void C47(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num47);
        mediaPlayer.start();
    }

    public void C48(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num48);
        mediaPlayer.start();
    }

    public void C49(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num49);
        mediaPlayer.start();
    }

    public void C50(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num50);
        mediaPlayer.start();
    }

    public void C51(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num51);
        mediaPlayer.start();
    }


    public void C52(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num52);
        mediaPlayer.start();
    }

    public void C53(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num53);
        mediaPlayer.start();
    }

    public void C54(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num54);
        mediaPlayer.start();
    }

    public void C55(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num55);
        mediaPlayer.start();
    }

    public void C56(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num56);
        mediaPlayer.start();
    }

    public void C57(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num57);
        mediaPlayer.start();
    }

    public void C58(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num58);
        mediaPlayer.start();
    }

    public void C59(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num59);
        mediaPlayer.start();
    }

    public void C60(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num60);
        mediaPlayer.start();
    }

    public void C61(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num61);
        mediaPlayer.start();
    }

    public void C62(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num62);
        mediaPlayer.start();
    }


    public void C63(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num63);
        mediaPlayer.start();
    }

    public void C64(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num64);
        mediaPlayer.start();
    }

    public void C65(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num65);
        mediaPlayer.start();
    }

    public void C66(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num66);
        mediaPlayer.start();
    }

    public void C67(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num67);
        mediaPlayer.start();
    }

    public void C68(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num68);
        mediaPlayer.start();
    }

    public void C69(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num69);
        mediaPlayer.start();
    }

    public void C70(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num70);
        mediaPlayer.start();
    }

    public void C71(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num71);
        mediaPlayer.start();
    }

    public void C72(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num72);
        mediaPlayer.start();
    }

    public void C73(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num73);
        mediaPlayer.start();
    }

    public void C74(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num74);
        mediaPlayer.start();
    }

    public void C75(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num75);
        mediaPlayer.start();
    }

    public void C76(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num76);
        mediaPlayer.start();
    }

    public void C77(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num77);
        mediaPlayer.start();
    }

    public void C78(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num78);
        mediaPlayer.start();
    }

    public void C79(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num79);
        mediaPlayer.start();
    }

    public void C80(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num80);
        mediaPlayer.start();
    }

    public void C81(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num81);
        mediaPlayer.start();
    }

    public void C82(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num82);
        mediaPlayer.start();
    }

    public void C83(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num83);
        mediaPlayer.start();
    }

    public void C84(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num84);
        mediaPlayer.start();
    }

    public void C85(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bn_85);
        mediaPlayer.start();
    }

    public void C86(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num86);
        mediaPlayer.start();
    }

    public void C87(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num87);
        mediaPlayer.start();
    }

    public void C88(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num88);
        mediaPlayer.start();
    }

    public void C89(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num89);
        mediaPlayer.start();
    }

    public void C90(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num90);
        mediaPlayer.start();
    }

    public void C91(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num91);
        mediaPlayer.start();
    }

    public void C92(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num92);
        mediaPlayer.start();
    }

    public void C93(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num93);
        mediaPlayer.start();
    }

    public void C94(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num94);
        mediaPlayer.start();
    }

    public void C95(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num95);
        mediaPlayer.start();
    }

    public void C96(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num96);
        mediaPlayer.start();
    }


    public void C97(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num97);
        mediaPlayer.start();
    }

    public void C98(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num98);
        mediaPlayer.start();
    }

    public void C99(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num99);
        mediaPlayer.start();
    }

    public void C100(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.num100);
        mediaPlayer.start();
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }


}