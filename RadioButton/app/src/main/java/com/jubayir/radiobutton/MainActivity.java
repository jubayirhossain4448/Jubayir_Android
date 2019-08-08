package com.jubayir.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton maleRBtn, femaleRBtn;
    private RadioButton gender;
    private Button showBtn;
    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectId = radioGroup.getCheckedRadioButtonId();
                gender = findViewById(selectId);

                String value = gender.getText().toString();
                resultTV.setText("You have selected : " + value);
            }
        });
    }

    private void init() {
        radioGroup = findViewById(R.id.radionGroup);
        showBtn = findViewById(R.id.showBtn);
        resultTV = findViewById(R.id.resultTV);
    }
}
