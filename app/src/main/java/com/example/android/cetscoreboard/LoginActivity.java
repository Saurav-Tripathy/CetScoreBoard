package com.example.android.cetscoreboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    final String username = "refName123";
    final String password = "basketball";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = (Button) findViewById(R.id.button);
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText uname = (EditText) findViewById(R.id.username_text_id);
                String user = uname.getText().toString();
                EditText upwd = (EditText) findViewById(R.id.password_text_id);
                String pass = upwd.getText().toString();

                if (user.equals(username) && pass.equals(password)){
                    Intent intent = new Intent(LoginActivity.this, UpdateActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid username/password", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
