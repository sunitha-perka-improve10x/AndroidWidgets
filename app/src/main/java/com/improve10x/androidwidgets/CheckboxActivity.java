package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

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
                int totalAmount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Select Items");
                if (pizzaCb.isChecked()) {
                    result.append("\tPizza 180Rs");
                    totalAmount +=180;
                }
                if(coffeeCb.isChecked()) {
                    result.append("\tCoffee 200Rs");
                    totalAmount +=200;
                }
                if(burgerCb.isChecked()) {
                    result.append("\tBurger 150Rs");
                    totalAmount +=150;
                }
                result.append("\tTotal:"+totalAmount+"Rs");
                Toast.makeText(CheckboxActivity.this, result.toString(), Toast.LENGTH_LONG).show();
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