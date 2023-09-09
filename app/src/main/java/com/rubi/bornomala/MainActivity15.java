package com.rubi.bornomala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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
import com.rubi.bornomala.Adapters.RecipeAdapter;
import com.rubi.bornomala.Classes.RecyclerItemClickListener;
import com.rubi.bornomala.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity15 extends AppCompatActivity {
    RecyclerView recyclerView;
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
        setContentView(R.layout.activity_main15);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        recyclerView = findViewById(R.id.recyclerView_2);

        ArrayList<RecipeModel> list = new ArrayList<>();


        list.add(new RecipeModel(R.drawable.p_1, "প্রার্থনা\n-সুফিয়া কামাল"));
        list.add(new RecipeModel(R.drawable.amar_pon, "আমার পণ\n-মদনমোহন তর্কালঙ্কার"));
        list.add(new RecipeModel(R.drawable.pic_3, "শিশুর পণ\n-গোলাম মোস্তফা"));
        list.add(new RecipeModel(R.drawable.mamar_bari, "মামার বাড়ি\n-জসীমউদ্দীন"));
        list.add(new RecipeModel(R.drawable.gff, "চাঁদ উঠেছে\n -প্রচলিত"));
        list.add(new RecipeModel(R.drawable.fd, "আয় রে আয় টিয়ে\n-প্রচলিত"));
        list.add(new RecipeModel(R.drawable.ffff, "তোতা পাখি\n -প্রচলিত"));
        list.add(new RecipeModel(R.drawable.hqdefault, "কাজলা দিদি\n-যতীন্দ্রমোহন বাগচী"));
        list.add(new RecipeModel(R.drawable.tal, "কানা বগীর ছা\n–খান মুহম্মদ মঈনুদ্দীন"));
        list.add(new RecipeModel(R.drawable.gol, "ছোটন ঘুমায়\n-সুফিয়া কামাল"));


        RecipeAdapter adapter = new RecipeAdapter(list, this);
        recyclerView.setAdapter(adapter);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);


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


    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);

    }
}