package com.example.ryamobiluyg;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtyukleniyor;
    ProgressBar prgyukleniyor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        txtyukleniyor = (TextView) findViewById(R.id.txt_yukleniyor);
        prgyukleniyor =(ProgressBar) findViewById(R.id.prg_yukleniyor);

        prgyukleniyor.setMax(100);
        prgyukleniyor.setScaleX(3f);

        progressanimation();
        finishActivity(0);



    }


    public void progressanimation(){
        progressbaranimation anim = new progressbaranimation(this,txtyukleniyor,prgyukleniyor,0f,100f);
        anim.setDuration(3000);
        prgyukleniyor.setAnimation(anim);

    }
}
