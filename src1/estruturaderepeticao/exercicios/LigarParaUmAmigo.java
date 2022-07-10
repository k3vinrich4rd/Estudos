package estruturaderepeticao.exercicios;

import java.util.Scanner;

//Ligando para um amigo
public class LigarParaUmAmigo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repostasDoUsuario = "";
        double numeroDigitado = 0;

        System.out.print("Voc� tem um celular ou um n�mero desejado, para efetuar a liga��o? [S]im / N[�o]: ");
        String respostaDoUsuario = input.next();

        do {

            if (respostaDoUsuario.equalsIgnoreCase("s")) {
                System.out.print("Digite o n�mero: ");
                numeroDigitado = input.nextDouble();
                if (numeroDigitado < 0) {
                    System.out.println("N�mero inv�lido informe um n�mero com 11 digitos");
                    break;
                }
            }else {
                System.out.println("Tenha um celular ou n�mero de telefone para efetuar uma liga��o. ");
                break;
            }

            System.out.print("A pessoa que voc� ligou te atendeu [S]im / [N]�o: ");
            respostaDoUsuario = input.next();
            if (respostaDoUsuario.equalsIgnoreCase("s")) {
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












