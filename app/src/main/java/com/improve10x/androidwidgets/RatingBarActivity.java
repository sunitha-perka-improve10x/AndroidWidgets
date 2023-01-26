package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.androidwidgets.databinding.ActivityRatingBarBinding;

public class RatingBarActivity extends AppCompatActivity {

    ActivityRatingBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRatingBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Ratingbar");
        handleButton();
    }

    private void handleButton() {
        binding.submitBtn.setOnClickListener(view -> {
            String rating = String.valueOf(binding.ratingbarRb.getRating());
            Toast.makeText(this, rating, Toast.LENGTH_LONG).show();
        });
    }
}