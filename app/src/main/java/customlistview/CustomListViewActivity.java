package customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.androidwidgets.R;
import com.improve10x.androidwidgets.databinding.ActivityCustomListViewBinding;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {
    private ActivityCustomListViewBinding binding;
    private ArrayList<CustomList> listLv;
    private CustomListViewAdapter customListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityCustomListViewBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Custom List View");
        setData();
        customListView();

    }

    private void setData() {
        listLv = new ArrayList<>();
        CustomList title = new CustomList();
        title.imageUrl = "https://cdn4.iconfinder.com/data/icons/iconsimple-logotypes/512/github-96.png";
        title.title = "kjbfk jafn";
        title.subTitle = "Pavan Kalyan Only Hero";
        listLv.add(title);
    }

    private void customListView() {
        customListViewAdapter = new CustomListViewAdapter(this, R.layout.custom_list_view_item, listLv);
        binding.customListLv.setAdapter(customListViewAdapter);

    }
}