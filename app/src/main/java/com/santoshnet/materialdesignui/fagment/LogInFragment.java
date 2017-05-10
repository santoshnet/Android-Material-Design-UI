package com.santoshnet.materialdesignui.fagment;


import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.santoshnet.materialdesignui.R;
import com.santoshnet.materialdesignui.activity.Login2Activity;

/**
 * A simple {@link Fragment} subclass.
 */
public class LogInFragment extends Fragment {
    Button login;
    TextView regText, loginText;
    RelativeLayout loginLayout, regLayout;
    AnimatorSet set;
    public LogInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_log_in, container, false);
        login = (Button) view.findViewById(R.id.login_btn);
        regText = (TextView) view.findViewById(R.id.register_txt);
        loginText = (TextView) view.findViewById(R.id.login_txt);
        loginLayout = (RelativeLayout) view.findViewById(R.id.fr_login_container);
        regLayout = (RelativeLayout) view.findViewById(R.id.fr_reg_container);
        ObjectAnimator animation = ObjectAnimator.ofFloat(loginLayout, "rotationY", 0.0f, 360f);
        animation.setDuration(1000);
        animation.setRepeatCount(0);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        animation.start();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Login2Activity.class));
            }
        });
        regText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set = null;
                set = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.flip);
                set.setTarget(loginLayout);
                set.start();
                loginLayout.setVisibility(View.GONE);
                regLayout.setVisibility(View.VISIBLE);


            }
        });
        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set = null;
                set = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.flip);
                set.setTarget(regLayout);
                set.start();
                regLayout.setVisibility(View.GONE);
                loginLayout.setVisibility(View.VISIBLE);
            }
        });



        return view;
    }

}
