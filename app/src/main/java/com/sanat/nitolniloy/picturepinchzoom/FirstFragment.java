package com.sanat.nitolniloy.picturepinchzoom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    Button btnOpenSecFragment;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        btnOpenSecFragment = (Button) view.findViewById(R.id.openSecFragment);

        btnOpenSecFragment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Replace the Home fragment with the First Fragment

                Main2Activity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new SecondFragment(), null).addToBackStack(null).commit();

            }
        });

        return view;
    }

}
