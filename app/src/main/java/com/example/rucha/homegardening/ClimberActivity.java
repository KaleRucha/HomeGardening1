package com.example.rucha.homegardening;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableRow;

import com.example.rucha.homegardening.Climbers.BougainvilleaActivity;
import com.example.rucha.homegardening.Climbers.ButterflyPeaActivity;
import com.example.rucha.homegardening.Climbers.FlameVineActivity;
import com.example.rucha.homegardening.Climbers.LoofahActivity;
import com.example.rucha.homegardening.Climbers.MoneyPlantActivity;
import com.example.rucha.homegardening.Climbers.MorningGloryActivity;
import com.example.rucha.homegardening.Climbers.StarJasmineActivity;
import com.example.rucha.homegardening.Climbers.TomatoesActivity;

public class ClimberActivity extends AppCompatActivity implements View.OnClickListener {

    public TableRow mTrBougainvillea;
    public TableRow mTrButterflyPea;
    public TableRow mTrFlameVine;
    public TableRow mTrLoofah;
    public TableRow mTrMoneyPlant;
    public TableRow mTrMorningGlory;
    public TableRow mTrStarJasmine;
    public TableRow mTrTomatoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climber);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mTrBougainvillea = findViewById(R.id.trBougainvillea);
        mTrButterflyPea = findViewById(R.id.trButterflyPea);
        mTrFlameVine = findViewById(R.id.trFlame_vine);
        mTrLoofah = findViewById(R.id.trLoofah);
        mTrMoneyPlant = findViewById(R.id.trMoney_Plant);
        mTrMorningGlory = findViewById(R.id.trBlue_morning_Glory);
        mTrStarJasmine = findViewById(R.id.trStar_jasmine);
        mTrTomatoes = findViewById(R.id.trTomatoes);

        mTrBougainvillea.setOnClickListener(this);
        mTrButterflyPea.setOnClickListener(this);
        mTrFlameVine.setOnClickListener(this);
        mTrLoofah.setOnClickListener(this);
        mTrMoneyPlant.setOnClickListener(this);
        mTrMorningGlory.setOnClickListener(this);
        mTrStarJasmine.setOnClickListener(this);
        mTrTomatoes.setOnClickListener(this);

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
                Intent intenthome = new Intent(ClimberActivity.this, MainActivity.class);
                startActivity(intenthome);
                break;
            case R.id.action_herb:
                finish();
                Intent intentherb = new Intent(ClimberActivity.this, HerbActivity.class);
                startActivity(intentherb);
                break;
            case R.id.action_shrub:
                finish();
                Intent intentshrub = new Intent(ClimberActivity.this, ShrubActivity.class);
                startActivity(intentshrub);
                break;
            case R.id.action_climber:
                finish();
                Intent intentclimber = new Intent(ClimberActivity.this, ClimberActivity.class);
                startActivity(intentclimber);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view==mTrBougainvillea) {

            Intent intentTulsi = new Intent(ClimberActivity.this, BougainvilleaActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrButterflyPea) {

            Intent intentTulsi = new Intent(ClimberActivity.this, ButterflyPeaActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrFlameVine) {

            Intent intentTulsi = new Intent(ClimberActivity.this, FlameVineActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrLoofah) {

            Intent intentTulsi = new Intent(ClimberActivity.this, LoofahActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrMoneyPlant) {

            Intent intentTulsi = new Intent(ClimberActivity.this, MoneyPlantActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrMorningGlory) {

            Intent intentTulsi = new Intent(ClimberActivity.this, MorningGloryActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrStarJasmine) {

            Intent intentTulsi = new Intent(ClimberActivity.this, StarJasmineActivity.class);
            startActivity(intentTulsi);
        }

        else if (view==mTrTomatoes) {

            Intent intentTulsi = new Intent(ClimberActivity.this, TomatoesActivity.class);
            startActivity(intentTulsi);
        }
    }
}
