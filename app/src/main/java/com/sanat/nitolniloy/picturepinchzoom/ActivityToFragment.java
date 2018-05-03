package com.sanat.nitolniloy.picturepinchzoom;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityToFragment extends AppCompatActivity implements MessageFragment.OnMessageReadListener {

    TextView txtDisplay;

    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_fragment);

        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.fragment_container_msg) != null)
        {
            if(savedInstanceState != null)
            {
                return;
            }

            MessageFragment messageFragment = new MessageFragment();

            // Add a freagment to Activity
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragment_container_msg, messageFragment, null);
            fragmentTransaction.commit();

        }

    }

    @Override
    public void OnMessageRead(String message) {
        txtDisplay = (TextView) findViewById(R.id.txtMsgDisplay);
        txtDisplay.setText(message);
    }
}
