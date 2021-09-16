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

    /*public String name;
    public String lastName;
    public String lenguaje;
    public String fav;*/

    CharSequence name;

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

    public void viewToast(View view){
        /*name = String.valueOf(txtName.getText());
        lastName = String.valueOf(txtLastName.getText());
        Toast.makeText(this, "Toast" + name + lastName, Toast.LENGTH_SHORT).show();*/
    }

    public void getInformation(){
        MainActivity2 m2 = new MainActivity2();

        //name = String.valueOf(txtName.getText());
        //lastName = String.valueOf(txtLastName.getText());

    }

    public void btnAccept(View view){
        //getInformation();

        name = txtName.getText();
        //lastName = String.valueOf(txtLastName.getText());

        MainActivity2 m2 = new MainActivity2();

        //m2.name = setText
        //m2.lastName = String.valueOf(txtLastName.getText());

        Intent intent2 = new Intent(this, MainActivity2.class);
        startActivity(intent2);
    }

}