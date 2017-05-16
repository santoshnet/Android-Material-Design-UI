package com.santoshnet.materialdesignui.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.santoshnet.materialdesignui.R;

public class BottomSheetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttom_sheet);
        Button bottomSheetButton = (Button) findViewById(R.id.open_close_sheet);
        bottomSheetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBottomSheet();
            }
        });
    }

    public void openBottomSheet() {
        View view = getLayoutInflater().inflate(R.layout.botton_sheet, null);
        ImageView saveIcon = (ImageView) view.findViewById(R.id.save);
        ImageView editIcon = (ImageView) view.findViewById(R.id.edit);
        ImageView printIcon = (ImageView) view.findViewById(R.id.print);
        ImageView shareIcon = (ImageView) view.findViewById(R.id.share);
        final Dialog mBottomSheetDialog = new Dialog(BottomSheetActivity.this, R.style.MaterialDialogSheet);
        mBottomSheetDialog.setContentView(view);
        mBottomSheetDialog.setCancelable(true);
        mBottomSheetDialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        mBottomSheetDialog.getWindow().setGravity(Gravity.BOTTOM);
        mBottomSheetDialog.show();
        saveIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BottomSheetActivity.this, "Saving...", Toast.LENGTH_LONG).show();
                mBottomSheetDialog.dismiss();
                startActivity(new Intent(getApplicationContext(), BottomSheet1.class));
            }
        });
        editIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BottomSheetActivity.this, "Editing...", Toast.LENGTH_LONG).show();
                mBottomSheetDialog.dismiss();
                startActivity(new Intent(getApplicationContext(), BottomSheet1.class));
            }
        });
        printIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BottomSheetActivity.this, "Printing...", Toast.LENGTH_LONG).show();
                mBottomSheetDialog.dismiss();
                startActivity(new Intent(getApplicationContext(), BottomSheet1.class));
            }
        });
        shareIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BottomSheetActivity.this, "Sharing...", Toast.LENGTH_LONG).show();
                mBottomSheetDialog.dismiss();
                startActivity(new Intent(getApplicationContext(), BottomSheet1.class));
            }
        });
    }
}
