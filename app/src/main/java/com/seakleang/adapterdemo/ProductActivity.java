package com.seakleang.adapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.seakleang.adapterdemo.Entity.Product;
import com.seakleang.adapterdemo.adapter.GridViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    GridView gridView;
    List<Product> products = new ArrayList<>();
    GridViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        gridView=findViewById(R.id.gridView);
        setupUI();
        //create product
        getData();
    }

    private void setupUI(){
        adapter = new GridViewAdapter(products);
        gridView.setAdapter(adapter);
    }

    private void getData(){
        for(int i=0;i<50;i++){
            this.products.add(new Product("75","https://pcbonlineshop.com/photos/product/4/176/4.jpg"));
        }
    }
}
