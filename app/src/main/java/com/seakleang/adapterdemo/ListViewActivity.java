package com.seakleang.adapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    String[] phonelist = {"012345189","0962696645","092468368","017345578","012345189","0962696645",
                            "092468368","017345578","012345189","0962696645","092468368","017345578",
                            "012345189","0962696645","092468368","017345578"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listview);

        /*ArrayAdapter<String> adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                phonelist
        );*/

        //Create item layout
        ArrayAdapter<String> costomLayoutAdapter = new ArrayAdapter(
                this,
                R.layout.phone_item_layout,
                R.id.text1,
                phonelist
        );

        //Set adapter
        //listView.setAdapter(adapter);
        listView.setAdapter(costomLayoutAdapter);
        listView.setOnItemClickListener((parent,view,position,id)->{
            Toast.makeText(this, phonelist[position], Toast.LENGTH_SHORT).show();
        });
    }
}
