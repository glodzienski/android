package com.example.glodzienski.lista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAddGame;
    ListView lstGames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstGames = findViewById(R.id.lstGames);
        btnAddGame = findViewById(R.id.btnAddGame);

        ArrayAdapter<Jogo> adaptadorJogos = new ArrayAdapter<Jogo>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                JogoLista.getLista()
        );

        lstGames.setAdapter(adaptadorJogos);

        btnAddGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CadastroActivity.class));
            }
        });

        lstGames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetalhesActivity.class);
                intent.putExtra("index", position);
                startActivity(intent);
            }
        });
    }
}
