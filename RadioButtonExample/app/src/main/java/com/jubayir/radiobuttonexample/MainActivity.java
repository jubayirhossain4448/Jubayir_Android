package com.jubayir.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton genderBtn;
    private Button showBtn;
    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupId);
        showBtn = findViewById(R.id.showBtn);
        resultTV = findViewById(R.id.resultTV);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                genderBtn = findViewById(selectedId);

                String value = genderBtn.getText().toString();
                resultTV.setText("You have Selected : " + value);
            }
        });
    }
}
