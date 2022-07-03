package estruturadecondicao;

import java.util.Scanner;

public class ExemploCondicionalAula2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite (s)sim ou (n)n�o: ");
        String opcao = input.next();

        //equals (� igual a) verifica e compara se foi o que o usu�rio digitou para exibir uma mensagem
        // Ou fazer uma a��o predeterminada
        if (opcao.equalsIgnoreCase("n�o")) {
            System.out.println("Sua op��o foi n�o");
        } else if (opcao.equals("s")) {
            // O ignoreCase ignora se a letra � mai�scula ou min�scula, ele valida os dois
            System.out.println("Sua op��o foi sim");
        } else {
            System.out.println("Op��o inv�lida, tente novamente.");
        }


    }
}
