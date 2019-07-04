 package com.jubayir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    private Button loginBtn, logoutBtn;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.logingBtn);
        logoutBtn = findViewById(R.id.logoutBtn);


    }
}
