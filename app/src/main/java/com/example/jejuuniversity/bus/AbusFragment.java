package com.example.jejuuniversity.bus;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;
import com.example.jejuuniversity.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AbusFragment extends Fragment {


    public AbusFragment() {
        // Required empty public constructor
    }

    private ViewPager pager;
    private PagerSlidingTabStrip tabs;
    private  Fragment fragment1;
    private  Fragment fragment2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_abus, container, false);

        return view;
    }

}
