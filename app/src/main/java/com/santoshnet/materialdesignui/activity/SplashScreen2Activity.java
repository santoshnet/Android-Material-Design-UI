package com.santoshnet.materialdesignui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.santoshnet.materialdesignui.R;

public class SplashScreen2Activity extends AppCompatActivity {
    private int progressStatus = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);


        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        final TextView tv = (TextView) findViewById(R.id.tv);
        final ProgressBar pb = (ProgressBar) findViewById(R.id.pb);

        progressStatus = 0;

        // Start the lengthy operation in a background thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus < 100) {
                    // Update the progress status
                    progressStatus += 1;

                    // Try to sleep the thread for 20 milliseconds
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // Update the progress bar
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            pb.setProgress(progressStatus);
                            // Show the progress on TextView
                            tv.setText(progressStatus + "");
                            // If task execution completed
                            if (progressStatus == 80) {
                                // Set a message of completion
                                //  startActivity(new Intent(getApplicationContext(), SplashScreen2Activity.class));
                            }
                        }
                    });
                }
            }
        }).start(); // Start the operation
    }
}
