package com.example.android.cetscoreboard;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();  // to hide the action bar

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // UPDATER BUTTON IS LINKED TO LOGIN ACTIVITY
        Button b1 = (Button) findViewById(R.id.updater_button_id);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i1);
            }
        });
        // USER BUTTON IS LINKED TO LOGIN ACTIVITY
        Button b2 = (Button) findViewById(R.id.user_button_id);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,UserActivity.class);
                startActivity(i);


            }
        });
    }
}
