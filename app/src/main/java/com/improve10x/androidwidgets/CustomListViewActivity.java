package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.androidwidgets.databinding.ActivityCustomListViewBinding;

public class CustomListViewActivity extends AppCompatActivity {
    private ActivityCustomListViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityCustomListViewBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }
}