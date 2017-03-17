package com.komkrit.myhomeworkapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoveActivity extends AppCompatActivity {


    private LinearLayout btnLove;
    private TextView txtAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        btnLove = (LinearLayout) findViewById(R.id.btnLove);

        txtAns = (TextView) findViewById(R.id.txtAns);
        btnLove.setOnClickListener(onClickLoveListner);
    }

    private View.OnClickListener onClickLoveListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtAns.setText("รักนะค้าบ");
        }
    };
}
