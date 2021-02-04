package com.xlab.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.xlab.kalkulator.sederhana.Kalkulatorsederhana;

public class MainActivity extends AppCompatActivity {

    private TextView hsl;
    private EditText opj1, opj2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hsl = findViewById(R.id.hasiljumlah);
        opj1 = findViewById(R.id.opjumlah1);
        opj2 = findViewById(R.id.opjumlah2);
    }
/*
    int jumlah (int op1, int op2) {
        return op1 + op2;
    }

    int kurang (int op1, int op2) {
        return op1-op2;
    }
*/
    public void panggilJumlah(View v) {
        Kalkulatorsederhana  ks = new Kalkulatorsederhana();
        int op1 = 0;
        int op2 = 0;
        int hasil = 0;
        op1 = Integer.parseInt(opj1.getText().toString());
        op2 = Integer.parseInt(opj2.getText().toString());
        //hasil = jumlah(op1,op2);
        ks.setOp1(op1);
        ks.setOp2(op2);
        hasil = ks.jumlah();
        hsl.setText(String.valueOf(hasil));
    }
}