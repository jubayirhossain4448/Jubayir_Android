package com.example.edittextwithtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText1, editText2;
    private Button addBtn, subBtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextOne);
        editText2 = findViewById(R.id.editTextTwo);
        addBtn = findViewById(R.id.addBtn);
        subBtn = findViewById(R.id.subBtn);

        textView = findViewById(R.id.textView);

        addBtn.setOnClickListener(this);
        subBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        try {
            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();

            // converting into double

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if (v.getId()==R.id.addBtn){
                double sum = num1 + num2;
                textView.setText("Result : " + sum);
            }else if (v.getId() == R.id.subBtn){
                double sub = num1 - num2;
                textView.setText("Result : " + sub);
            }
        }catch (Exception e){
            Toast.makeText(MainActivity.this, "Please Enter Number", Toast.LENGTH_SHORT).show();
        }
    }
}

