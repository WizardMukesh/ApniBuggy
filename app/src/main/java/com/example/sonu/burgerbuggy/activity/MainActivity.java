package com.example.sonu.burgerbuggy.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sonu.burgerbuggy.R;
import com.example.sonu.burgerbuggy.adapter.CategoryAdapter;
import com.example.sonu.burgerbuggy.adapter.ProductAdapter;
import com.example.sonu.burgerbuggy.model.Category;
import com.example.sonu.burgerbuggy.model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCategory = (ListView) findViewById(R.id.list_category);
        listCategory.setAdapter(new ProductAdapter(MainActivity.this, R.layout.row_category, new ArrayList<Product>()));

        listCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(MainActivity.this, ProductActivity.class));
            }
        });
    }
}
