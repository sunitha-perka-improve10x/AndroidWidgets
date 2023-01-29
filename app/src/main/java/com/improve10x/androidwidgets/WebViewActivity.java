package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.improve10x.androidwidgets.databinding.ActivityWebViewBinding;

public class WebViewActivity extends AppCompatActivity {
    private ActivityWebViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Web View");
        setWebView();
    }

    private void setWebView() {
        WebView myWebView = (WebView) binding.webView;
        myWebView.loadUrl("file:///android_asset/myresource.html");
    }
}