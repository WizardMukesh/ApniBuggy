package com.example.sonu.burgerbuggy.fragments;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sonu.burgerbuggy.R;
import com.example.sonu.burgerbuggy.adapter.CategoryAdapter;
import com.example.sonu.burgerbuggy.model.Category;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment {
    private ListView listView;
    private ArrayList<Category> arrayList;
    private CategoryAdapter categoryAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_home, container, false);
        listView = (ListView)view.findViewById(R.id.list_view_home);
        arrayList = new ArrayList<>();
        Category category = new Category();
        category.setCategoryName("pizza");
        Category category1 = new Category();
        category1.setCategoryName("Samosa");
        Category category2 = new Category();
        category2.setCategoryName("Burger");
        Category category3 = new Category();
        category3.setCategoryName("MoMos");
        arrayList.add(category);
        arrayList.add(category1);
        arrayList.add(category2);
        arrayList.add(category3);

        CategoryAdapter categoryAdapter = new CategoryAdapter(getActivity(),R.layout.row_category,arrayList);
        listView.setAdapter(categoryAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fragment fragment = new FragmentProductList();

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_main, fragment);
                fragmentTransaction.addToBackStack("null");
                fragmentTransaction.commit();

            }
        });
        return view;
    }

}
