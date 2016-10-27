package com.example.android.cetscoreboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);



        Button button = (Button) findViewById(R.id.teamButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(UpdateActivity.this, UpdateScoreActivity.class);
                startActivity(intent);
                EditText e = (EditText) findViewById(R.id.teamA_id);
                String s = e.getText().toString();
                EditText ex = (EditText) findViewById(R.id.teamB_id);
                String sx = ex.getText().toString();
                intent.putExtra("abc",s);
                intent.putExtra("efg",sx);
                startActivity(intent);
            }
        });
    }

}
