package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SumActivity extends AppCompatActivity {
    private EditText firstNumberTxt;
    private EditText secondNumberTxt;
    private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        getSupportActionBar().setTitle("Sum of Two Numbers");
        setupViews();
        handleAdd();
    }

    private void setupViews() {
        firstNumberTxt = findViewById(R.id.firstnumber_text);
        secondNumberTxt = findViewById(R.id.secondnumber_txt);
        addBtn = findViewById(R.id.add_btn);
    }

    private void handleAdd() {
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNumber = firstNumberTxt.getText().toString();
                String secondNumber = secondNumberTxt.getText().toString();
                 int a = Integer.parseInt(firstNumber);
                 int b = Integer.parseInt(secondNumber);
                 int sum = a + b;
                Toast.makeText(SumActivity.this,String.valueOf(sum), Toast.LENGTH_SHORT).show();
            }
        });
    }
}