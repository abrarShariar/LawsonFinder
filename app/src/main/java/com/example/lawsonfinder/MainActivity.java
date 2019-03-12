package com.example.lawsonfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        show an array list of data in the view
        ArrayList locationList = new ArrayList<String>();
        locationList.add("Bakurokoyama");
        locationList.add("Shibuya");

        
    }
}
