package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.androidwidgets.databinding.ActivityAlertDialogBinding;

public class AlertDialogActivity extends AppCompatActivity {
    private ActivityAlertDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_alert_dialog);
        getSupportActionBar().setTitle("AlertDialog");
    }
}