package com.example.pethealth.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pethealth.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricoFragment extends Fragment {


    public HistoricoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_historico, container, false);

        return view;
    }

    public static HistoricoFragment newInstance() {
        HistoricoFragment fragment = new HistoricoFragment();
        return fragment;
    }

}
