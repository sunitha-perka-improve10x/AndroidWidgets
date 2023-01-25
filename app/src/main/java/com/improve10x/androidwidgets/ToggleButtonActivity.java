package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {
    private ToggleButton toggle1Btn;
    private ToggleButton toggle2Btn;
   private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taggle_button);
        getSupportActionBar().setTitle("Toggle button");
        setupViews();
        handleAdd();
    }

    private void handleAdd() {
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("toggle1Btn:").append(toggle1Btn.getText());
                result.append("toggle2Btn:").append(toggle2Btn.getText());
                Toast.makeText(ToggleButtonActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void setupViews() {
        toggle1Btn = findViewById(R.id.toggle1_btn);
        toggle2Btn = findViewById(R.id.toggle2_btn);
        submitBtn = findViewById(R.id.submit_btn);
    }
}