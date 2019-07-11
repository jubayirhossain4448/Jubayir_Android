package com.jubayir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button toastBtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastBtn = findViewById(R.id.toastBtn);
        textView = findViewById(R.id.textView);

    }

    public void Toast_Message(View view) {
       Toast toast = Toast.makeText(MainActivity.this, "Toast Example is Shown", Toast.LENGTH_SHORT);
       toast.setGravity(Gravity.LEFT, 50, 25);
        toast.show();
    }
}
