package com.example.rucha.homegardening.Shrubs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.rucha.homegardening.R;

public class HibiscusActivity extends AppCompatActivity implements View.OnClickListener {

    public ImageButton mImgbtnPrev;
    public ImageButton mImgbtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hibiscus);

        mImgbtnPrev = findViewById(R.id.imgbtnPrev);
//        mImgbtnPrev.setOnClickListener(this);
        mImgbtnPrev.setVisibility(View.INVISIBLE);

        mImgbtnNext = findViewById(R.id.imgbtnNext);
        mImgbtnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == mImgbtnNext) {
            Intent intent = new Intent(HibiscusActivity.this, HibiscusActivity.class);
            startActivity(intent);
        }
    }
}
