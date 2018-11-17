package com.example.glodzienski.filmes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCadastrar = findViewById(R.id.btnCadastrarNovo);
        RecyclerView rcvFilmes = findViewById(R.id.rcvFilmes);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FilmeCadastro.class));
            }
        });

        // criar um novo adaptador para a recycler view
        FilmeAdapter filmeAdapter = new FilmeAdapter
                (FilmeLista.getListaFilmes(),MainActivity.this);

        // setar adaptador criado para a recycler view
        rcvFilmes.setAdapter(filmeAdapter);

        // definir o layout de exibição
        RecyclerView.LayoutManager meuLayout = new LinearLayoutManager
                (MainActivity.this, LinearLayoutManager.VERTICAL, false);

        // setar o layout de exibição para a recycler view
        rcvFilmes.setLayoutManager(meuLayout);
    }
}
