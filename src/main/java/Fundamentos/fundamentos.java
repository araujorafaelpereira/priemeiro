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
        double area = 0; // receber o resultado dos calculos de areas

      entrada = new Scanner(System.in) ;// Ele que ligou
        System.out.println("Escolha o calculo desejado");
        System.out.println("(1) - Area do QUadrado ");
        System.out.println("(2)  - Area do Retangulo");
        System.out.println("(3)  - Area do Triangulo");
        System.out.println("(4)  - Area do Circulo");
        opcao = entrada.nextLine(); //leitura da opcao
        switch(opcao){
            case"1":
                area = calcularAreaDoQuadrado();
                System.out.println("A area e de " + area + " metros quadrados");
                break;

            case "2":
                area = calcularAreaDoRetangulo();
                System.out.println("A area e de " + area + " metros quadrados");
                break;
            case "3":
                area = calcularAreaTriangulo();
                System.out.println("A area e de " + area + " metros quadrados");
                break;
            case "4":
                area = calcularAreaDoCirculo();
                System.out.println("A area da circuferencia e de  " + area + " metros ");
                break;
            default:
                System.out.println("Numero invalido");
        }

        }



    // Funcao retorna o tipo do metodo que ela vai retorna no nome
    //O metodo não fala o que vai fazer a funcao fala

        public static int calcularAreaDoQuadrado(){
        System.out.println("Digite o tamanho do lado :");
            int lado = entrada.nextInt();//Leitura do tamanho do lado
            return lado * lado ; // retorna a área do quadrado


        }
        public static int calcularAreaDoRetangulo(){
        System.out.println("Digite o tamanho do lado :");
        int lado = entrada.nextInt();
        return lado * lado ;
    }
    public static int calcularAreaTriangulo(){
        System.out.println("Digite o tamanho do lado :");
        int lado = entrada.nextInt();
        System.out.println("Digite o tamanho da Altura :");
        int altura = entrada.nextInt();
        return lado * altura ;
    }
    public static  double calcularAreaDoCirculo(){
        System.out.println("Digite o raio :");
       double raio = entrada.nextInt();
        double diametro = raio * raio;
        double pi = 3.14;
        return diametro *  pi ;

    }


}
