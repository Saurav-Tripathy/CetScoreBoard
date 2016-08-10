package com.example.android.cetscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();  // to hide the action bar
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
