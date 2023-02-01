package com.improve10x.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Toast;

import com.improve10x.androidwidgets.databinding.ActivitySearchViewBinding;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity {

    private ActivitySearchViewBinding binding;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewBinding.inflate(getLayoutInflater());
        getSupportActionBar().setTitle("Search View");
        setContentView(binding.getRoot());
        setData();
        handleSearchView();
    }

    private void handleSearchView() {
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        binding.listLv.setAdapter(adapter);
        binding.searchViewSv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (list.contains(query)) {
                    adapter.getFilter().filter(query);
                } else {
                    Toast.makeText(SearchViewActivity.this, "No Match Found", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String list) {
                return false;
            }
        });
    }
    private void setData() {
        list = new ArrayList<>();
        list.add("Monkey");
        list.add("rat");
        list.add("cat");
        list.add("tiger");
        list.add("lion");
        list.add("deer");
        list.add("elephant");
        list.add("cheetah");
        list.add("Zebra");
        list.add("giraffee");
        list.add("camel");
        list.add("hippopotamus");
        list.add("rhinoceros");
    }
}
