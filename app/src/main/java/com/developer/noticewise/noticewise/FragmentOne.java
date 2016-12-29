package com.developer.noticewise.noticewise;

/**
 * Created by Kamara Sekar on 3/29/2016.
 */
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {

    public FragmentOne(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment
        System.out.println("-+++++++++++++++++++++");
        return inflater.inflate(
                R.layout.home_layout, container, false);
    }
}