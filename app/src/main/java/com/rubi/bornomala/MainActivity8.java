package com.rubi.bornomala;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

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

public class MainActivity8 extends AppCompatActivity {

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
        setContentView(R.layout.activity_main8);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("মিষ্টি ছাড়া");


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
        list.add(new RecipeModel(R.drawable.pic_9, "কানা বগীর ছা\n–খান মুহম্মদ মঈনুদ্দীন"));
        /*list.add(new RecipeModel(R.drawable.pic_10, ""));*/


        RecipeAdapter adapter = new RecipeAdapter(list, this);
        recyclerView.setAdapter(adapter);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);



        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainActivity8.this, kobita_1.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(MainActivity8.this, kobita_2.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(MainActivity8.this, kobita_3.class);
                        startActivity(intent2);
                        break;


                    case 3:
                        Intent intent3 = new Intent(MainActivity8.this, kobita_4.class);
                        startActivity(intent3);
                        break;


                    case 4:
                        Intent intent4 = new Intent(MainActivity8.this, kobita_5.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(MainActivity8.this, kobita_6.class);
                        startActivity(intent5);
                        break;


                    case 6:
                        Intent intent6 = new Intent(MainActivity8.this, kobita_7.class);
                        startActivity(intent6);
                        break;


                    case 7:
                        Intent intent7 = new Intent(MainActivity8.this, kobita_8.class);
                        startActivity(intent7);
                        break;


                    case 8:
                        Intent intent8 = new Intent(MainActivity8.this,kobita_9.class);
                        startActivity(intent8);
                        break;


                    case 9:
                        Intent intent9 = new Intent(MainActivity8.this, kobita_10.class);
                        startActivity(intent9);
                        break;



                    default:


                }

            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }
        ));



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