package com.example.glodzienski.lista;

public class Jogo {
    private String titulo;
    private int ano;
    private String estudio;

    public Jogo() {
    }

    public Jogo(String titulo, int ano, String estudio) {

        this.titulo = titulo;
        this.ano = ano;
        this.estudio = estudio;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
