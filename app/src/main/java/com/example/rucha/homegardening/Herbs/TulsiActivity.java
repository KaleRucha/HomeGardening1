package com.example.rucha.homegardening.Herbs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.rucha.homegardening.ClimberActivity;
import com.example.rucha.homegardening.HerbActivity;
import com.example.rucha.homegardening.MainActivity;
import com.example.rucha.homegardening.R;
import com.example.rucha.homegardening.ShrubActivity;

public class TulsiActivity extends AppCompatActivity implements View.OnClickListener {

    public ImageButton mImgbtnPrev;
    public ImageButton mImgbtnNext;
    ImageView imageView;
    Button loadImageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulsi);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Gestures for swipping in the activities
//        Slidr.attach(this);
        imageView = findViewById(R.id.imageView);

        mImgbtnPrev = findViewById(R.id.imgbtnPrev);
//        mImgbtnPrev.setOnClickListener(this);
        mImgbtnPrev.setVisibility(View.INVISIBLE);

        mImgbtnNext = findViewById(R.id.imgbtnNext);
        mImgbtnNext.setOnClickListener(this);

//        loadImageBtn = findViewById(R.id.loadButton);

//        loadImageBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setType("image/*");
//                intent.setAction(Intent.ACTION_GET_CONTENT);//
//
//                startActivityForResult(Intent.createChooser(intent, "Select Picture"), AppConstants.REQ_CODE_SELECT_IMAGE);
//            }
//        });
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == AppConstants.REQ_CODE_SELECT_IMAGE) {
//            if (resultCode == Activity.RESULT_OK) {
//                Uri selectedImageUri = data.getData();
//                imageView.setImageURI(selectedImageUri);
//            } else if (resultCode == Activity.RESULT_CANCELED) {
//                Toast.makeText(getApplicationContext(), AppConstants.SEARCH_CANCELLED, Toast.LENGTH_SHORT).show();
//            }
//
//        }
//    }

    @Override
    public void onClick(View view) {

        if (view == mImgbtnNext) {
            Intent intent = new Intent(TulsiActivity.this, AloeveraActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.enter_layout, R.anim.exit_layout);
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
                finish();
                Intent intenthome = new Intent(TulsiActivity.this, MainActivity.class);
                startActivity(intenthome);
                break;
            case R.id.action_herb:
                finish();
                Intent intentherb = new Intent(TulsiActivity.this, HerbActivity.class);
                startActivity(intentherb);
                break;
            case R.id.action_shrub:
                finish();
                Intent intentshrub = new Intent(TulsiActivity.this, ShrubActivity.class);
                startActivity(intentshrub);
                break;
            case R.id.action_climber:
                finish();
                Intent intentclimber = new Intent(TulsiActivity.this, ClimberActivity.class);
                startActivity(intentclimber);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
//      Menu End --->
}
