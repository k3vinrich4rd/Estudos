package estruturaderepeticao.exercicios;
//Utilizando um loop while (enquanto) com estrutura de condi��o (if) se:
import java.util.Scanner;

public class LigandoParaUmAmigoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Vai ler os dados de entrada:
        String respostaDoUsuario; // Vari�vel que vai receber o conjunto de caracteres
        double numeroDigitado;
        System.out.print("Voc� deseja fazer uma liga��o? [S]im / [N]�o: "); // texto de intera��o
        respostaDoUsuario = input.next();
        while (respostaDoUsuario.equalsIgnoreCase("s")) { //Estrutura de repeti��o
            System.out.print("Digite um n�mero: ");
            numeroDigitado = input.nextDouble();
            System.out.print("A pessoa que voc� ligou te atendeu? [S]im / [N]�o: "); // texto de intera��o
            respostaDoUsuario = input.next(); // Vari�vel que vai receber o conjunto de caracteres
            if (respostaDoUsuario.equalsIgnoreCase("s")) {
                System.out.println("Que bom voc� efetuou uma liga��o");
            }else {
                System.out.println("Que pena, talvez o n�mero esteja ocupado");
            }
            System.out.print("Voc� deseja fazer mais alguma liga��o? [S]im / [N]�o: ");
            // Vari�vel que vai receber o conjunto de caracteres
            respostaDoUsuario = input.next();
        }
        System.out.println("ok, fechando o programa...");

            }
        }


