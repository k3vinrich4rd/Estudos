package estruturaderepeticao.exercicios;
// Utilizando estrutura de repeti��o (do while):

import java.util.Scanner;

public class ContadorBasico3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respostaDigitadas = "";
        int iadade = 0;

        System.out.print("Quer saber se voc� � menor ou maior de idade? [S]im / [N]�o: ");
        respostaDigitadas = entrada.next();
        do {
            if (respostaDigitadas.equalsIgnoreCase("s")){
                System.out.print("Informe a sua idade: ");
                iadade = entrada.nextInt();
                if (iadade < 18) {
                    System.out.println("Voc� � menor de idade");
                }else {
                    System.out.println("Voc� � maior de idade");
                }
            }else {
                System.out.println("Ok, talvez outra hora");
                break;
            }
            System.out.print("Quer verificar mais alguma idade [S]im / [N]�o ");
            respostaDigitadas = entrada.next();
        }while (respostaDigitadas.equalsIgnoreCase("s"));
        System.out.println("Fechando o programa... ");


    }
}
