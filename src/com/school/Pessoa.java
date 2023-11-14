package com.school;

public class Pessoa {
    // nome da Pessoa
    private String nome;
    // apelido da Pessoa
    private String apelido;
    // idade da Pessoa
    private int idade;

    /**
     * Construtor default
     * só é utilizado quando não existir mais nenhum.
     */
    public Pessoa(){

    }

    /**
     * Construtor completo
     * Permite criar os objetos com todos os atributos
     * @param nome recebe o nome da Pessoa
     * @param apelido recebe o apelido da Pessoa
     * @param idade recebe a idade da Pessoa
     */
    public Pessoa(String nome, String apelido, int idade){
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
    }
}
