package com.santoshnet.materialdesignui.fagment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.santoshnet.materialdesignui.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SplashScreen2Fragment extends Fragment {


    public SplashScreen2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_splash_screen2, container, false);

        final ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        final Animation animation_1 = AnimationUtils.loadAnimation(getContext(), R.anim.rotate);
        final Animation animation_2 = AnimationUtils.loadAnimation(getContext(), R.anim.antirotate);
        final Animation animation_3 = AnimationUtils.loadAnimation(getContext(), R.anim.abc_fade_out);

        imageView.startAnimation(animation_2);
        animation_2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(animation_1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animation_1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(animation_3);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        return view;
    }

}
