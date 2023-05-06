package com.letronghieu.customspinner;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CategoryApdapter categoryApdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinCategory = findViewById(R.id.spinner);
        categoryApdapter  = new CategoryApdapter(this, R.layout.item_select,getListCategory());
        spinCategory.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(MainActivity.this,categoryApdapter.getItem(i).getName(),Toast.LENGTH_SHORT).show());
    }
    private List<Category> getListCategory(){
        List<Category> list = new ArrayList<>();
        list.add(new Category("Ăn sáng"));
        list.add(new Category("Ăn trưa"));
        list.add(new Category("Ăn tối"));
        return list;
    }
}