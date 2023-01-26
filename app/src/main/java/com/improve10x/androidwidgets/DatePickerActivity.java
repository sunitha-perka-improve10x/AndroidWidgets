package com.improve10x.androidwidgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

import com.improve10x.androidwidgets.databinding.ActivityDatePickerBinding;

public class DatePickerActivity extends AppCompatActivity {
    ActivityDatePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("DatePicker");
        handleDate();
    }

    private void handleDate() {
        binding.changedateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.currentdateTxt.setText("Change Date : "+ getCurrentDate());
                binding.currentdateTxt.setText("Change Date : "+ getCurrentDate());
            }

            private String getCurrentDate() {
                StringBuilder builder = new StringBuilder();
                builder.append((binding.datePicker.getMonth() + 1) + "/");
                builder.append(binding.datePicker.getDayOfMonth() + "/");
                builder.append(binding.datePicker.getYear());
                return builder.toString();
            }
        });
    }
}
