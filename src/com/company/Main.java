package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Array de carros.
        Carro[] totalDeCarros = {new Carro("Fiat","Palio",1.0f,"prata","totalFlex",50.000f),
                                 new Carro("Fiat","Palio",1.0f,"prata","totalFlex",50.000f),
                                 new Carro("Fiat","Palio",1.0f,"prata","totalFlex",50.000f),
                                 new Carro("Hyndai","hb20",1.6f,"branco","totalFlex",40.000f),
                                 new Carro("Hyndai","hb20",1.6f,"branco","totalFlex",40.000f),
                                 new Carro("Volkswagen","gol",1.0f,"preto","gasolina",55.000f),
                                 new Carro("Volkswagen","gol",1.0f,"preto","gasolina",55.000f),
                                 new Carro("Volkswagen","gol",1.0f,"preto","gasolina",55.000f),
                                 new Carro("Volkswagen","gol",1.0f,"preto","gasolina",55.000f),
                                 new Carro("Volkswagen","gol",1.0f,"preto","gasolina",55.000f),
                                 new Carro("GM","Camaro",3.0f,"amarelo","totalFlex",7.000f),
                                 new Carro("GM","Camaro",3.0f,"amarelo","totalFlex",7.000f),
                                 new Carro("GM","Camaro",3.0f,"amarelo","totalFlex",7.000f),
                                 new Carro("Ford","fusion",2.0f,"preto","gasolina",15.000f),
                                 new Carro("Dodge","viper",8.3f,"azul","gasolina",5.000f)};

        //Array carros alugados.
        Carro[] carrosAlugados = new Carro[3];


        //mostrar km.
    //    totalDeCarros[0].quilometragem(); //Palio
    //    totalDeCarros[3].quilometragem(); //Hb20
    //    totalDeCarros[5].quilometragem(); //Gol
    //    totalDeCarros[10].quilometragem(); //Camaro
    //    totalDeCarros[13].quilometragem(); //Fusion
    //    totalDeCarros[14].quilometragem(); //Viper



        //Array de clientes.
            Cliente[] client = new Cliente[2];



            //Interação com usuario.
            System.out.println("Olá, deseja cadastrar os "+client.length+" clientes? S=Sim/N=Não");
            char respClient = sc.next().charAt(0);
                sc.nextLine();//quebra de linha pedente.
                if(respClient == 's' || respClient == 'S'){
                    for(int cont=0; cont<client.length; cont++){
                        client[cont] = new Cliente();
                        client[cont].cadastrar();
                    }

                    char respVoltarMenu;
                    int idClient;
                    int idCarro;
                    int respMenu;
                do {
                    menu();
                    respMenu = sc.nextInt();
                    sc.nextLine();//quebra de linha pedente.

                    switch(respMenu){
                        case 1:
                            System.out.println("Temos "+client.length+" clientes cadastrados.");
                            System.out.print("Informe seu ID:");
                                idClient = sc.nextInt();
                                if(idClient<=client.length){
                                    client[idClient].verDados1();
                                }else{
                                    System.out.println("O ID informado não está cadastrado.");
                                }
                            break;
                        case 2:
                            totalDeCarros[0].mostrarTotal();//Total em numeros.
                            totalDeCarros[0].mostrarCarro();
                            totalDeCarros[3].mostrarCarro();
                            totalDeCarros[5].mostrarCarro();
                            totalDeCarros[10].mostrarCarro();
                            totalDeCarros[13].mostrarCarro();
                            totalDeCarros[14].mostrarCarro();
                            break;
                        case 3:
                            System.out.print("0 a "+(client.length-1)+", informe seu ID:");
                                idClient = sc.nextInt();
                                sc.nextLine();//quebra de linha pedente.
                            System.out.println("Informe a data da locação:");
                                String dataAluguel = sc.nextLine();
                                client[idClient].setDataDeAluguel(dataAluguel);
                            System.out.println("Informe a data de devolução:");
                                String dataDevolucao = sc.nextLine();
                                client[idClient].setDataDeDevolucao(dataDevolucao);
                            System.out.printf("%n");//pular linhda.

                            System.out.print(client[idClient].getNome()+" informe o codigo do carro de 0 a "+(totalDeCarros.length-1)+" que você deseja alugar: ");
                                idCarro = sc.nextInt();
                                sc.nextLine();//quebra de linha pedente.
//ERRO, tirar duvida. System.arraycopy(totalDeCarros,idCarro,carrosAlugados,2,1);
                                carrosAlugados[0]= new Carro();
                                carrosAlugados[0]= totalDeCarros[idCarro];
                            client[idClient].setCarroAlugado(totalDeCarros[idCarro]);
                            System.out.printf("%nOperação concluida!!%n%n");

                            break;
                        case 4:

                //OBS: assim que for alugado, retirar o comentario da linha de codigo abaixo.
                            carrosAlugados[0].mostrarCarrosAlugados();
                            break;
                        default:
                            System.out.println("Opção invalida!");
                    }
                    //dados da locação do cliente.
                   if(respMenu==3){
                       System.out.println("Deseja ver os dados referente sua locação? S/N");
                        respClient=sc.next().charAt(0);
                        sc.nextLine();//quebra de linha pedente.
                            if(respClient=='s'||respClient=='S'){
                                System.out.print("0 a "+(client.length-1)+" Informe seu id: ");
                                idClient=sc.nextInt();
                                System.out.println("<><><><><><><><><><><><><><><><<><><><><><><><<><>");
                                System.out.println("Cliente: "+client[idClient].getNome());
                                System.out.println("Carro alugado: "+carrosAlugados[0].modelo);
                                System.out.println("Data de aluguel: "+client[idClient].getDataDeAluguel());
                                System.out.println("Data da devolução: "+client[idClient].getDataDeDevolucao());
                                System.out.println("<><><><><><><><><><><><><><><><<><><><><><><><<><>");

                            }
                   }
                    System.out.printf("%nDeseja voltar ao Menu principal? S/N%n");
                    respVoltarMenu = sc.next().charAt(0);
                    sc.nextLine();//quebra de linha pedente.
                }while (respVoltarMenu=='s' || respVoltarMenu=='S');

                    }else{
                    System.out.println("Obrigado, volte sempre!");
                }






    }
    //menu opções usuario(Switch)
    public static void menu(){
        System.out.println("<><><><><><><><><><><><><><><>BEM VINDO<><><><><><><><><><><><><><><>");
        System.out.println("<><><><><><><><><><><><><><>THS LOCAÇÔES<><><><><><><><><><><><><><><>");
        System.out.printf("%n");
        System.out.println("O que deseja realizar hoje?");
        System.out.println("1 - Mostrar seus dados.");
        System.out.println("2 - Mostrar veiculos.");
        System.out.println("3 - Alugar carro.");
        System.out.println("4 - Mostrar carros alugados.");
    }
}
