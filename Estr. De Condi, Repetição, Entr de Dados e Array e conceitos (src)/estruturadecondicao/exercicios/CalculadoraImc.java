package estruturadecondicao.exercicios;
import java.util.Scanner;
// Calculando o imc:
public class CalculadoraImc {
    // C�digo feito em aula

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu peso em kg: ");
        double peso = input.nextDouble();
        System.out.print("Digite sua altura em metros: ");
        double altura = input.nextDouble();
        input.close();

        double imc = peso / (altura * altura);
        System.out.printf("Seu imc �: %.2f", imc);
    }
}
