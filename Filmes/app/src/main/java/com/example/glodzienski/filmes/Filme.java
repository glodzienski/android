package com.example.glodzienski.filmes;

public class Filme {
    private String nome;
    private String genero;
    private String ano;
    private String formato;

    public Filme() {
    }

    public Filme(String nome, String genero, String ano, String formato) {

        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.formato = formato;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
