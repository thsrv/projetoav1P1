package com.company;

public class Carro {


    String marca;
    String modelo;
    float motor;
    String cor;
    String tipoCombustivel;
    float kmRodados;
    boolean controleAluguel;
    static int qtdTotalCarros = 0;


    //Contrustor carro vazio.
    public Carro(){

    }

    //Construtor carro.
    public Carro(String marca,String modelo,float motor,String cor,String tipoCombustivel,float kmRodados){

        this.marca=marca;
        this.modelo=modelo;
        this.motor=motor;
        this.cor=cor;
        this.tipoCombustivel=tipoCombustivel;
        this.kmRodados=kmRodados;
        qtdTotalCarros+=1;

    }

    //metodo km tela.
    public void quilometragem(){
        System.out.printf("O carro "+this.modelo+" tem a quilometragem de %.3fKm rodados.%n",kmRodados);
    }
    public void disponivel(){
        this.controleAluguel = true;
        System.out.println("O "+this.modelo+" está disponivel.");

    }
    public void alugado(){
        this.controleAluguel = false;
        System.out.println("O "+this.modelo+" está alugado.");
    }
    public void mostrarTotal(){
        System.out.println("Temos um total de "+Carro.qtdTotalCarros+" Carros");
    }
    public void mostrarCarro(){
        System.out.printf("Marca "+this.marca+", modelo "+this.modelo+", sendo "+this.motor+" na cor "+this.cor+" "+this.tipoCombustivel+", com %.3fKm rodados.%n",this.kmRodados);
    }
    public void mostrarCarrosAlugados(){
        System.out.println("O "+this.modelo+" "+this.cor);
    }




}
