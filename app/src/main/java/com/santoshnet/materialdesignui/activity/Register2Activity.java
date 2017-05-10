package com.santoshnet.materialdesignui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.santoshnet.materialdesignui.R;

public class Register2Activity extends AppCompatActivity {
    RelativeLayout loginLayout, registerLayout;
    TextView headerText;
    TextView headerSubText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        loginLayout = (RelativeLayout) findViewById(R.id.card_login_container1);
        registerLayout = (RelativeLayout) findViewById(R.id.card_reg_container1);
        headerText = (TextView) findViewById(R.id.header_layout_text);
        headerSubText = (TextView) findViewById(R.id.header_layout_subtext);
        headerSubText.setSelected(true);
        headerText.setText("==REGISTER==");
        headerSubText.setText("\t \t \t \t \t \t\t \t \t  welcome To Our Registration Screen \t \t \t \t\t \t \t \t\t \t \t \t \t \t\t \t \t");

    }

    public void onLogInClicked(View view) {
        loginLayout.setVisibility(View.VISIBLE);
        registerLayout.setVisibility(View.GONE);
        headerSubText.setSelected(true);
        headerText.setText("==LOGIN==");
        headerSubText.setText("\t \t \t \t\t \t \t \t \t  welcome To Our lOGIN Screen  \t \t \t \t\t \t \t \t\t \t \t \t \t \t\t \t \t \t ");

    }

    public void onRegisterClicked(View view) {
        loginLayout.setVisibility(View.GONE);
        registerLayout.setVisibility(View.VISIBLE);
        headerSubText.setSelected(true);
        headerText.setText("==REGISTER==");
        headerSubText.setText("\t \t \t \t\t \t \t \t \t  welcome To Our Registration Screen \t \t \t \t\t \t \t \t\t \t \t \t \t \t\t \t \t \t ");

    }
}
