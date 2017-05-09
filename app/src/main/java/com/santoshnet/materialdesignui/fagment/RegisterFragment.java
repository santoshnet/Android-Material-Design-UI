package com.santoshnet.materialdesignui.fagment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.santoshnet.materialdesignui.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {
    ImageView switch_login, switch_reg;
    RelativeLayout login_layout, register_layout;

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


        return view;
    }

}
