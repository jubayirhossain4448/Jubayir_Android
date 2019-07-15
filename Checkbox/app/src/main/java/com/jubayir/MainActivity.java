package com.jubayir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox milkChe, sugarChe, waterChe;
    private Button showBtn;
    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkChe = findViewById(R.id.milkChk);
        sugarChe = findViewById(R.id.sugarChk);
        waterChe = findViewById(R.id.waterChk);

        showBtn = findViewById(R.id.showBtn);
        resultTV = findViewById(R.id.resultTV);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if (milkChe.isChecked()){
                    String value = milkChe.getText().toString();
                    stringBuilder.append(value + "Is ordered " + "\n");
                }
                if (sugarChe.isChecked()){
                    String value = sugarChe.getText().toString();
                    stringBuilder.append(value + "Is ordered " + "\n");
                }
                if (waterChe.isChecked()){
                    String value = waterChe.getText().toString();
                    stringBuilder.append(value + "Is ordered  " + "\n");
                }
                resultTV.setText(stringBuilder);
            }
        });
     }
}
