package estruturaderepeticao.exercicios;

import java.util.Scanner;

public class LigandoParaUmAmigoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String respostaDoUsuario;
        double numeroDigitado;
        System.out.print("Voc� deseja fazer uma liga��o? [S]im / [N]�o: ");
        respostaDoUsuario = input.next();
        while (respostaDoUsuario.equalsIgnoreCase("s")) {
            System.out.print("Digite um n�mero: ");
            numeroDigitado = input.nextDouble();
            System.out.print("A pessoa que voc� ligou te atendeu? [S]im / [N]�o: ");
            respostaDoUsuario = input.next();
            if (respostaDoUsuario.equalsIgnoreCase("s")) {
                System.out.println("Que bom voc� efetuou uma liga��o");
            }else {
                System.out.println("Que pena, talvez o n�mero esteja ocupado");
            }
            System.out.print("Voc� deseja fazer mais alguma liga��o? [S]im / [N]�o: ");
            respostaDoUsuario = input.next();
        }
        System.out.println("ok, fechando o programa...");

            }
        }


