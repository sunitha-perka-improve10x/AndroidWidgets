package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import com.improve10x.androidwidgets.databinding.ActivitySeekBarBinding;

public class SeekBarActivity extends AppCompatActivity {

    ActivitySeekBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeekBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Seekbar");
        handleButton();
    }

    private void handleButton() {
    binding.seekBarBr.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            Toast.makeText(SeekBarActivity.this, "SeeBar.progress' "+i, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            Toast.makeText(SeekBarActivity.this, "SeeBar Stared!", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            Toast.makeText(SeekBarActivity.this, "SeeBar Stopped!", Toast.LENGTH_SHORT).show();
        }
    });

    }
}