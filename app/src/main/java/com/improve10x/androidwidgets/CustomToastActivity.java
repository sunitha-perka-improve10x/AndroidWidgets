package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class CustomToastActivity extends AppCompatActivity {
    private Button showToastBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast2);
        getSupportActionBar().setTitle("Custom Toast");
        setUpViews();
        handleBtn();
        }

    private void handleBtn() {
        showToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }

            private void showToast() {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.activity_custom_toast,(ViewGroup) findViewById(R.id.linear_layout));

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });
    }

    private void setUpViews() {
        showToastBtn = findViewById(R.id.show_toast_btn);

    }
}