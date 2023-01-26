package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class RadioButtonActivity extends AppCompatActivity {
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private Button showButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        getSupportActionBar().setTitle("Radio Button");
        SetUpViews();
    }

    private void SetUpViews() {
        radioButton1 = findViewById(R.id.radioButton1_btn);
        radioButton2 = findViewById(R.id.radiobutton2_btn);
        showButton = findViewById(R.id.showbutton_btn);
    }

}