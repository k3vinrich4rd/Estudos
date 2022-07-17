package estruturaderepeticao.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Ligando para um amigo
public class LigarParaUmAmigo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repostasDoUsuario = "";
        double numeroDigitado = 0;

        List<String> ligacoesEfetuadas = new ArrayList<>();

        System.out.print("Voc� tem um telefone ou celular para efetuar uma liga��o [S]im / [N]�o: ");
        repostasDoUsuario = input.next();
        int contadorDeLigacoes = 0;


        // Estrutura de repeti��o:
        do {

            //Estruturas de condi��o:
            if (repostasDoUsuario.equalsIgnoreCase("s")) {
                System.out.print("Digite o n�mero: "); // n�mero que vai ser informado
                numeroDigitado = input.nextDouble();
                //Estruturas de condi��o:
                if (numeroDigitado < 0) {
                    System.out.println("N�mero inv�lido informe um n�mero com 11 digitos");

                }
                //Estruturas de condi��o:
            } else {
                System.out.print("Tenha um celular ou n�mero de telefone para efetuar uma liga��o\n " +
                        "\nVoc� j� tem um celular ou n�mero? [S]im / [N]�o:  ");  // texto de intera��o
                repostasDoUsuario = input.next();
                //Estruturas de condi��o:
                if (repostasDoUsuario.equalsIgnoreCase("s")) ;
                System.out.print("Digite um n�mero: ");
                numeroDigitado = input.nextDouble();
            }

            System.out.print("A pessoa que voc� ligou te atendeu [S]im / [N]�o: ");  // texto de intera��o
            repostasDoUsuario = input.next();
            //Estruturas de condi��o:
            if (repostasDoUsuario.equalsIgnoreCase("s")) {
                ligacoesEfetuadas.add("s");
                contadorDeLigacoes += 1;
                System.out.println("Que bom, voc� efetuou a sua liga��o");  // texto de intera��o
                //Estruturas de condi��o:
            } else {
                System.out.println("Que pena... talvez o n�mero esteja ocupado, tente novamente");
                ligacoesEfetuadas.add("n");
                // texto de intera��o

            }

            System.out.print("Voc� deseja fazer mais alguma liga��o? "); // texto de intera��o

            repostasDoUsuario = input.next();
            //Estrutura de repeti��o:
        } while (repostasDoUsuario.equalsIgnoreCase("s"));

        for (String ligacoes : ligacoesEfetuadas)
            System.out.println(ligacoes);
        System.out.println("Quantidade de liga��es feitas " + contadorDeLigacoes);
        System.out.println("Fechando o programa...");


    }

}













