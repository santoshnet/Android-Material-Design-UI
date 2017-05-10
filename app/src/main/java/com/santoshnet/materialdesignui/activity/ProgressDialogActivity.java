package com.santoshnet.materialdesignui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

import com.santoshnet.materialdesignui.R;

public class ProgressDialogActivity extends AppCompatActivity implements OnClickListener {
    private Button btnProgressBar;
    private Button btnProgressDialogOne, btnProgressDialogTwo;
    private ProgressBar viewProgressBar;
    private CustomProgressDialogTwo customProgressDialogTwo;
    private CustomProgressDialogOne customProgressDialogOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog);
        initializeViews();
        clickListener();
    }

    private void initializeViews() {
        btnProgressBar = (Button) findViewById(R.id.btnProgressBar);
        btnProgressDialogOne = (Button) findViewById(R.id.btnProgressDialogOne);
        btnProgressDialogTwo = (Button) findViewById(R.id.btnProgressDialogTwo);
        viewProgressBar = (ProgressBar) findViewById(R.id.viewProgressBar);
        customProgressDialogTwo = new CustomProgressDialogTwo(this, R.drawable.loadingicon);
        customProgressDialogOne = new CustomProgressDialogOne();
    }

    private void clickListener() {
        btnProgressBar.setOnClickListener(this);
        btnProgressDialogOne.setOnClickListener(this);
        btnProgressDialogTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnProgressBar:
                viewProgressBar.setVisibility(View.VISIBLE);
                break;
            case R.id.btnProgressDialogOne:
                viewProgressBar.setVisibility(View.GONE);
                customProgressDialogOne.showCustomDialog(this);
                break;
            case R.id.btnProgressDialogTwo:
                viewProgressBar.setVisibility(View.GONE);
                customProgressDialogTwo.show();
                break;
        }
    }
}
