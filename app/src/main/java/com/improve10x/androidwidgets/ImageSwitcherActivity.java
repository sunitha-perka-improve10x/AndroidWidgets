package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.androidwidgets.databinding.ActivityImageSwitcherBinding;

public class ImageSwitcherActivity extends AppCompatActivity {

    ActivityImageSwitcherBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSwitcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}