package com.example.sonu.burgerbuggy.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sonu.burgerbuggy.R;
import com.example.sonu.burgerbuggy.adapter.CategoryAdapter;
import com.example.sonu.burgerbuggy.model.Category;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCategory = (ListView) findViewById(R.id.list_category);
        listCategory.setAdapter(new CategoryAdapter(MainActivity.this, R.layout.row_category, new ArrayList<Category>()));
    }
}
