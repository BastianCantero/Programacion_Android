package com.bcantero.tarea_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button btnVolver;
    private TextView lblName, lblLenguaje, lblFav;

    public String name;
    public String lastName;
    public String lenguaje;
    public String fav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnVolver = findViewById(R.id.btnVolver);

        lblName = findViewById(R.id.lbl1);
        lblLenguaje = findViewById(R.id.lbl2);
        lblFav = findViewById(R.id.lbl3);

        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        lastName = intent.getStringExtra("lastName");

        lblName.setText(name + " " + lastName);

    }

    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}