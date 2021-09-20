package com.bcantero.tarea_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtName, txtLastName, lblfav;
    private CheckBox cbxJava, cbxPhp, cbxPython, cbxCPlusPlus, cbxCsharp;
    private String information;

    private RadioGroup radioGroup;
    private RadioButton selectedRadioButton;

    public String name;
    public String lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtLastName = findViewById(R.id.txtLastName);

        cbxJava = findViewById(R.id.cbxJava);
        cbxPython = findViewById(R.id.cbxPython);
        cbxPhp = findViewById(R.id.cbxPhp);
        cbxCsharp = findViewById(R.id.cbxCSharp);
        cbxCPlusPlus = findViewById(R.id.cbxCPlusPlus);

        lblfav = findViewById(R.id.lblfav);

    }

    public void btnAccept(View view){

        name = txtName.getText().toString();
        lastName = txtLastName.getText().toString();

        Intent intent2 = new Intent(this, MainActivity2.class);

        intent2.putExtra("name", name);
        intent2.putExtra("lastName", lastName);
        startActivity(intent2);
    }

}