package com.example.turismocdmx.ui.Internet;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.turismocdmx.R;

public class Internet extends Fragment {
    private WebView webviu;
    private InternetViewModel mViewModel;

    public static Internet newInstance() {
        return new Internet();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {

        mViewModel =
                ViewModelProviders.of(this).get(InternetViewModel.class);
        View root= inflater.inflate(R.layout.internet_fragment, container, false);

        webviu= root.findViewById(R.id.webviu);
        WebSettings config=webviu.getSettings();
        config.setJavaScriptEnabled(true);
        webviu.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        webviu.loadUrl("http://www.google.com");



        return root;
    }


}
