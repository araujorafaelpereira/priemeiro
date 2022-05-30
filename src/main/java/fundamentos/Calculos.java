package fundamentos;


import static fundamentos.Medidas.entrada;
import static fundamentos.Medidas.tabuada;

public class Calculos {

    public static void main(String[] args){
        System.out.print("Se quiser calcular a tabuada digite (S), se quiser sair digite (N):");
        String resposta =  entrada.nextLine().toUpperCase();
        System.out.println("Resposta:" + resposta);
        switch (resposta){
            case"S" :
                    tabuada();
            break;
            default:
                System.out.println("Digitou outro");

        }

    }

}
