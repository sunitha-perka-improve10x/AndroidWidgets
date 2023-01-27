package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.improve10x.androidwidgets.databinding.ActivityTimePickerBinding;

public class TimePickerActivity extends AppCompatActivity {

    ActivityTimePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleTime();
    }

    private void handleTime() {
    binding.changetimeBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.currentTimeTxt.setText("getCurrentTime()");
        }

        private String getCurrentTime() {
            String currentTime = "Current Time : "+ binding.timePickerTp.getCurrentHour() + ":" + binding.timePickerTp.getCurrentMinute();
            return currentTime;
        }
    });
    }
}