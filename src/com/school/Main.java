package com.school;

public class Main {
    public static void main(String[] args) {
        //Criação dos objetos do tipo Pessoa
        Pessoa p1 = new Pessoa("Carlos","Domingues",48);
        Pessoa p2 = new Pessoa();

        //Preencher o objeto p2 com os dados através dos métodos setters
        p2.setNome("António");
        p2.setApelido("Santos");
        p2.setIdade(34);

        //Imprimir para o ecrã os dados do objeto p1 através dos métodos getters
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Apelido: "+p1.getApelido());
        System.out.println("Idade: "+p1.getIdade()+" anos");

        //Imprimir para o ecrã os dados do objeto p2 através do método imprimirDados
        p2.imprimirDados();

        //Colocar os objetos a apresentarem-se
        p1.dizOla();
        p2.dizOla();
    }
}
