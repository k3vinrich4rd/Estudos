package array.exercicios;
// Declarando uma array e fazendo um c�digo de m�dia
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double notas [] = new double[4]; // Tamanho do array // new = atribui��o de tamanho
        System.out.print("Digite a sua primeira notas: ");
        notas[0] = input.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        notas[1] = input.nextDouble();
        System.out.print("Digite a sua terceira nota: ");
        notas[2] = input.nextDouble();
        System.out.print("Digite a sua quarta nota: ");
        notas[3] = input.nextDouble();
        input.close();

        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.printf("A m�dia da suas notas �: %.2f " ,media);
    }
}
