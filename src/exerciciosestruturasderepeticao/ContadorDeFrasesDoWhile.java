package exerciciosestruturasderepeticao;

import java.util.Scanner;

public class ContadorDeFrasesDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um n�mero: ");
        int numero = entrada.nextInt();
        entrada.close();

        int contador = 1;

        do {
            System.out.println(contador + " Kevin lindo");
            contador++;
        } while (contador <= numero);
        {


        }
    }
}