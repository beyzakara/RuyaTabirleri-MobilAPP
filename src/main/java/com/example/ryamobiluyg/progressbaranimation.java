package com.example.ryamobiluyg;




import android.content.Context;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.TextView;

public class progressbaranimation extends  Animation{
    private final Context context;
    private final TextView txtyukleniyor;
    private final ProgressBar prgyukleniyor;
    private  final float baslangicdegeri,bitisdegeri;

    public progressbaranimation(Context context, TextView txtyukleniyor, ProgressBar prgyukleniyor, float baslangicdegeri, float bitisdegeri) {
        this.context = context;
        this.txtyukleniyor = txtyukleniyor;
        this.prgyukleniyor = prgyukleniyor;
        this.baslangicdegeri = baslangicdegeri;
        this.bitisdegeri = bitisdegeri;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float deger = baslangicdegeri + (bitisdegeri-baslangicdegeri)*interpolatedTime;
        String text = (int)deger +"%";
        prgyukleniyor.setProgress((int)deger);
        txtyukleniyor.setText(text);

        if(deger==bitisdegeri){
            context.startActivity(new Intent(context,anasayfa.class));
        }


    }
}