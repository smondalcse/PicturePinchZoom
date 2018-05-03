package com.sanat.nitolniloy.picturepinchzoom;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ContentFrameLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MessageFragment extends Fragment {

    EditText txtMsgInput;
    Button btnSend;

    OnMessageReadListener onMessageReadListener;

    public MessageFragment() {
    }

    public interface OnMessageReadListener
    {
        public void OnMessageRead(String message);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        txtMsgInput = (EditText) view.findViewById(R.id.txtMsgInput);
        btnSend = (Button) view.findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = txtMsgInput.getText().toString();
                onMessageReadListener.OnMessageRead(inputText);
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;

        try {
            onMessageReadListener = (OnMessageReadListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + "Must Override OnMessageRead...");
        }
    }
}
