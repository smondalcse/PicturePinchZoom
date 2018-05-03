package com.sanat.nitolniloy.picturepinchzoom;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class MainActivity extends AppCompatActivity {
    ImageView mIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mIcon = (ImageView) findViewById(R.id.ivIcon);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.off);
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(true);
        mIcon.setImageDrawable(mDrawable);

        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.off);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
    }

    public void OpenMain2Activity(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    public void OpenActivityToFragmentMsgSend(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityToFragment.class);
        startActivity(intent);
    }

    public void btnOpenFragmentToFragmentHomeActivity(View view) {
        Intent intent = new Intent(MainActivity.this, FragmentToFragmentHomeActivity.class);
        startActivity(intent);
    }
}
