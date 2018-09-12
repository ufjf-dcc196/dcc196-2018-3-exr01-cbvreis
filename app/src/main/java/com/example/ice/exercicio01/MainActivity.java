package com.example.ice.exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String tipoPessoa = "nome";
    public static final String nomeProfessor =null;
    //public static String contadorProfessor =null;

    private static int contadorProfessor =0;


    private static int REQUEST_CONTADOR_PROFESSOR = 1;
    private static int REQUEST_CONTADOR_ALUNO = 2;
    private static int REQUEST_CONTADOR_EXTERNO = 3;


    private TextView textProfessor;
    private TextView textAluno;
    private TextView textExterno;

    private Button btnProfessor;
    private Button btnAluno;
    private Button btnExterno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProfessor = (Button)findViewById(R.id.btnProfessor);
        btnAluno = (Button)findViewById(R.id.btnAluno);
        btnExterno = (Button)findViewById(R.id.btnExterno);

        textProfessor = (TextView)findViewById(R.id.textProfessor);
        textAluno = (TextView)findViewById(R.id.textAluno);
        textExterno = (TextView)findViewById(R.id.textExterno);



        btnProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfessorActivity.class);
           //     intent.putExtra(tipoPessoa, btnProfessor.getText().toString());
                startActivityForResult(intent, MainActivity.REQUEST_CONTADOR_PROFESSOR);
            }
        });

        btnExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExternoActivity.class);
        //        intent.putExtra(tipoPessoa, btnExterno.getText().toString());
                startActivityForResult(intent, MainActivity.REQUEST_CONTADOR_EXTERNO);
            }
        });


        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
         //       intent.putExtra(tipoPessoa, btnAluno.getText().toString());
                startActivityForResult(intent, MainActivity.REQUEST_CONTADOR_ALUNO);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);




        textProfessor = (TextView) findViewById(R.id.textProfessor);
        textAluno = (TextView) findViewById(R.id.textAluno);
        textExterno = (TextView) findViewById(R.id.textExterno);


        if (requestCode == MainActivity.REQUEST_CONTADOR_PROFESSOR && resultCode == Activity.RESULT_OK) {

            contadorProfessor++;
            textProfessor.setText(String.valueOf(contadorProfessor));

        }
  }
    }