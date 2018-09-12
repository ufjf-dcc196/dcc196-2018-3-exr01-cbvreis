package com.example.ice.exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AlunoActivity extends AppCompatActivity {



    private Button btnLimpar;
    private Button btnConfirma;

    private EditText txtNome;
    private EditText txtMatricula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        btnConfirma = (Button) findViewById(R.id.btnConfirma);
        txtMatricula = (EditText) findViewById(R.id.txtMatricula);
        txtNome = (EditText) findViewById(R.id.txtNome);

        btnConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent resultado = new Intent();
              //  resultado.putExtra(MainActivity.nomeProfessor, txtNome.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();
            }
        });
    }
}
