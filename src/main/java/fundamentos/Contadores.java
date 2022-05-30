package fundamentos;

public class Contadores extends Medidas implements ContadoresMedidas {
    public static void main(String[] args){
        System.out.println("Deseja realizar a contagem regressiva ?  <S/N>");
        String resposta = entrada.nextLine().toUpperCase();
        switch (resposta){
            case "S":
                contagemRegressiva();
                break;
            default:
                System.out.println("Digitou uma opção invalida!");

        }
        //Somente no extends se faz o evorride

    }
}
