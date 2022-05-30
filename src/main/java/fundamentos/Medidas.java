package fundamentos;

import java.util.Scanner;

public class Medidas {
    // 1 Pacote
    // 2 Bibliotecas
    //3 classe

    static Scanner entrada = new Scanner(System.in);; // Ele que ligou, para usar um scaner que está em um metodo em outra classe deves-se usar ele no escopo global
    // Estatico sempre entra jogando e não sai de jeito nenhum

    //sempre está jogando
    //Aqui ele inicializa o objeto para o inicio da classe como um todo
    public static void main(String[] args) {

        String opcao = "";
        double area = 0; // receber o resultado dos calculos de areas
       // while (!opcao.toUpperCase().equals("S")) {
            // Ele que ligou
            System.out.println("Escolha o calculo desejado");
            System.out.println("(1) - Area do QUadrado ");
            System.out.println("(2)  - Area do Retangulo");
            System.out.println("(3)  - Area do Triangulo");
            System.out.println("(4)  - Area do Circulo");
            System.out.println("(5)  - Tabuada");
            System.out.println("(6)  - Fibonacci");
            System.out.println("(7)  - Contagem Regressiva");
            System.out.println("(8)   -Fazer uma divisao");
            System.out.println("(S)  -  Sair");
            opcao = entrada.nextLine(); //leitura da opcao
            switch (opcao) {
                case "1":
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
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                case "8":
                    divisaoporzero();
                    break;
                default:
                    System.out.println("Numero invalido");
            }
        }
        //System.out.println("Agradecemos Pela preferencia!!");
   // }

    public static void fibonacci() {
        System.out.print("Quantos numeros deseja calcular na sequencia: ");
        byte numero = entrada.nextByte();
        switch (numero) {
            case 0:
                System.out.println("A sequencia esta vazia");
                System.out.println("Digite outro numero");
                fibonacci();
                break;
            case 1:
                System.out.println("Sequencia de Fibonnacci e 1");
                System.out.println("Digite um valor maior que um pra ver outra sequencia");
                fibonacci();
                break;
            default:
                int num1 = 0;
                int num2 = 1;
                System.out.print("Sequencia de Fibonacci : 1 ");
                for (int i = 2; i <= numero; i++) {
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib; // Revisar , o numero anterior passa para o numero posterior e é somado ao resutaldo da soma dos numeros anteriores.


                }

        }


    }


    // Funcao retorna o tipo do metodo que ela vai retorna no nome
    //O metodo não fala o que vai fazer a funcao fala

    public static int calcularAreaDoQuadrado() {
        System.out.println("Digite o tamanho do lado :");
        int lado = entrada.nextInt();//Leitura do tamanho do lado
        //Desenhar um quadrado
        for (int linha = 1; linha <= lado; linha += 2) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");
            }
            System.out.println("");//pular de linha
        }
        System.out.println();//pular de linha
        return lado * lado; // retorna a área do quadrado


    }

    public static int calcularAreaDoRetangulo() {
        System.out.println("Digite o tamanho do lado :");
        int lado = entrada.nextInt();
        return lado * lado;
    }

    public static int calcularAreaTriangulo() {
        System.out.println("Digite o tamanho do lado :");
        int lado = entrada.nextInt();
        System.out.println("Digite o tamanho da Altura :");
        int altura = entrada.nextInt();
        return lado * altura;
    }

    public static double calcularAreaDoCirculo() {
        System.out.println("Digite o raio :");
        double raio = entrada.nextInt();
        double diametro = raio * raio;
        double pi = 3.14;
        return diametro * pi;

    }

    public static void tabuada() {
        System.out.println("Você quer calcular a tabuada de qual numero ?");
        int numero = entrada.nextInt(); //byte é um numero de 0 a 255

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + "X" + i + "=" + resultado);

        }

    }

    public static void contagemRegressiva() {
        System.out.print("Começar a contagem apartir de qual numero?");
        int numero = entrada.nextInt();
        System.out.print("Diminuindo de Quantos em Quantos numeros por vez ?");
        int decrescimo = entrada.nextInt();
        for (int i = numero; i >= 1; i -= decrescimo) {

            System.out.println(i);

        }


    }
       public static void  divisaoporzero(){
            try {System.out.print("Qual e o dividendo (Numero a ser dividido) ?");
            float dividendo = entrada.nextFloat();
            System.out.print("Qual e o divisor (Numero que divide o dividendo) ?  ");
            float divisor = entrada.nextFloat();

                System.out.println(" O resultado e : " + dividendo/divisor); // O parametro certo do metodo vai dentro do try eo errado dentro do catch
            } catch(Exception e) {
                System.out.println("Nao e possivel dividr por zero - Erro:" + e.getMessage());

            }
        }
}
