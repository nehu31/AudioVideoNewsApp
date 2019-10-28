package com.example.dailyfeed;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import java.io.ByteArrayOutputStream;

import static com.example.dailyfeed.R.raw.aa;

public class TabFive extends Fragment {
    MediaPlayer mp;
   ImageButton button1,button2;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_5, container, false);
        button1 = rootView.findViewById(R.id.btn1);
button2=rootView.findViewById(R.id.btn2);


       mp=MediaPlayer.create(getContext(), aa);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            mp.start();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });


        return rootView;

    }
}