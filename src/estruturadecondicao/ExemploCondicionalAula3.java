package estruturadecondicao;

import java.util.Scanner;

public class ExemploCondicionalAula3 {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        System.out.print("Digite a op��o desejada (1 ou 2): ");
        int opcao2 = input2.nextInt();


        if (opcao2 == 1) {
            System.out.println("Sua op��o foi n�mero 1");
        } else if (opcao2 == 2) {

            System.out.println("Sua op��o foi n�mero 2");
        } else {
            System.out.println("Op��o inv�lida, digite novamente.");
        }
    }
}
