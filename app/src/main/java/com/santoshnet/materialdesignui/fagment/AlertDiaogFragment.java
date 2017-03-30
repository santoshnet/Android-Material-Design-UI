package com.santoshnet.materialdesignui.fagment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.santoshnet.materialdesignui.R;

/**
 * Created by anupamchugh on 10/12/15.
 */
public class AlertDiaogFragment extends Fragment {

    public AlertDiaogFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_table, container, false);

        return rootView;
    }

}
