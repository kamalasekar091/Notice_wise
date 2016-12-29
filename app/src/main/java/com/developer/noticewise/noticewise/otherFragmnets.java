package com.developer.noticewise.noticewise;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamara Sekar on 3/30/2016.
 */


public class otherFragmnets extends Fragment {

    public otherFragmnets(){



    }
    ListView lv;
    String[] values;
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)

    {

        View rootView = inflater.inflate(R.layout.other_layout, container, false);

        lv = (ListView) rootView.findViewById(R.id.listView);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List<String> lst = new ArrayList<String>();
        for(int i = 1; i <= 10; i++) {
            lst.add("Other Posting"+i);
        }

        ArrayAdapter<String> ArAd = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, lst);
        lv.setAdapter(ArAd);

    }

}