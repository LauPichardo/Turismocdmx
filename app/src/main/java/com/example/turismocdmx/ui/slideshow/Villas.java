package com.example.turismocdmx.ui.slideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.turismocdmx.R;
import com.example.turismocdmx.ui.gallery.MapsAcuarela;

public class Villas extends AppCompatActivity {
    ImageView imaggps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villas);

        imaggps= findViewById(R.id.imagegps);
        imaggps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent(getApplicationContext(), MapsVillas.class);
                startActivity(inte);
            }
        });
    }
}
