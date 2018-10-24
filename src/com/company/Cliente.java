package com.company;

import java.util.Scanner;

public class Cliente {

    //Atributos.
    private String nome;
    private String endereco;
    private int telefone;
    private int idade;
    private String rg;
    private String cpf;
   //Obs: para acessar a classe carro.
    public Carro carroAlugado;
    public String dataDeAluguel;
    public String dataDeDevolucao;

    //Contrutor vazio.
    public Cliente(){

    }

    //Contrutor com parametros.
    public Cliente(String nome,String endereco,int telefone,String rg,String cpf,Carro carroAlugado,String dataDeAluguel, String dataDeDevolucao){
        this.nome=nome;
        this.endereco=endereco;
        this.telefone=telefone;
        this.rg=rg;
        this.cpf=cpf;
        this.carroAlugado=carroAlugado;
        this.dataDeAluguel=dataDeAluguel;
        this.dataDeDevolucao=dataDeDevolucao;

    }

    //metodo 1 dados cliente na tela.
    public void verDados1() {
        System.out.println("<><><><><><><><><>Dados do Cliente<><><><><><><><><>");
        System.out.println("Nome: " +getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Idade: " + getIdade());
        System.out.println("RG: " + getRg());
        System.out.println("CPF: " + getCpf());
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><>");
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }




    public Carro getCarroAlugado(){
        return this.carroAlugado;
    }

    public void setCarroAlugado(Carro carroAlugado){
        this.carroAlugado=carroAlugado;
    }

    public String getDataDeAluguel(){
        return this.dataDeAluguel;
    }

    public void setDataDeAluguel(String dataDeAluguel){
        this.dataDeAluguel=dataDeAluguel;
    }

    public String getDataDeDevolucao(){
        return this.dataDeDevolucao;
    }

    public void setDataDeDevolucao(String dataDeDevolucao){
        this.dataDeDevolucao=dataDeDevolucao;
    }

    //metodo cadastrar cliente
    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Precisamos de algumas informações, responda abaixo.");
        System.out.print("Nome: ");
        setNome(sc.nextLine());
        System.out.print("Endereço: ");
        setEndereco(sc.nextLine());
        System.out.print("Telefone: ");
        setTelefone(sc.nextInt());
        System.out.print("Idade: ");
        setIdade(sc.nextInt());
        sc.nextLine();//quebra de linha pedente.
        System.out.print("RG: ");
        setRg(sc.nextLine());
        System.out.print("CPF: ");
        setCpf(sc.nextLine());
        System.out.printf("Cadastro realizado com sucesso!%n%n");
    }


}
