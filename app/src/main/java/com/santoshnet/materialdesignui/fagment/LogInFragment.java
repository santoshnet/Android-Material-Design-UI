package com.santoshnet.materialdesignui.fagment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.santoshnet.materialdesignui.R;
import com.santoshnet.materialdesignui.activity.Login2Activity;

/**
 * A simple {@link Fragment} subclass.
 */
public class LogInFragment extends Fragment {
    Button login;

    public LogInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_log_in, container, false);
        login = (Button) view.findViewById(R.id.login_btn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Login2Activity.class));
            }
        });

        return view;
    }

}
