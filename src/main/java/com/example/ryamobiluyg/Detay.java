package com.example.ryamobiluyg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class Detay extends AppCompatActivity {

    private TextView rüyaismi,rüyaaçıklaması;
    private Intent get_intent;
    private String sAciklama, sIsim;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);
        rüyaismi = (TextView)findViewById(R.id.detay_rüyaismi);
        rüyaaçıklaması = (TextView)findViewById(R.id.detay_rüyaaçıklaması);

        get_intent = getIntent();
        sIsim = get_intent.getStringExtra("rüyaismi");
        sAciklama = get_intent.getStringExtra("rüyaaçıklaması");

        if(!TextUtils.isEmpty(sIsim)&&!TextUtils.isEmpty(sAciklama)){
            rüyaismi.setText(sIsim);
            rüyaaçıklaması.setText(sAciklama);


        }

    }
}