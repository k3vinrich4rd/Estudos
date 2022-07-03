package estruturadecondicao.exercicios;

/* Utilizando a estrutura condicional switch (trocar, alternar e interruptor)
Para informar os dias da da semana para o usu�rio.
 */
import java.util.Scanner;

public class DiasDaSemana2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um n�mero de 1 a 7, para saber se � dia �til ou final de semana: ");
        int diasDaSemana = entrada.nextInt();
        entrada.close();
        // Segunda forma de se utilizar o switch
        switch (diasDaSemana) {
            case 1 -> System.out.print("1 - Domingo");
            case 2 -> System.out.print("2 - Segunda Feira");
            case 3 -> System.out.print("3 - Ter�a Feira");
            case 4 -> System.out.print("4 - Quarta Feira");
            case 5 -> System.out.print("5 - Quinta Feira");
            case 6 -> System.out.print("6 - Sexta Feira");
            case 7 -> System.out.print("7 - S�bado");
            default -> System.out.print("N�mero inv�lido");

            }
        }
    }
