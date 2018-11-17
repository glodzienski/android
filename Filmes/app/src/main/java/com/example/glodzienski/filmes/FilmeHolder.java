package com.example.glodzienski.filmes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FilmeHolder extends RecyclerView.ViewHolder {
    public TextView txtFilmeNome;
    public Button btnVerMais;

    public FilmeHolder(@NonNull View itemView) {
        super(itemView);
        txtFilmeNome = itemView.findViewById(R.id.txtFilmeNome);
        btnVerMais = itemView.findViewById(R.id.btnVerMais);
    }
}
