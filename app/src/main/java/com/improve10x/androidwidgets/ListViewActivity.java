package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.improve10x.androidwidgets.databinding.ActivityListViewBinding;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    private ActivityListViewBinding binding;
    private ArrayList<String> names;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("List View");
        setData();
        handleListView();
    }

    private void setData() {
    names = new ArrayList<>();
    names.add("hareesh");
    names.add("vedhu");
    names.add("sumanth");
    names.add("anupama");
    names.add("pullaiah");
    names.add("raghu");
    names.add("manoj");
    names.add("rajesh");
    names.add("Om");
    names.add("suresh");
    names.add("hareesh");
    names.add("vedhu");
    names.add("sumanth");
    names.add("anupama");
    names.add("pullaiah");
    names.add("raghu");
    names.add("manoj");
    names.add("rajesh");
    names.add("Om");
    names.add("suresh");
    }

    private void handleListView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
        binding.namesLv.setAdapter(arrayAdapter);
        binding.namesLv.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, String.valueOf(names.get(position)), Toast.LENGTH_SHORT).show();
        });
    }
}