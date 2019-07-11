package com.jubayir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button loginBtn, logoutBtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        logoutBtn = findViewById(R.id.logoutBtn);
        textView = findViewById(R.id.textView);
    }

    public void loginMessage(View v) {

            Log.d("tag", "Login Button is clicked"); // tag == key, msg = value
    }

    public void logoutMessage(View view) {
        Log.d("tag", "Logout Button is clicked"); // tag == key, msg = value
    }
}
