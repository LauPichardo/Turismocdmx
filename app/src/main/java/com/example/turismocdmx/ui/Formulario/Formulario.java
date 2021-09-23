package com.example.turismocdmx.ui.Formulario;

import androidx.core.content.FileProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.turismocdmx.R;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formulario extends Fragment {
    ImageView foto;
    String imagen="", currentPhotoPath;
    Uri photoURI;
    final int Photo =1;

    private FormularioViewModel mViewModel;

    public static Formulario newInstance() {
        return new Formulario();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.formulario_fragment, container, false);

        foto= root.findViewById(R.id.ivFotoCrear);
        foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File photoFile = null;
                try {
                    photoFile = createImageFile(photoFile);
                } catch (IOException e) {
                  //  e.setStackTrace();
                    Toast.makeText(getContext(), "Ocurrio un error mientras se generaba el archivo", Toast.LENGTH_SHORT).show();
                }

                if (photoFile != null)
                {
                    photoURI = FileProvider.getUriForFile(getContext(), "com.example.turismocdmx",photoFile);
                    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
                    startActivityForResult(takePictureIntent, 0);
                }
            }
        });

        return root;
    }

    private File createImageFile(File f) throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "img" + timeStamp + "_";
        File storageDir = getActivity().getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        f = File.createTempFile(
                imageFileName,  /* prefix */
                ".jpg",         /* suffix */
                storageDir      /* directory */
        );

        // Save a file: path for use with ACTION_VIEW intents
        currentPhotoPath = f.getAbsolutePath();
        return f;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        foto.setImageURI(photoURI);
        imagen = currentPhotoPath;
        Toast.makeText(getContext(), "Foto guardada en " + imagen, Toast.LENGTH_SHORT).show();

    }




}
