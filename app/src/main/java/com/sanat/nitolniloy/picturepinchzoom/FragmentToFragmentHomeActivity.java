package com.sanat.nitolniloy.picturepinchzoom;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentToFragmentHomeActivity extends AppCompatActivity implements f_f_data_send_Fragment.OnMessageReadListener_ff {
    public static FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_to_fragment_home);

        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.fragment_to_fragment_container_SendSection) != null)
        {
            if(savedInstanceState != null)
            {
                return;
            }

            f_f_data_send_Fragment f_f_data_send_Fragment = new f_f_data_send_Fragment();

            // Add a freagment to Activity
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragment_to_fragment_container_SendSection, f_f_data_send_Fragment, null);
            fragmentTransaction.commit();

        }
    }

    @Override
    public void OnMessageRead_send(String message) {
        F_F_Data_Display_Fragment f_f_data_display_fragment = new F_F_Data_Display_Fragment();

        Bundle bundle = new Bundle();
        bundle.putString("message", message);
        f_f_data_display_fragment.setArguments(bundle);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_to_fragment_container_SendSection, f_f_data_display_fragment, null);
        fragmentTransaction.addToBackStack(null).commit();
    }
}
