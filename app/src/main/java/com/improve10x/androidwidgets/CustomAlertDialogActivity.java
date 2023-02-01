package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

import com.improve10x.androidwidgets.databinding.ActivityCustomAlertDialogAcivityBinding;
import com.improve10x.androidwidgets.databinding.CustomAlertDialogItemBinding;

public class CustomAlertDialogActivity extends AppCompatActivity {

    private ActivityCustomAlertDialogAcivityBinding binding;
    private Dialog dialog;
    private CustomAlertDialogItemBinding customAlertDialogIemBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Custom Alert Dialog");
        binding = ActivityCustomAlertDialogAcivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleAlertClick();

    }

    private void handleAlertClick() {
        binding.alertBtn.setOnClickListener(view -> {
            dialog = new Dialog(this);
            customAlertDialogIemBinding = CustomAlertDialogItemBinding.inflate(getLayoutInflater());
            dialog.setContentView(customAlertDialogIemBinding.getRoot());
            customAlertDialogIemBinding.dismissBtn.setOnClickListener(view1 -> {
                finish();
            });
            customAlertDialogIemBinding.closeButtonIb.setOnClickListener(view1 -> {
                dialog.dismiss();
            });
            customAlertDialogIemBinding.alertMessageTxt.setText("Alert...!!!");
            dialog.show();
        });

    }
}