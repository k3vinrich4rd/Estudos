package estruturaderepeticao.exercicios;
// Exerc�cio Web: Escreva um algoritmo que leia 10 n�meros do usu�rio e calcule a soma desses
//n�meros.
import java.util.Scanner;

public class SomaDeNumerosFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite 10, para calcular a soma de 10 n�meros: ");
        int numeros = entrada.nextInt();

        int valor = 0;
        int soma = 0;
        // Estrutura de repeti��o:
        for (int contador = 0; contador < numeros; contador++) { // liga��o de contador com n�meros
            Scanner entrada1 = new Scanner(System.in);
            System.out.print("Digite o " + (contador + 1)  + "� n�mero: ");
            valor = entrada.nextInt();
            soma += valor;
        }
        System.out.println("O resultado da soma dos n�meros �: " + soma);


    }
}
