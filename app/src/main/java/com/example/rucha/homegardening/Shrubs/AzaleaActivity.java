package com.example.rucha.homegardening.Shrubs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.rucha.homegardening.ClimberActivity;
import com.example.rucha.homegardening.HerbActivity;
import com.example.rucha.homegardening.MainActivity;
import com.example.rucha.homegardening.R;
import com.example.rucha.homegardening.ShrubActivity;

public class AzaleaActivity extends AppCompatActivity implements View.OnClickListener {

    public ImageButton mImgbtnPrev;
    public ImageButton mImgbtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azalea);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mImgbtnPrev = findViewById(R.id.imgbtnPrev);
        mImgbtnPrev.setOnClickListener(this);
//        mImgbtnPrev.setVisibility(View.INVISIBLE);

        mImgbtnNext = findViewById(R.id.imgbtnNext);
        mImgbtnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == mImgbtnNext) {
            Intent intent = new Intent(AzaleaActivity.this, DahliaActivity.class);
            startActivity(intent);
        }
        if (view == mImgbtnPrev) {
            Intent intent = new Intent(AzaleaActivity.this, DracaenaActivity.class);
            startActivity(intent);
        }
    }

    //      Menu Start --->
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_home:
                Intent intenthome = new Intent(AzaleaActivity.this, MainActivity.class);
                startActivity(intenthome);
                break;
            case R.id.action_herb:
                Intent intentherb = new Intent(AzaleaActivity.this, HerbActivity.class);
                startActivity(intentherb);
                break;
            case R.id.action_shrub:
                Intent intentshrub = new Intent(AzaleaActivity.this, ShrubActivity.class);
                startActivity(intentshrub);
                break;
            case R.id.action_climber:
                Intent intentclimber = new Intent(AzaleaActivity.this, ClimberActivity.class);
                startActivity(intentclimber);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
//      Menu End --->

}
