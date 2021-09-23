package com.example.turismocdmx.ui.Restaurantes;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.turismocdmx.R;

public class Restaurantes extends Fragment {

    private RestaurantesViewModel mViewModel;

    public static Restaurantes newInstance() {
        return new Restaurantes();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container,
                              Bundle savedInstanceState) {
        mViewModel =
                ViewModelProviders.of(this).get(RestaurantesViewModel.class);
        View root = inflater.inflate(R.layout.restaurantes_fragment, container, false);

        return  root;
    }

}
