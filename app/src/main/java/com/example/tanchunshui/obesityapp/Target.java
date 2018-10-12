package com.example.tanchunshui.obesityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

public class Target extends AppCompatActivity {

    private CheckBox cb1,cb2,cb3,cb4;
    private Button nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        Spinner dropdown = findViewById(R.id.spinner1);
        String[] items = new String[]{"Running", "Swimming", "Cycling","Hiking"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        nextbtn = (Button) findViewById(R.id.button6);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Target.this,Map.class);
                startActivity(i);
            }
        });
    }

}
