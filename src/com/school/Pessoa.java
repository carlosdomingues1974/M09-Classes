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

    /**
     * Obtém o nome da Pessoa
     * @return devolve o nome da Pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém o apelido da Pessoa
     * @return devolve o apelido da Pessoa
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * Obtém a idade da Pessoa
     * @return devolve a idade da Pessoa
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Atribui um novo valor ao atributo nome do objeto
     * @param nome novo valor para o nome da Pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Atribui um novo valor ao atributo apelido do objeto
     * @param apelido novo valor para o apelido da Pessoa
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * Atribui um novo valor ao atributo idade do objeto
     * @param idade novo valor para a idade da Pessoa
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Imprime todos os dados do objeto
     */
    public void imprimirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Apelido: "+apelido);
        System.out.println("Idade: "+idade+" anos");
    }

    /**
     * Imprime uma saudação com todos os dados do objeto
     */
    public void dizOla(){
        System.out.println("Olá, o meu nome é "+nome+" "+apelido+" e tem "+idade+" anos");
    }
}
