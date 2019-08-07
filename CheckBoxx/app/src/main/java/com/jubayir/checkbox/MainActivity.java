package com.jubayir.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox mailCH, sugarCH, waterCH;
    private Button showBtn;
    private TextView resultV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
            }
        });

    }

    private void init() {
        mailCH = findViewById(R.id.milkCB);
        sugarCH = findViewById(R.id.sugerCB);
        waterCH = findViewById(R.id.waterCB);

        showBtn = findViewById(R.id.showBtn);
        resultV = findViewById(R.id.resultV);
    }
}
