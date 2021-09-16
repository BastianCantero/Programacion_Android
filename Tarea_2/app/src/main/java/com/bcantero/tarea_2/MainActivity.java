package com.bcantero.tarea_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtName, txtLastName, ccc;
    private CheckBox cbxJava, cbxPhp, cbxPython, cbxCPlusPlus, cbxCcharp;
    private String information;

    private RadioGroup radioGroup1;


    String name;
    String lastName;

    String favoriteLanguaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getInformation(View view){
        name = String.valueOf(txtName.getText());
        lastName = String.valueOf(txtLastName.getText());

    }

}