package com.example.rucha.homegardening;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class ClimberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climber);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
                Intent intenthome = new Intent(ClimberActivity.this, MainActivity.class);
                startActivity(intenthome);
                break;
            case R.id.action_herb:
                Intent intentherb = new Intent(ClimberActivity.this, HerbActivity.class);
                startActivity(intentherb);
                break;
            case R.id.action_shrub:
                Intent intentshrub = new Intent(ClimberActivity.this, ShrubActivity.class);
                startActivity(intentshrub);
                break;
            case R.id.action_climber:
                Intent intentclimber = new Intent(ClimberActivity.this, ClimberActivity.class);
                startActivity(intentclimber);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
