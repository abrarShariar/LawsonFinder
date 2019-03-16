package com.example.lawsonfinder;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


//    to-do: put these into a Button List
    ImageButton locationBtn;
    ImageButton lawsonBtn;
    ImageButton notificationBtn;
    ImageButton pontaBtn;

    Activity self = this;

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

//        start new activity when location btn clicked
            locationBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("onClick", "Start location activity");
                    Intent intent = new Intent(self, MapsActivity.class);
                    startActivity(intent);
                }
            });

    }

    private void setButtonBackground () {
//        loop and set color
//        lawsonBtn.setBackgroundColor(Color.RED);
//        locationBtn.setBackgroundColor(Color.BLUE);
//        notificationBtn.setBackgroundColor(Color.GREEN);
//        pontaBtn.setBackgroundColor(Colo r.YELLOW);

        lawsonBtn.setBackgroundColor(Color.BLACK);
        locationBtn.setBackgroundColor(Color.WHITE);
        notificationBtn.setBackgroundColor(Color.WHITE);
        pontaBtn.setBackgroundColor(Color.BLACK);


    }
}
