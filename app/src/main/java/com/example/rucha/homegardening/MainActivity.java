package com.example.rucha.homegardening;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        NavigationView.OnNavigationItemSelectedListener{

    public TextView mtxtviewHerb;
    public TextView mtxtviewShrub;
    public TextView mtxtviewClimber;
    public Context context;
    private AdView mAdView;

    private ScaleGestureDetector mScaleGesDetector;
    private float mScale = 1f;
    private Matrix matrix = new Matrix();
    ImageView mImgviewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Initialize mobile ad
        MobileAds.initialize(this, "ca-app-pub-8540792007814269~3729382015");

//        Call ads
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setOnClickListener(this);

//        Zoom layout starts --->
//        mImgviewHome = (ImageView)findViewById(R.id.imgviewHome);
//        TouchImageView img = new TouchImageView(this);
//        img.setImageResource(R.drawable.home);
//        img.setMaxZoom(4f);
//        setContentView(img);
//       zoom layout ends --->

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mtxtviewHerb = findViewById(R.id.txtviewHerb);
        mtxtviewHerb.setOnClickListener(this);

        mtxtviewShrub = findViewById(R.id.txtviewShrub);
        mtxtviewShrub.setOnClickListener(this);

        mtxtviewClimber = findViewById(R.id.txtviewClimber);
        mtxtviewClimber.setOnClickListener(this);

//        Navigation View starts
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
//        Navigation View ends


    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            mScale = mScale * detector.getScaleFactor();
            mScale = Math.max(0.1f, Math.min(mScale, 5.0f));
            matrix.setScale(mScale, mScale);
            mImgviewHome.setImageMatrix(matrix);
            return true;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mScaleGesDetector.onTouchEvent(event);
        return true;
    }

    @Override
    public void onClick(View view) {

//        Calling activity for Herb
        if (view==mtxtviewHerb) {
            finish();
            Intent intentHerb = new Intent(MainActivity.this, HerbActivity.class);
            startActivity(intentHerb);
        }

//        Calling activity for Shrub
        else if (view==mtxtviewShrub) {
            finish();
            Intent intentShrub = new Intent(MainActivity.this, ShrubActivity.class);
            startActivity(intentShrub);
        }

//        Calling activity for Climbers
        else if (view==mtxtviewClimber) {
            finish();
            Intent intentClimber = new Intent(MainActivity.this, ClimberActivity.class);
            startActivity(intentClimber);
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_about) {
            Intent intentAbout = new Intent(MainActivity.this, AboutAppActivity.class);

            startActivity(intentAbout);

        } else if (id == R.id.nav_reviews) {
            context=MainActivity.this;
            showRateDialog(context);

        } else if (id == R.id.nav_share) {
//            Sharing our app
            try {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, "Share this app");
                String strShareMessage = "\nLet me recommend you this application\n\n";
                strShareMessage = strShareMessage + "https://play.google.com/store/apps/details?id=" + getPackageName();
                Uri screenshotUri = Uri.parse("android.resource://packagename/drawable/image_name");
                i.setType("image/png");
                i.putExtra(Intent.EXTRA_STREAM, screenshotUri);
                i.putExtra(Intent.EXTRA_TEXT, strShareMessage);
                startActivity(Intent.createChooser(i, "Share via"));
            } catch(Exception e) {
                //e.toString();
            }

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    public static void showRateDialog(final Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle("Rate application")
                .setMessage("Please, rate the app at PlayMarket")
                .setPositiveButton("RATE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (context != null) {
                            String link = "market://details?id=";
                            try {
                                // play market available
                                context.getPackageManager()
                                        .getPackageInfo("com.android.vending", 0);
                                // not available
                            } catch (PackageManager.NameNotFoundException e) {
                                e.printStackTrace();
                                // should use browser
                                link = "https://play.google.com/store/apps/details?id=";
                            }
                            // starts external action
                            context.startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse(link + context.getPackageName())));
                        }
                    }
                })
                .setNegativeButton("CANCEL", null);
        builder.show();
    }

//    Ad events start --->
    @Override
    public void onResume() {
        super.onResume();

        // Resume the AdView.
        mAdView.resume();
    }

    @Override
    public void onDestroy() {
        // Destroy the AdView.
        mAdView.destroy();
        super.onDestroy();
    }
//    Ad events end --->

//    Zoom events start --->
}
