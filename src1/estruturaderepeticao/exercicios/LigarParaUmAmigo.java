package estruturaderepeticao.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

//Ligando para um amigo
public class LigarParaUmAmigo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repostasDoUsuario = "";
        double numeroDigitado = 0;
        ;

        System.out.print("Voc� tem um telefone ou celular para efetuar uma liga��o [S]im / [N]�o: ");
        repostasDoUsuario = input.next();


        do {

            if (repostasDoUsuario.equalsIgnoreCase("s")) {
                System.out.print("Digite o n�mero: ");
                numeroDigitado = input.nextDouble();
                if (numeroDigitado < 0) {
                    System.out.println("N�mero inv�lido informe um n�mero com 11 digitos");

                }
            } else {
                System.out.print("Tenha um celular ou n�mero de telefone para efetuar uma liga��o\n " +
                        "\nVoc� j� tem um n�mero? [S]im / [N]�o:  ");
                repostasDoUsuario = input.next();
                if (repostasDoUsuario.equalsIgnoreCase("s")) ;
                System.out.print("Digite um n�mero: ");
                numeroDigitado = input.nextDouble();
            }

            System.out.print("A pessoa que voc� ligou te atendeu [S]im / [N]�o: ");
            repostasDoUsuario = input.next();
            if (repostasDoUsuario.equalsIgnoreCase("s")) {
                System.out.println("Que bom, voc� efetuou a sua liga��o");
            } else {
                System.out.println("Que pena... talvez o n�mero esteja ocupado, tente novamente");

            }

            System.out.print("Voc� deseja fazer mais alguma liga��o? ");
            repostasDoUsuario = input.next();
        } while (repostasDoUsuario.equalsIgnoreCase("s"));
        System.out.println("Fechando o programa...");
        

    }

}













