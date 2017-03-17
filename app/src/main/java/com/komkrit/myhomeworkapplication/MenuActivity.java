package com.komkrit.myhomeworkapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    private ImageButton imgBtnProfile;
    private ImageButton imgBtnLove;
    private ImageButton imgBtnHos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        imgBtnProfile = (ImageButton)findViewById(R.id.imgBtnProfile);
        imgBtnProfile.setOnClickListener(onClickSubmitListner);

        imgBtnLove = (ImageButton)findViewById(R.id.imgBtnLove);
        imgBtnLove.setOnClickListener(onClickLoveListner);

        imgBtnHos = (ImageButton)findViewById(R.id.imgBtnHos);
        imgBtnHos.setOnClickListener(onClickHealthListner);
    }

    private View.OnClickListener onClickSubmitListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener onClickLoveListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), LoveActivity.class);
            startActivity(i);
        }
    };

    private View.OnClickListener onClickHealthListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), HealthActivity.class);
            startActivity(i);
        }
    };
}
