package com.jubayir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    public void showMessage(View v){
        if (v.getId()==R.id.loginBtn){
            textView.setText("Login button is Clicked");
        }else if (v.getId()== R.id.logoutBtn){
            textView.setText("Logout button is Clicked");
        }
    }
}
