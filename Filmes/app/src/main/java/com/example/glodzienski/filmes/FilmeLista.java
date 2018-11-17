package com.example.glodzienski.filmes;

import java.util.ArrayList;

public class FilmeLista {
    private static ArrayList<Filme> listaFilmes = new ArrayList<>();

    public static void addFilme(Filme c) {
        listaFilmes.add(c);
    }

    public static ArrayList<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public static Filme getFilme(int index) {
        return listaFilmes.get(index);
    }

    public static void deletarFilme(int index) {
        listaFilmes.remove(index);
    }
}
