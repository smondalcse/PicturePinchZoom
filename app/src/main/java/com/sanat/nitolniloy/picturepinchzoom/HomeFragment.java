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
public class HomeFragment extends Fragment {

    Button btnOpenFirst;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btnOpenFirst = (Button) view.findViewById(R.id.btnOpenFirst);

        btnOpenFirst.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // Replace the Home fragment with the First Fragment
                Main2Activity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new FirstFragment(), null).addToBackStack(null).commit();

            }
        });

        return view;
    }

}
