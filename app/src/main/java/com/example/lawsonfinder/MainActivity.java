package com.example.lawsonfinder;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


//    to-do: put these into a Button List
    Button locationBtn;
    Button lawsonBtn;
    Button notificationBtn;
    Button pontaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lawsonBtn = findViewById(R.id.lawson_btn);
        locationBtn = findViewById(R.id.location_btn);
        notificationBtn = findViewById(R.id.notifcation_btn);
        pontaBtn = findViewById(R.id.ponta_btn);

        setButtonBackground();

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

    private void setButtonBackground () {
//        loop and set color
        lawsonBtn.setBackgroundColor(Color.RED);
        locationBtn.setBackgroundColor(Color.BLUE);
        notificationBtn.setBackgroundColor(Color.GREEN);
        pontaBtn.setBackgroundColor(Color.YELLOW);
    }
}
