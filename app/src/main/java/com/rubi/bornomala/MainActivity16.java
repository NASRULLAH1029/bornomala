package com.rubi.bornomala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.rubi.bornomala.Adapters.RecipeAdapter;
import com.rubi.bornomala.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity16 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main16);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        recyclerView = findViewById(R.id.recyclerView_2);

        ArrayList<RecipeModel> list = new ArrayList<>();


        list.add(new RecipeModel(R.drawable.appel, "আপেল - Apple"));
        list.add(new RecipeModel(R.drawable.kola, "কলা – Banana"));
        list.add(new RecipeModel(R.drawable.narikel, "নারকেল - Coconut"));
        list.add(new RecipeModel(R.drawable.komla, "কমলা – Orange"));
        list.add(new RecipeModel(R.drawable.anaros, "আনারস - Pineapple"));
        list.add(new RecipeModel(R.drawable.pepe, "পেঁপে - Papaya"));
        list.add(new RecipeModel(R.drawable.amm, "আম - Mango"));
        list.add(new RecipeModel(R.drawable.pyara, "পেয়ারা  -Guava"));
        list.add(new RecipeModel(R.drawable.lebu, "লেবু - Lemon"));
        list.add(new RecipeModel(R.drawable.tarmuj, "তরমুজ - Watermelon"));



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