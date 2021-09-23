package com.example.turismocdmx.ui.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.turismocdmx.R;

public class video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView video= findViewById(R.id.elvidio);
        String pathvidio= "android.resource://" + getPackageName() + "/" + R.raw.videomuseum;
        Uri uri= Uri.parse(pathvidio);
        video.setVideoURI(uri);

        MediaController mediaContro = new MediaController(this);
        video.setMediaController(mediaContro);
        mediaContro.setAnchorView(video);

    }
}
