package com.developer.noticewise.noticewise;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Kamara Sekar on 3/29/2016.
 */

public class createNoticeFragment extends Fragment {

    public createNoticeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)

    {

        //Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.create_notice_layout, container, false);
//        return inflater.inflate(
//                R.layout.create_notice_layout, container, false);
//

        Button submitButton = (Button) rootView.findViewById(R.id.buttoncreatenotice);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }


        });
    return rootView;

    }

}