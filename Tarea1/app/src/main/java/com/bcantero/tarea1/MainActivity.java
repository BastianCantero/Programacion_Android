package com.bcantero.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int nClicks = 0;
    private TextView lblContaodor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblContaodor = findViewById(R.id.lblContador);
        lblContaodor.setText(Integer.toString(nClicks));
    }

    public void viewToast(View view){
        Toast.makeText(this, "Toast", Toast.LENGTH_SHORT).show();
    }

    public void contador(View view){
        nClicks++;
        lblContaodor.setText(Integer.toString(nClicks));
    }

    public void reset(View view){
        nClicks = 0;
        lblContaodor.setText(Integer.toString(nClicks));
    }

    public void reducir(View view){
        nClicks--;
        lblContaodor.setText(Integer.toString(nClicks));
    }

}