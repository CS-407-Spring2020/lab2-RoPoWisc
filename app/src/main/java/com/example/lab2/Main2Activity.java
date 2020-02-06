package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textViewTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewTwo = (TextView) findViewById(R.id.textViewTwo);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textViewTwo.setText("Hello "+ str);
    }
}
