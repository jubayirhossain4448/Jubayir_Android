package com.jubayir;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginBtn, logoutBtn;
    private TextView textView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        logoutBtn = findViewById(R.id.logoutBtn);
        textView = findViewById(R.id.textView);


        loginBtn.setOnClickListener(this);
        logoutBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.loginBtn){
            textView.setText("Login Button is Clicked ");
        }
        if (v.getId()== R.id.logoutBtn)
        textView.setText("Logout Button is Clicked ");
    }
}
