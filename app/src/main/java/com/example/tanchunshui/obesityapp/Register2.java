
package com.example.tanchunshui.obesityapp;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Register2 extends AppCompatActivity {
    private Button nextBtn;
    private EditText weight, height;
    private TextView bmi;
    private Spinner gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        gender = findViewById(R.id.spinner);
        String[] items = new String[]{"","Male","Female"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        gender.setAdapter(adapter);

        nextBtnAction();
        bmiAutoCalculation();
    }

    public void nextBtnAction(){
        nextBtn = (Button) findViewById(R.id.button4);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register2.this, Dashboard.class);
                startActivity(i);
            }
        });
    }

    public void bmiAutoCalculation(){
        weight = (EditText) findViewById(R.id.editText7);
        height = (EditText) findViewById(R.id.editText10);
        bmi = (TextView) findViewById(R.id.textView25);


        weight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    int w = Integer.parseInt(weight.getText().toString());
                    int h = Integer.parseInt(height.getText().toString());
                    double BMI = w / Math.pow(h,2) * 10000;
                    bmi.setText(String.format("%.2f",BMI));
                }catch (Exception e){
//                    Toast.makeText(getApplicationContext(),"Please make sure to fill in weight and height.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        height.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    int w = Integer.parseInt(weight.getText().toString());
                    int h = Integer.parseInt(height.getText().toString());
                    double BMI = w / Math.pow(h,2) *10000;
                    bmi.setText(String.format("%2.2f",BMI));
                }catch (Exception e){
//                    Toast.makeText(getApplicationContext(),"Please make sure to fill in weight and height.",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
