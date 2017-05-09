package com.santoshnet.materialdesignui.fagment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.santoshnet.materialdesignui.R;

/**
 * Created by anupamchugh on 10/12/15.
 */
public class SplashScreenFragment extends Fragment {
    ProgressBar bar;
    TextView txt;
    int total = 0;
    boolean isRunning = false;
    private int progressStatus = 0;
    private Handler handler = new Handler();

    public SplashScreenFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_splash_screen, container, false);


        bar = (ProgressBar) rootView.findViewById(R.id.ProgressBar1);
        txt = (TextView) rootView.findViewById(R.id.txtrere);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus < 100) {
                    // Update the progress status
                    progressStatus += 1;

                    // Try to sleep the thread for 20 milliseconds
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // Update the progress bar
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            bar.setProgress(progressStatus);
                            // Show the progress on TextView
                            txt.setText("Loading..." + progressStatus + "");
                            if (progressStatus == 100) {
                                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                                ft.replace(R.id.content_frame, new SplashScreen2Fragment());
                                ft.addToBackStack(null);
                                ft.commit();

                            }
                        }
                    });
                }
            }
        }).start(); // Start the operation

        return rootView;
    }

}
