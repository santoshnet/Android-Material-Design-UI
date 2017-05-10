package com.santoshnet.materialdesignui.activity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.santoshnet.materialdesignui.R;

public class FlipActivity extends AppCompatActivity {
    AnimatorSet set;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip);
        imgView = (ImageView) findViewById(R.id.imageview);


    }


    public void onFLipClicked(View view) {
        set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.flip);
        set.setTarget(imgView);
        set.start();
    }
}
