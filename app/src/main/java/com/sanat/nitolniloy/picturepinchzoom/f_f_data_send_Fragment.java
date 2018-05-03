package com.sanat.nitolniloy.picturepinchzoom;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class f_f_data_send_Fragment extends Fragment {

    EditText txtMsgInput_send;
    Button btnSend_Test;

    OnMessageReadListener_ff OnMessageReadListener_ff;

    public f_f_data_send_Fragment() {
        // Required empty public constructor
    }

    public interface OnMessageReadListener_ff
    {
        public void OnMessageRead_send(String message);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_f_f_data_send, container, false);

        txtMsgInput_send = (EditText) view.findViewById(R.id.txtMsgInput_send);
        btnSend_Test = (Button) view.findViewById(R.id.btnSend_Test);
        btnSend_Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = txtMsgInput_send.getText().toString();
                OnMessageReadListener_ff.OnMessageRead_send(inputText);
            }
        });

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;

        try {
            OnMessageReadListener_ff = (OnMessageReadListener_ff) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + "Must Override OnMessageRead...");
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        txtMsgInput_send.setText("");
    }
}
