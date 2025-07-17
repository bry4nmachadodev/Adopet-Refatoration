package br.com.alura.domain;

public class Pet {

    private String nome;
    private String tipo;
    private String raca;
    private String cor;
    private Float peso;
    private int idade;

    public Pet(String nome, String tipo, String raca, int idade, String cor, Float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

}
