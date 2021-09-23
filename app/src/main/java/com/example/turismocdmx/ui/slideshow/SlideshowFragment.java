package com.example.turismocdmx.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.turismocdmx.R;
import com.example.turismocdmx.ui.gallery.Cosmoo;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    ImageView villasteo, martin, porton, kaia;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        //final TextView textView = root.findViewById(R.id.text_slideshow);
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               // textView.setText(s);
            }
        });

        villasteo= root.findViewById(R.id.vilas);
        villasteo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), Villas.class);
                startActivityForResult(inte, 0);
            }
        });

        martin= root.findViewById(R.id.snmartin);
        martin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), sanmartin.class);
                startActivityForResult(inte, 0);
            }
        });
        porton= root.findViewById(R.id.porton);
        porton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), Porton.class);
                startActivityForResult(inte, 0);
            }
        });
        kaia= root.findViewById(R.id.kaia);
        kaia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent (v.getContext(), KaiaSuites.class);
                startActivityForResult(inte, 0);
            }
        });

        return root;
    }
}
