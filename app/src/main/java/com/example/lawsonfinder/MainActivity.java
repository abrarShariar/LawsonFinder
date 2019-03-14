package com.example.lawsonfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        make the listView appear inside the bottom navigation view

//        ListView locationListView = (ListView) findViewById(R.id.locationListView);
//        // show an array list of data in the view
//        ArrayList<String> locationList = new ArrayList<String>();
//        locationList.add("Bakurokoyama");
//        locationList.add("Shibuya");
//
//        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, locationList);
//        locationListView.setAdapter(mArrayAdapter);
    }
}
