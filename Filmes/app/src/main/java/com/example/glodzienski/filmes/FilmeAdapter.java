package com.example.glodzienski.filmes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FilmeAdapter extends RecyclerView.Adapter {

    public FilmeAdapter(ArrayList<Filme> listaFilmes, Context context) {
        this.listaFilmes = listaFilmes;
        this.context = context;
    }

    private ArrayList<Filme> listaFilmes;
    private Context context;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.filme_celula, parent, false);
        return new FilmeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        final FilmeHolder filmeHolder = (FilmeHolder)holder;
        filmeHolder.txtFilmeNome.setText(listaFilmes.get(position).getNome());

        filmeHolder.btnVerMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Filme filme = FilmeLista.getFilme(position);

                Bundle detalhes = new Bundle();
                detalhes.putInt("index",position);
                detalhes.putString("nome", filme.getNome());
                detalhes.putString("ano", filme.getAno());
                detalhes.putString("genero", filme.getGenero());
                detalhes.putString("formato", filme.getFormato());

                Intent intent = new Intent(context, FilmeDetalhesActivity.class);
                intent.putExtras(detalhes);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }
}
