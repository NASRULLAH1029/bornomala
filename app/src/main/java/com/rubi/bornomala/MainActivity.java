package com.rubi.bornomala;


import android.content.DialogInterface;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;


import androidx.appcompat.app.AppCompatActivity;


import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.material.navigation.NavigationView;
import com.rubi.bornomala.Adapters.RecipeAdapter;
import com.rubi.bornomala.Classes.RecyclerItemClickListener;
import com.rubi.bornomala.Models.RecipeModel;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;

import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
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
        setContentView(R.layout.activity_main);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.arbi_horof, "আরবি হরফ"));
        list.add(new RecipeModel(R.drawable.i2, "বাংলা স্বরবর্ন"));
        list.add(new RecipeModel(R.drawable.banjon, "বাংলা ব্যঞ্জনবর্ণ"));
        list.add(new RecipeModel(R.drawable.bangla_songkha, "বাংলা সংখ্যা"));
        list.add(new RecipeModel(R.drawable.english_borno, "ইংরেজী বর্ণ"));
        list.add(new RecipeModel(R.drawable.english_songkha, "ইংরেজী সংখ্যা"));
        list.add(new RecipeModel(R.drawable.bangla_kobita, "মিস্টি ছড়া"));
        list.add(new RecipeModel(R.drawable.bangla_satdiner_name, "বাংলা ৭ দিনের নাম"));
        list.add(new RecipeModel(R.drawable.bangla_ritu, "বাংলা ৬ ঋতু"));
        list.add(new RecipeModel(R.drawable.bangla_baro_maser_name, "বাংলা ১২ মাসের নাম"));
        list.add(new RecipeModel(R.drawable.days_of_the_week, "ইংরেজী ৭ দিনের নাম"));
         list.add(new RecipeModel(R.drawable.six_season, "ইংরেজী ৬ ঋতুর নাম"));
        list.add(new RecipeModel(R.drawable.english_month_name, "ইংরেজী ১২ মাসের নাম"));
         list.add(new RecipeModel(R.drawable.sak, "শাক সবজির নাম"));
         list.add(new RecipeModel(R.drawable.foll, "ফলের নাম"));
        list.add(new RecipeModel(R.drawable.fuller, "ফুলের নাম"));
        list.add(new RecipeModel(R.drawable.pakhi, "পাখির নাম"));
        list.add(new RecipeModel(R.drawable.posu, "পশুর নাম"));



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
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, MainActivity3.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, MainActivity4.class);
                        startActivity(intent2);
                        break;


                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, MainActivity5.class);
                        startActivity(intent3);
                        break;


                    case 4:
                        Intent intent4 = new Intent(MainActivity.this, MainActivity6.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(MainActivity.this, MainActivity7.class);
                        startActivity(intent5);
                        break;


                    case 6:
                        Intent intent6 = new Intent(MainActivity.this, MainActivity8.class);
                        startActivity(intent6);
                        break;


                    case 7:
                        Intent intent7 = new Intent(MainActivity.this, MainActivity9.class);
                        startActivity(intent7);
                        break;


                    case 8:
                        Intent intent8 = new Intent(MainActivity.this, MainActivity10.class);
                        startActivity(intent8);
                        break;


                    case 9:
                        Intent intent9 = new Intent(MainActivity.this, MainActivity11.class);
                        startActivity(intent9);
                        break;


                    case 10:
                        Intent intent10 = new Intent(MainActivity.this, MainActivity12.class);
                        startActivity(intent10);
                        break;

                    case 11:
                        Intent intent11 = new Intent(MainActivity.this, MainActivity13.class);
                        startActivity(intent11);
                        break;

                    case 12:
                        Intent intent12 = new Intent(MainActivity.this, MainActivity14.class);
                        startActivity(intent12);
                        break;

                    case 13:
                        Intent intent13 = new Intent(MainActivity.this, MainActivity15.class);
                        startActivity(intent13);
                        break;

                    case 14:
                        Intent intent14 = new Intent(MainActivity.this, MainActivity16.class);
                        startActivity(intent14);
                        break;

                    case 15:
                        Intent intent15 = new Intent(MainActivity.this, MainActivity17.class);
                        startActivity(intent15);
                        break;

                    case 16:
                        Intent intent18 = new Intent(MainActivity.this, MainActivity18.class);
                        startActivity(intent18);
                        break;


                    case 17:
                        Intent intent19 = new Intent(MainActivity.this, MainActivity19.class);
                        startActivity(intent19);
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


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.share) {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "https://play.google.com/store/apps/details?id=com.rubi.bornomala";
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "PLZ RETING THIS APPS");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));

        } else if (item.getItemId() == R.id.more) {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Rubi+Apps+BD"));
            startActivity(intent);
        } else if (item.getItemId() == R.id.feedback) {

            Intent intent = new Intent(MainActivity.this, feedback.class);
            startActivity(intent);


        } else if (item.getItemId() == R.id.exit) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("EXIT..?");
            builder.setMessage("আ্যাপ থেকে বের হতে চান..?\nযদি আমাদের অ্যাপটি ভালো লাগে\n তাহলে অবশ্যই রেটিং দিয়ে \n আমাদের উৎসাহিত করবেন \n ধন্যবাদ")
                    .setCancelable(false)
                    .setPositiveButton("হ্যা", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.super.onBackPressed();
                        }
                    })


                    .setNegativeButton("না", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
            builder.setNeutralButton("MORE APPS", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Uri uri = Uri.parse("https://play.google.com/store/apps/developer?id=Rubi+Apps+BD" + getApplicationContext().getPackageName());
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);

                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.share) {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "https://play.google.com/store/apps/details?id=com.rubi.bornomala";
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "PLZ RETING THIS APPS");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));

        } else if (id == R.id.update) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.rubi.bornomala"));
            startActivity(intent);

        } else if (id == R.id.more) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Rubi+Apps+BD"));
            startActivity(intent);

        } else if (id == R.id.rate) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.rubi.bornomala"));
            startActivity(intent);

        } else if (id == R.id.exit) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("EXIT..?");
            builder.setMessage("আ্যাপ থেকে বের হতে চান..?\nযদি আমাদের অ্যাপটি ভালো লাগে\n তাহলে অবশ্যই রেটিং দিয়ে \n আমাদের উৎসাহিত করবেন \n ধন্যবাদ")
                    .setCancelable(false)
                    .setPositiveButton("হ্যা", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.super.onBackPressed();
                        }
                    })


                    .setNegativeButton("না", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
            builder.setNeutralButton("MORE APPS", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Rubi+Apps+BD"));
                    startActivity(intent);

                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
        return true;

    }

}