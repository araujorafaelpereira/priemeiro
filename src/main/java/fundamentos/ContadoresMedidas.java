package fundamentos;

import static fundamentos.Medidas.entrada;

public interface ContadoresMedidas {
    static void contagemRegressiva() {
        //Interface é conexão entre classes
        System.out.print("Começar a contagem apartir de qual numero?");
        int numero = entrada.nextInt();

        for (int i = numero; i >= 1; i--) {

            System.out.println(i);
        }
    }
}
