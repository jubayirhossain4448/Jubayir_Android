package com.jubayir.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton maleRBtn, femaleRBtn;
    private Button showBtn;
    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        radioGroup = findViewById(R.id.radionGroup);
        showBtn = findViewById(R.id.showBtn);
        resultTV = findViewById(R.id.resultTV);
    }
}
