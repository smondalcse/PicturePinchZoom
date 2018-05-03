package com.sanat.nitolniloy.picturepinchzoom;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F_F_Data_Display_Fragment extends Fragment {

    TextView txtdis;

    public F_F_Data_Display_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_f__f__data__display, container, false);

        txtdis = (TextView) view.findViewById(R.id.txtsendDisMsg);
        Bundle bundle = getArguments();
        String mess = bundle.getString("message");
        txtdis.setText(mess);

        return view;
    }

}
