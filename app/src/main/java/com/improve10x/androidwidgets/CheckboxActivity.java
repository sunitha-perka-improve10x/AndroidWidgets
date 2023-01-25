package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckboxActivity extends AppCompatActivity {
    private CheckBox pizzaCb;
    private CheckBox coffeeCb;
    private CheckBox burgerCb;
    private Button orderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        getSupportActionBar().setTitle("Checkbox");
        setupViews();
        handleBtn();
    }

    private void handleBtn() {
        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void setupViews() {
        pizzaCb = findViewById(R.id.pizza_cb);
        coffeeCb = findViewById(R.id.coffee_cb);
        burgerCb = findViewById(R.id.burger_cb);
        orderBtn = findViewById(R.id.order_btn);

    }

}