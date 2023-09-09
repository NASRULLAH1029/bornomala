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


        list.add(new RecipeModel(R.drawable.alu, "আলু - Potato "));
        list.add(new RecipeModel(R.drawable.carrots, "গাজর - Carrots"));
        list.add(new RecipeModel(R.drawable.cucumber, "শসা - Cucumber"));
        list.add(new RecipeModel(R.drawable.brinjal, "বেগুন - Brinjal"));
        list.add(new RecipeModel(R.drawable.ladiesfinger, "ঢেঁড়স - Ladies finger"));
        list.add(new RecipeModel(R.drawable.peas, "মটরশুটি - Peas"));
        list.add(new RecipeModel(R.drawable.radish, "মূলা - Radish"));
        list.add(new RecipeModel(R.drawable.turnip, "শালগম - Turnip"));
        list.add(new RecipeModel(R.drawable.bittergourd, "করলা - Bitter gourd"));
        list.add(new RecipeModel(R.drawable.mushroom, "মাশরুম - Mushroom"));
        list.add(new RecipeModel(R.drawable.basil, "পুঁইশাক - Basil"));
        list.add(new RecipeModel(R.drawable.broccoli, "ব্রোকলি - Broccoli"));
        list.add(new RecipeModel(R.drawable.capsicum, "ক্যাপসিকাম - Capsicum"));
        list.add(new RecipeModel(R.drawable.cauliflower, "ফুলকপি - Cauliflower"));
        list.add(new RecipeModel(R.drawable.coriander_leaves, "ধনে পাতা - Coriander leaves"));
        list.add(new RecipeModel(R.drawable.corn, "ভুট্টা - Corn"));
        list.add(new RecipeModel(R.drawable.drumstick, "সজনে পাতা - Drumstick"));
        list.add(new RecipeModel(R.drawable.garlic, "রসুন - Garlic"));
        list.add(new RecipeModel(R.drawable.ginger, "আদা - Ginger"));
        list.add(new RecipeModel(R.drawable.mint_leaves, "পুদিনা পাতা - Mint leaves"));
        list.add(new RecipeModel(R.drawable.mustard_leaves, "সরিষার পাতা - Mustar leaves"));
        list.add(new RecipeModel(R.drawable.onion, "পেঁয়াজ - Onion"));
        list.add(new RecipeModel(R.drawable.palwal, "পটল - Palwal"));
        list.add(new RecipeModel(R.drawable.papaya, "পেঁপে - Papaya"));
        list.add(new RecipeModel(R.drawable.pumpkin, "কুমড়া - Pumpkin"));
        list.add(new RecipeModel(R.drawable.red_chili, "লাল মরিচ - Red chili"));
        list.add(new RecipeModel(R.drawable.red_leafy, "লালশাক - Red leafy"));
        list.add(new RecipeModel(R.drawable.ridge_gourd, "ঝিঙ্গে - Ridge gourd"));
        list.add(new RecipeModel(R.drawable.snake_gourd, "চিচিঙ্গা - Snake gourd"));
        list.add(new RecipeModel(R.drawable.spinach, "পালংশাক - Spinach"));
        list.add(new RecipeModel(R.drawable.sweet_bitter_gourd, "কাঁকরোল - Sweet bitter gourd"));
        list.add(new RecipeModel(R.drawable.water_lily, "শাপলা - Water lily"));
        list.add(new RecipeModel(R.drawable.sweet_potato, "মিষ্টি আলু - Sweet potato"));
        list.add(new RecipeModel(R.drawable.tomatoes, "টমেটো - Tomatoes"));


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