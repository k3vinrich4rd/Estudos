package estruturaderepeticao.exercicios;

import java.util.Scanner;

public class ContadorBasico3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respostaDigitadas = "";



        do {

            System.out.print("Digite a sua idade: ");
            int idade = entrada.nextInt();

            if (idade <= 15) {
                System.out.println("Voc� � menor de idade");
            }
            System.out.println("Voc� ainda quer que a contagem continue? Sim ou N�o: ");
            String respostaDigitada = entrada.next();
        } while (respostaDigitadas.equalsIgnoreCase("Sim"));


    }
}
