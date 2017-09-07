package com.example.superadmin1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText campo1 ;
    private EditText campo2 ;
    private RadioButton suma ;
    private RadioButton resta ;
    private RadioButton divi ;
    private RadioButton produ ;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo1= (EditText) findViewById(R.id.campo1);
        campo2= (EditText) findViewById(R.id.campo2);
        suma= (RadioButton) findViewById(R.id.suma);
        resta= (RadioButton) findViewById(R.id.resta);
        divi= (RadioButton) findViewById(R.id.divi);
        produ= (RadioButton) findViewById(R.id.produ);
        calcular=(Button)findViewById(R.id.calcular);


    }

    public void calcular(View view){
        if (campo1.getText().equals("")){
            new Exception("Campo 1 vacio");

        }
        if (campo2.getText().equals("")){
            new Exception("Campo 2 vacio");

        }

        Double numero1=Double.parseDouble(campo1.getText().toString());
        Double numero2=Double.parseDouble(campo2.getText().toString());
        Double resultado=0.0;
        if (suma.isChecked()){

            resultado=numero1+numero2;

        }
        if (resta.isChecked()){

            resultado=numero1-numero2;

        }
        if (produ.isChecked()){

            resultado=numero1*numero2;

        }
        if (divi.isChecked() && numero2!=0){

            resultado=numero1*numero2;

        }else
        {new Exception("Divicion por cero");}

        Toast.makeText(MainActivity.this, resultado.toString(), Toast.LENGTH_SHORT).show();
    }
}
