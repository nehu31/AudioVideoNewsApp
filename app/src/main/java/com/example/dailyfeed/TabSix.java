package com.example.dailyfeed;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import static com.example.dailyfeed.R.raw.aa;

public class TabSix extends Fragment {
   VideoView view;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_6, container, false);

        MediaController mc= new MediaController(getActivity());

        VideoView view = (VideoView)rootView.findViewById(R.id.video);
        String path = "android.resource://" + getActivity().getPackageName() + "/" +R.raw.shark;
        view.setVideoURI(Uri.parse(path));
        view.setMediaController(mc);
        view.start();


        return rootView;
    }
}