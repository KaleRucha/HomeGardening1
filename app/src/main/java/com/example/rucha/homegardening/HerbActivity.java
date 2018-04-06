package com.example.rucha.homegardening;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;

import com.example.rucha.homegardening.Herbs.AloeveraActivity;
import com.example.rucha.homegardening.Herbs.AshwagandhaActivity;
import com.example.rucha.homegardening.Herbs.CorianderActivity;
import com.example.rucha.homegardening.Herbs.KhusActivity;
import com.example.rucha.homegardening.Herbs.LavenderActivity;
import com.example.rucha.homegardening.Herbs.LemongrassActivity;
import com.example.rucha.homegardening.Herbs.MarigoldActivity;
import com.example.rucha.homegardening.Herbs.MethiActivity;
import com.example.rucha.homegardening.Herbs.MintActivity;
import com.example.rucha.homegardening.Herbs.ParsleyActivity;
import com.example.rucha.homegardening.Herbs.TulsiActivity;
import com.example.rucha.homegardening.R;

public class HerbActivity extends AppCompatActivity implements View.OnClickListener {

    public TableRow mTrTulsi;
    public TableRow mTrAloevera;
    public TableRow mTrGenda;
    public TableRow mTrMethi;
    public TableRow mTrMint;
    public TableRow mTrAshwagandha;
    public TableRow mTrLemongrass;
    public TableRow mTrKhus;
    public TableRow mTrLavender;
    public TableRow mTrParsley;
    public TableRow mTrCoriander;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herb);

        mTrTulsi = findViewById(R.id.trTulsi);
        mTrTulsi.setOnClickListener(this);

        mTrAloevera = findViewById(R.id.trAloevera);
        mTrAloevera.setOnClickListener(this);

        mTrGenda = findViewById(R.id.trGenda);
        mTrGenda.setOnClickListener(this);

        mTrMethi = findViewById(R.id.trMethi);
        mTrMethi.setOnClickListener(this);

        mTrMint = findViewById(R.id.trMint);
        mTrMint.setOnClickListener(this);

        mTrAshwagandha = findViewById(R.id.trAshwagandha);
        mTrAshwagandha.setOnClickListener(this);

        mTrLemongrass = findViewById(R.id.trLemongrass);
        mTrLemongrass.setOnClickListener(this);

        mTrKhus = findViewById(R.id.trKhus);
        mTrKhus.setOnClickListener(this);

        mTrLavender = findViewById(R.id.trLavender);
        mTrLavender.setOnClickListener(this);

        mTrParsley = findViewById(R.id.trParsley);
        mTrParsley.setOnClickListener(this);

        mTrCoriander = findViewById(R.id.trCoriander);
        mTrCoriander.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

//        Calling activity for Herb
        if (view==mTrTulsi) {

            Intent intentTulsi = new Intent(HerbActivity.this, TulsiActivity.class);
            startActivity(intentTulsi);
        }

        if (view==mTrAloevera) {

            Intent intentaloevera = new Intent(HerbActivity.this, AloeveraActivity.class);
            startActivity(intentaloevera);
        }

        if (view==mTrGenda) {

            Intent intentgenda = new Intent(HerbActivity.this, MarigoldActivity.class);
            startActivity(intentgenda);
        }

        if (view==mTrMethi) {

            Intent intentmethi = new Intent(HerbActivity.this, MethiActivity.class);
            startActivity(intentmethi);
        }

        if (view==mTrMint) {

            Intent intentmint = new Intent(HerbActivity.this, MintActivity.class);
            startActivity(intentmint);
        }

        if (view==mTrAshwagandha) {

            Intent intentashwagandha = new Intent(HerbActivity.this, AshwagandhaActivity.class);
            startActivity(intentashwagandha);
        }

        if (view==mTrLemongrass) {

            Intent intentlemongrass = new Intent(HerbActivity.this, LemongrassActivity.class);
            startActivity(intentlemongrass);
        }

        if (view==mTrKhus) {

            Intent intentkhus = new Intent(HerbActivity.this, KhusActivity.class);
            startActivity(intentkhus);
        }

        if (view==mTrLavender) {

            Intent intentlavender = new Intent(HerbActivity.this, LavenderActivity.class);
            startActivity(intentlavender);
        }

        if (view==mTrParsley) {

            Intent intentparsley = new Intent(HerbActivity.this, ParsleyActivity.class);
            startActivity(intentparsley);
        }

        if (view==mTrCoriander) {

            Intent intentcoriander = new Intent(HerbActivity.this, CorianderActivity.class);
            startActivity(intentcoriander);
        }
    }
}
