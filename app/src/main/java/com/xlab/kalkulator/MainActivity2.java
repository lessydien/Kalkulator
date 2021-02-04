package com.xlab.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvdata;
    private Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvdata = findViewById(R.id.tampildata);
        it = getIntent();
        String datax = it.getStringExtra("nama");
        tvdata.setText(datax);
    }
}