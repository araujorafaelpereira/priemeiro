package Fundamentos;

import java.util.Scanner;

public class fundamentos {
    // 1 Pacote
    // 2 Bibliotecas
    //3 classe

    static Scanner entrada; // Estatico sempre entra jogando e não sai de jeito nenhum
    //sempre está jogando
    //Aqui ele inicializa o objeto para o inicio da classe como um todo
    public static void main(String [] args) {

        String opcao;
        int area = 0; // receber o resultado dos calculos de areas

      entrada = new Scanner(System.in) ;// Ele que ligou
        System.out.println("Escolha o calcula desejado");
        System.out.println("(1) - Area do QUadrado ");
        System.out.println("(2)  - Area do Retangulo");
        System.out.println("(3)  - Area do Triangulo");
        System.out.println("(4)  - Area do Circulo");
        opcao = entrada.nextLine(); //leitura da opcao
        switch(opcao){
            case"1":
                area = calcularAreaDoQuadrado();
                break;
            default:
                System.out.println("Valor invalido"+ opcao);
        }
      System.out.println("A area e de " + area + " metros quadrados");
    }

    // Funcao retorna o tipo do metodo que ela vai retorna no nome
    //O metodo não fala o que vai fazer a funcao fala

        public static int calcularAreaDoQuadrado(){
        System.out.println("Digite o tamanho do lado :");
            int lado = entrada.nextInt();//Leitura do tamanho do lado
            return lado * lado ; // retorna a área do quadrado


        }


}
