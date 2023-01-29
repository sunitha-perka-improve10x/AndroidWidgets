package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.improve10x.androidwidgets.databinding.ActivitySpinnerBinding;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    private ActivitySpinnerBinding binding;
    private ArrayList<String> cities;
    private Spinner citiesSp;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySpinnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        spinnerCities();
    }

    private void spinnerCities() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities);
        binding.spinnerSp.setAdapter(arrayAdapter);
        binding.spinnerSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(SpinnerActivity.this, cities.get(position), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void setData() {
        cities = new ArrayList<>();
        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Bengaluru");
        cities.add("Pune");
        cities.add("Surat");
        cities.add("Amritsar");
        cities.add("Bhopal");
    }
}