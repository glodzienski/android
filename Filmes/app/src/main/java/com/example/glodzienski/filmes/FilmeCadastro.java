package com.example.glodzienski.filmes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FilmeCadastro extends AppCompatActivity {

    Button btnSalvar;
    EditText edtNome;
    EditText edtGenero;
    EditText edtAno;
    EditText edtFormato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_cadastro);

        edtNome = findViewById(R.id.edtNome);
        edtGenero = findViewById(R.id.edtGenero);
        edtAno = findViewById(R.id.edtAno);
        edtFormato = findViewById(R.id.edtFormato);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = edtNome.getText().toString();
                String genero = edtGenero.getText().toString();
                String ano = edtAno.getText().toString();
                String formato = edtFormato.getText().toString();
                String messageError = "";

                if (nome.isEmpty()) {
                    messageError = "Campo Nome é obrigatório.";
                } else if (genero.isEmpty()) {
                    messageError = "Campo Gênero é obrigatório.";
                } else if (ano.isEmpty()) {
                    messageError = "Campo Ano é obrigatório.";
                } else if (formato.isEmpty()) {
                    messageError = "Campo Formato é obrigatório.";
                }

                if (messageError.isEmpty()) {
                    FilmeLista.addFilme(new Filme(nome, genero, ano, formato));
                    startActivity(new Intent(FilmeCadastro.this, MainActivity.class));
                } else {
                    Toast.makeText(FilmeCadastro.this, messageError, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
