package com.example.glodzienski.filmes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FilmeDetalhesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_detalhes);

        TextView txtNome = findViewById(R.id.txtNome);
        TextView txtAno = findViewById(R.id.txtAno);
        TextView txtGenero = findViewById(R.id.txtGenero);
        TextView txtFormato = findViewById(R.id.txtFormato);

        final Intent intent = getIntent();
        final Bundle bundle = intent.getExtras();

        String nome = bundle.getString("nome");
        String ano = bundle.getString("ano");
        String genero = bundle.getString("genero");
        String formato = bundle.getString("formato");

        txtNome.setText("Nome: " + nome);
        txtAno.setText("Ano: " + ano);
        txtGenero.setText("Gênero: " + genero);
        txtFormato.setText("Formato: " + formato);
    }
}
