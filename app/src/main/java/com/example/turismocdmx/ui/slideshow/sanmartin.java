package com.example.turismocdmx.ui.slideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.turismocdmx.R;

public class sanmartin extends AppCompatActivity {

    ImageView martinsn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanmartin);

        martinsn= findViewById(R.id.imagegps);
        martinsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent(getApplicationContext(), MapsMartin.class);
                startActivity(inte);
            }
        });
    }
}
