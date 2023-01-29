package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.improve10x.androidwidgets.databinding.ActivityRatingBarBinding;

public class RadioButtonActivity extends AppCompatActivity {

    private ActivityRatingBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRatingBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Radio Button");
        handleSelectedButton();
    }

    private void handleSelectedButton() {

    }
}