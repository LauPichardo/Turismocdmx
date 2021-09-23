package com.example.turismocdmx.ui.slideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.turismocdmx.R;

public class Porton extends AppCompatActivity {
    ImageView porton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porton);

        porton= findViewById(R.id.imagegps);
        porton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent(getApplicationContext(), MapsPorton.class);
                startActivity(inte);
            }
        });

    }
}
