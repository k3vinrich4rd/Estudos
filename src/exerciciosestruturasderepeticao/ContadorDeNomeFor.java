package exerciciosestruturasderepeticao;
// Exerc�cio Web: Leia o nome um n�mero do usu�rio um n�mero N
// e escreva o nome dela(e) tela N vezes.

import java.util.Scanner;
// Utilizando o for
public class ContadorDeNomeFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome;
        nome = entrada.nextLine();
        System.out.print("Digite um n�mero: ");
        int numero = entrada.nextInt();
        // no caso deste exerc�cio o contador se inicia no 0
        // por conta que ele esta contando e n�o somando
        for (int contador = 0; contador <= numero; contador++) {
            System.out.println(nome);

        }

    }

}

