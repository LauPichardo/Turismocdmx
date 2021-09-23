package com.example.turismocdmx.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.turismocdmx.R;
import com.example.turismocdmx.ui.home.nevado;

public class GalleryFragment extends Fragment {


    private GalleryViewModel galleryViewModel;

    ImageView centro, historia, acuarela, cosmoo, video;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        //final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
             //   textView.setText(s);
            }
        });

        //video= root.findViewById(R.id.elvidio);
        //String pathvidio= "android.resource://" + getP + "/" + R.raw.videomuseum;

        centro= root.findViewById(R.id.centro);
        centro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), Centro.class);
                startActivityForResult(inte, 0);
            }
        });

        historia= root.findViewById(R.id.historia);
        historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), historiaa.class);
                startActivityForResult(inte, 0);
            }
        });

        acuarela= root.findViewById(R.id.acuarela);
        acuarela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), Acuarela.class);
                startActivityForResult(inte, 0);
            }
        });

        cosmoo= root.findViewById(R.id.cosmo);
        cosmoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), Cosmoo.class);
                startActivityForResult(inte, 0);
            }
        });

        video = root.findViewById(R.id.collagevidio);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), video.class);
                startActivityForResult(intent, 0);
            }
        });

        return root;
    }
}
