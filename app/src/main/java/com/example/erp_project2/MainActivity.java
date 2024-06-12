package com.example.erp_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.erp_project2.Data.sharedPrefrence;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPrefrence.init(this);
//        sharedPrefrence.setUserHistoryGoing(null);
//        sharedPrefrence.setUserHistoryBack(null);
////        sharedPrefrence.setUserDestPoint(null);
////        sharedPrefrence.setUserStartingPoint(null);

    }

}