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
public class SecondFragment extends Fragment {

    Button btnGoBackHome;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        btnGoBackHome = (Button) view.findViewById(R.id.btnGoBackHome);

        btnGoBackHome.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Replace the Home fragment with the First Fragment

                Main2Activity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new HomeFragment(), null).addToBackStack(null).commit();
                //addToBackStack() is responsible for back to the previuos fragment

            }
        });

        return view;
    }

}
