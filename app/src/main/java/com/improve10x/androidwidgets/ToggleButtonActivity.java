package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.improve10x.androidwidgets.databinding.ActivityTaggleButtonBinding;

public class ToggleButtonActivity extends AppCompatActivity {

    private ActivityTaggleButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTaggleButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Toggle button");
        handleAdd();
    }
    //UseInterface
    
    private void handleAdd() {
        binding.submitBtn.setOnClickListener(view -> {
            String toggle1 = binding.toggle1Btn.getText().toString();
            String toggle2 = binding.toggle2Btn.getText().toString();
            String result = getData(toggle1, toggle2);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }
    //BusinessLogic

    private String getData(String toggle1, String toggle2) {
        String button1 = "Button : " + toggle1;
        String button2 = "Button : " + toggle2;
        String result = button1 += button2;
        return result;
    }
}