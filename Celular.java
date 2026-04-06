package celular;

import java.util.Scanner;

public class Celular {

    public static void main(String[] args) {
        telefone();

    }

    public static void telefone() {
        Scanner s = new Scanner(System.in);
        Bateria b = new Bateria(0);

        int nivelInicial;
        int valor = 0;

        System.out.print("Digite o nivel da bateria: ");
        nivelInicial = s.nextInt();

        if (nivelInicial >= 100 || nivelInicial <= 0 ) {
            System.out.println("erro");

        } else {
            

            System.out.print("Quanto quer carregar: ");
            int carga = s.nextInt();
            b.carregar(carga);

            System.out.println("Nivel agora: " + (b.getNivel() + nivelInicial));

            System.out.print("Quanto quer usar: ");
            int uso = s.nextInt();
            b.usar(uso);

            valor = b.getNivel() + nivelInicial;
            System.out.println("Bateria atualizada: " + valor);
        }
        System.out.println("");
        b.status(valor);
    }
}
