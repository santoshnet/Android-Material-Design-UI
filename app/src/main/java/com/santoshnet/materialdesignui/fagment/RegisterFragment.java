package com.santoshnet.materialdesignui.fagment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.santoshnet.materialdesignui.R;
import com.santoshnet.materialdesignui.activity.Register2Activity;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {
    ImageView switch_login, switch_reg;
    RelativeLayout login_layout, register_layout;
    Button register;
    TextView signin, signup;

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register, container, false);


        login_layout = (RelativeLayout) view.findViewById(R.id.login_layout);
        register_layout = (RelativeLayout) view.findViewById(R.id.register_layout);
        switch_login = (ImageView) view.findViewById(R.id.switch_login);
        switch_reg = (ImageView) view.findViewById(R.id.switch_register);
        register = (Button) view.findViewById(R.id.register_btn);
        signin = (TextView) view.findViewById(R.id.signin_text);
        signup = (TextView) view.findViewById(R.id.signup_text);
        switch_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch_login.setBackgroundResource(R.drawable.register);
                register_layout.setVisibility(View.GONE);
                login_layout.setVisibility(View.VISIBLE);
            }
        });
        switch_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                register_layout.setVisibility(View.VISIBLE);
                login_layout.setVisibility(View.GONE);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Register2Activity.class));
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch_login.setBackgroundResource(R.drawable.register);
                register_layout.setVisibility(View.GONE);
                login_layout.setVisibility(View.VISIBLE);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //switch_login.setBackgroundResource(R.drawable.register);
                register_layout.setVisibility(View.VISIBLE);
                login_layout.setVisibility(View.GONE);
            }
        });

        return view;
    }

}
