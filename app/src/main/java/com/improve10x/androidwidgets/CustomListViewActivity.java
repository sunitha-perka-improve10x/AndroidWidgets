package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import com.improve10x.androidwidgets.databinding.ActivityCustomListViewBinding;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {
    private ActivityCustomListViewBinding binding;
    private ArrayList<String> imageUrl;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityCustomListViewBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Custom List View");
        handleCustomList();
    }

    private void handleCustomList() {


    }
}