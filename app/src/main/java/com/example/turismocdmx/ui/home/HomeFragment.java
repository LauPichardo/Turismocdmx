package com.example.turismocdmx.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.turismocdmx.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ImageView Teo;
    ImageView Valle;
    ImageView metepunk, malinal, ixtapan, nevado;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //final TextView textView = root.findViewById(R.id.text_home);

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               // textView.setText(s);
            }
        });

        Teo = root.findViewById(R.id.imageTeo);
        Teo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), Teotihuacan.class);
                startActivityForResult(inte, 0);
            }
        });

        Valle= root.findViewById(R.id.valle);
        Valle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), Valle_bravo.class);
                startActivityForResult(inte, 0);
            }
        });

        metepunk= root.findViewById(R.id.metepec);
        metepunk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), metepec.class);
                startActivityForResult(inte, 0);
            }
        });

        malinal= root.findViewById(R.id.malinalco);
        malinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), malinalco.class);
                startActivityForResult(inte, 0);
            }
        });

        ixtapan= root.findViewById(R.id.ixtapan);
        ixtapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), ixtapan.class);
                startActivityForResult(inte, 0);
            }
        });

        nevado= root.findViewById(R.id.nevado);
        nevado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), nevado.class);
                startActivityForResult(inte, 0);
            }
        });

        return root;

    }
}
