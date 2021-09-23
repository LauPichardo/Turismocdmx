package com.example.turismocdmx.ui.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.example.turismocdmx.R;
import com.example.turismocdmx.ui.home.mapsMali;

public class Centro extends AppCompatActivity {
    ImageView imaggps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro);

        VideoView video= findViewById(R.id.elvidio);
        String pathvidio= "android.resource://" + getPackageName() + "/" + R.raw.videomuseum;

        imaggps= findViewById(R.id.imagegps);
        imaggps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent(getApplicationContext(), MapsCentro.class);
                startActivity(inte);
            }
        });
    }
}
