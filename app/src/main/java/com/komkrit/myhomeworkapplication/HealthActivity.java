package com.komkrit.myhomeworkapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HealthActivity extends AppCompatActivity {

    private LinearLayout btnHealth;
    private TextView txtAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        btnHealth = (LinearLayout) findViewById(R.id.btnHealth);
        txtAns = (TextView) findViewById(R.id.txtAns);
        btnHealth.setOnClickListener(onClickHealthListner);
    }


    private View.OnClickListener onClickHealthListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtAns.setText("So Good");
        }
    };
}
