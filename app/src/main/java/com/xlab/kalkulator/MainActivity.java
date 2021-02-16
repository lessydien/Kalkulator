package com.xlab.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.xlab.kalkulator.sederhana.Kalkulatorsederhana;

public class MainActivity extends AppCompatActivity {

    private TextView hsl;
    private EditText opj1, opj2, etalamat;
    private MenuInflater menuInflater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hsl = findViewById(R.id.hasiljumlah);
        opj1 = findViewById(R.id.opjumlah1);
        opj2 = findViewById(R.id.opjumlah2);
        etalamat = findViewById(R.id.alamatpage);
    }
/*
    int jumlah (int op1, int op2) {
        return op1 + op2;
    }

    int kurang (int op1, int op2) {
        return op1-op2;
    }
*/

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menuInflater =  getMenuInflater();
        menuInflater.inflate(R.menu.optionmenu,menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu1:

                return true;
            case R.id.menu2:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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

    public void bukaweb(View v) {
        String alamat = null;
        alamat = etalamat.getText().toString();
       // Uri uri = Uri.parse("tel:"+alamat);
       // Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        Intent it = new Intent(this, MainActivity2.class);
        it.putExtra("nama", alamat);
        startActivity(it);

    }
}