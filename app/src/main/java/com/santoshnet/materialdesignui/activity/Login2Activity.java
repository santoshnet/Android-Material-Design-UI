package com.santoshnet.materialdesignui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.santoshnet.materialdesignui.R;

public class Login2Activity extends AppCompatActivity {
    RelativeLayout loginLayout, registerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        loginLayout = (RelativeLayout) findViewById(R.id.card_login_container);
        registerLayout = (RelativeLayout) findViewById(R.id.card_reg_container);

    }

    public void onLogInClicked(View view) {
        registerLayout.setVisibility(View.GONE);
        loginLayout.setVisibility(View.VISIBLE);
    }

    public void onRegisterClicked(View view) {
        registerLayout.setVisibility(View.VISIBLE);
        loginLayout.setVisibility(View.GONE);
    }

    public void onSignInClicked(View view) {
    }

    public void onRegisterBtnClicked(View view) {
    }
}
