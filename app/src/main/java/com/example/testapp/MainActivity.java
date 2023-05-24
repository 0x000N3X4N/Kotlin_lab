package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testapp.textapp.textFunction;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textFunction ft = new textFunction();
        TextView nt = findViewById(R.id.newtest);
        nt.setText(ft.getValue());
    }

    private TextView getById() {
        return findViewById(R.id.newtest);
    }
}