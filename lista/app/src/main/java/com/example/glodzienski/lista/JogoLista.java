package com.example.glodzienski.lista;

import java.util.ArrayList;

public class JogoLista {

    private static ArrayList<Jogo> listaJogos = new ArrayList<>();

    public static void addJogos(Jogo j) {
        listaJogos.add(j);
    }

    public static Jogo getJogo(int index) {
        return listaJogos.get(index);
    }

    public static ArrayList<Jogo> getLista() {
        return listaJogos;
    }
}
