package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.improve10x.androidwidgets.databinding.ActivityTimePickerBinding;

public class TimePickerActivity extends AppCompatActivity {

    ActivityTimePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_time_picker);
        handleTime();
    }

    private void handleTime() {

    }
}