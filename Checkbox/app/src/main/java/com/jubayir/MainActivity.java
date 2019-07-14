package com.jubayir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    private CheckBox milkChe, sugarChe, waterChe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkChe = findViewById(R.id.milkChk);
        sugarChe = findViewById(R.id.sugarChk);
        waterChe = findViewById(R.id.waterChk);
     }
}
