package com.example.glodzienski.lista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {

    TextView txtTitulo;
    TextView txtAno;
    TextView txtEstudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index", -1);
        Jogo jogo = JogoLista.getJogo(index);

        txtTitulo = findViewById(R.id.txtTitulo);
        txtAno = findViewById(R.id.txtAno);
        txtEstudio = findViewById(R.id.txtEstudio);

        txtTitulo.setText(jogo.getTitulo());
        txtAno.setText(String.valueOf(jogo.getAno()));
        txtEstudio.setText(jogo.getEstudio());
    }
}
