package com.bcantero.evaluacionu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtName, txtLastName, txtAddress;
    CheckBox cbxHogar, cbxTrabajo, cbxUrbano, cbxLimiteUrbano, cbxAccept;
    RadioButton rBtnM, rBtnF, rBtnO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = (TextView) findViewById(R.id.txtName);
        txtLastName = (TextView) findViewById(R.id.txtLastName);
        txtAddress = (TextView) findViewById(R.id.txtAddress);

        cbxHogar = (CheckBox) findViewById(R.id.cbxHogar);
        cbxTrabajo = (CheckBox) findViewById(R.id.cbxTrabajo);
        cbxUrbano = (CheckBox) findViewById(R.id.cbxUrbano);
        cbxLimiteUrbano = (CheckBox) findViewById(R.id.cbxLimiteUrbano);

        cbxAccept = (CheckBox) findViewById(R.id.cbxAccept);

        rBtnM = (RadioButton) findViewById(R.id.rBtnM);
        rBtnF = (RadioButton) findViewById(R.id.rBtnF);
        rBtnO = (RadioButton) findViewById(R.id.rBtnO);
    }

    public void toastMsg(View view){
        String name = txtName.getText().toString();
        String lastName = txtLastName.getText().toString();
        String address = txtAddress.getText().toString();

        if(name.isEmpty() || lastName.isEmpty() || address.isEmpty()){
            Toast.makeText(this, "Debe llenar los campos de nombre, apellido y direccion.", Toast.LENGTH_SHORT).show();
        }else{

            if(rBtnM.isChecked()==false && rBtnF.isChecked()==false && rBtnO.isChecked()==false){
                Toast.makeText(this, "Debe selecciona un genero", Toast.LENGTH_SHORT).show();
            }else{
                if(cbxHogar.isChecked()==false && cbxTrabajo.isChecked()==false && cbxUrbano.isChecked()==false && cbxLimiteUrbano.isChecked()==false){
                    Toast.makeText(this, "Debe seleccionar al menos un tipo de dirección.", Toast.LENGTH_SHORT).show();
                }else{

                    if(cbxAccept.isChecked()==false){
                        Toast.makeText(this, "Debe aceptar las condiciones.", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(this, name + " ,Pedido confirmado!", Toast.LENGTH_SHORT).show();
                    }

                }

            }

        }

    }
}


