package estruturadecondicao.exercicios;
import java.util.Scanner;
public class CalculadoraSalarioMinimo {
    // calculadora.Calculadora de sal�rio minimo
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do seu sal�rio: ");
        double salario = input.nextDouble();
        input.close();

        double salarioMinimo = 1212;
        double qtdSalarioMinimo = salario / salarioMinimo;

        System.out.printf("Voc� ganha %.1f de sal�rios m�nimos em 2022", qtdSalarioMinimo);
    }
}
