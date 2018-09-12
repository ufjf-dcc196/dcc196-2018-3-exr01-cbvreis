package com.example.ice.exercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProfessorActivity extends AppCompatActivity {

    private Button btnLimpar;
    private Button btnConfirma;

    private EditText txtNome;
    private EditText txtSiap;
    private static int contador=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        btnConfirma = (Button) findViewById(R.id.btnConfirma);
        txtSiap = (EditText) findViewById(R.id.txtSiap);
        txtNome = (EditText) findViewById(R.id.txtNome);

        btnConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.nomeProfessor, txtNome.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();
            }
        });



    }


}