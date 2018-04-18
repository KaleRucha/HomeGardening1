package com.example.rucha.homegardening;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableRow;

import com.example.rucha.homegardening.Shrubs.ArecaPalmActivity;
import com.example.rucha.homegardening.Shrubs.AzaleaActivity;
import com.example.rucha.homegardening.Shrubs.DahliaActivity;
import com.example.rucha.homegardening.Shrubs.DracaenaActivity;
import com.example.rucha.homegardening.Shrubs.FernActivity;
import com.example.rucha.homegardening.Shrubs.HibiscusActivity;
import com.example.rucha.homegardening.Shrubs.JasmineActivity;
import com.example.rucha.homegardening.Shrubs.LilyActivity;
import com.example.rucha.homegardening.Shrubs.NeriumOleanderActivity;
import com.example.rucha.homegardening.Shrubs.OrchidActivity;
import com.example.rucha.homegardening.Shrubs.RoseActivity;

public class ShrubActivity extends AppCompatActivity implements View.OnClickListener {

    public TableRow mTrPalm;
    public TableRow mTrAzalea;
    public TableRow mTrDahlia;
    public TableRow mTrDracaena;
    public TableRow mTrFern;
    public TableRow mTrHibiscus;
    public TableRow mTrJasmine;
    public TableRow mTrLily;
    public TableRow mTrOleander;
    public TableRow mTrOrchid;
    public TableRow mTrRose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrub);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mTrPalm = findViewById(R.id.trArecaPalm);
        mTrAzalea = findViewById(R.id.trAzalea);
        mTrDahlia = findViewById(R.id.trDahlia);
        mTrDracaena = findViewById(R.id.trDracaena);
        mTrFern = findViewById(R.id.trFern);
        mTrHibiscus = findViewById(R.id.trHibiscus);
        mTrJasmine = findViewById(R.id.trJasmine);
        mTrLily = findViewById(R.id.trLily);
        mTrOleander = findViewById(R.id.trNerium_Oleander);
        mTrOrchid = findViewById(R.id.trOrchid);
        mTrRose = findViewById(R.id.trRose);

        mTrPalm.setOnClickListener(this);
        mTrAzalea.setOnClickListener(this);
        mTrDahlia.setOnClickListener(this);
        mTrDracaena.setOnClickListener(this);
        mTrFern.setOnClickListener(this);
        mTrHibiscus.setOnClickListener(this);
        mTrJasmine.setOnClickListener(this);
        mTrLily.setOnClickListener(this);
        mTrOleander.setOnClickListener(this);
        mTrOrchid.setOnClickListener(this);
        mTrRose.setOnClickListener(this);
    }

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
                finish();
                Intent intenthome = new Intent(ShrubActivity.this, MainActivity.class);
                startActivity(intenthome);
                break;
            case R.id.action_herb:
                finish();
                Intent intentherb = new Intent(ShrubActivity.this, HerbActivity.class);
                startActivity(intentherb);
                break;
            case R.id.action_shrub:
                finish();
                Intent intentshrub = new Intent(ShrubActivity.this, ShrubActivity.class);
                startActivity(intentshrub);
                break;
            case R.id.action_climber:
                finish();
                Intent intentclimber = new Intent(ShrubActivity.this, ClimberActivity.class);
                startActivity(intentclimber);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        if (view==mTrPalm) {

            Intent intentTulsi = new Intent(ShrubActivity.this, ArecaPalmActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrAzalea) {

            Intent intentTulsi = new Intent(ShrubActivity.this, AzaleaActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrDahlia) {

            Intent intentTulsi = new Intent(ShrubActivity.this, DahliaActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrDracaena) {

            Intent intentTulsi = new Intent(ShrubActivity.this, DracaenaActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrFern) {

            Intent intentTulsi = new Intent(ShrubActivity.this, FernActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrHibiscus) {

            Intent intentTulsi = new Intent(ShrubActivity.this, HibiscusActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrJasmine) {

            Intent intentTulsi = new Intent(ShrubActivity.this, JasmineActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrLily) {

            Intent intentTulsi = new Intent(ShrubActivity.this, LilyActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrOleander) {

            Intent intentTulsi = new Intent(ShrubActivity.this, NeriumOleanderActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrOrchid) {

            Intent intentTulsi = new Intent(ShrubActivity.this, OrchidActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrRose) {

            Intent intentTulsi = new Intent(ShrubActivity.this, RoseActivity.class);
            startActivity(intentTulsi);
        }
    }
}
